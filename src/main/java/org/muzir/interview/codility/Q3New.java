package org.muzir.interview.codility;

public class Q3New {
	int elevatorPopulation = 0;
	int elevatorTotalWeight = 0;

	public int solution(int[] personWeights, int[] personTargetFloors, int maxFloor, int maxPersonCount,
			int maxWeight) {
		if (personTargetFloors == null || personTargetFloors.length == 0) {
			return 0;
		}
		if (personWeights == null || personWeights.length == 0) {
			return 0;
		}
		if (maxFloor == 0 || maxPersonCount == 0 || maxWeight == 0) {
			return 0;
		}
		int totalStops = 0;
		int i = 0;
		while (i < personWeights.length) {
			int pWeights = personWeights[i];
			int doormanCode = isDoormanAllowed(pWeights, maxPersonCount, maxWeight);
			switch (doormanCode) {
			case 1:
				elevatorPopulation++;
				i++;
				break;
			case 2:
				totalStops = totalStops + calculateElevatorStops(elevatorPopulation);
				break;
			case 3:
				i++;
				break;
			default:
				break;
			}
		}
		totalStops = totalStops + calculateElevatorStops(elevatorPopulation);
		return totalStops;
	}

	private int isDoormanAllowed(int pWeights, int maxPersonCount, int maxWeight) {
		if (isPersonTargetNotExist() || isPersonWeightExceedMaxWeight(pWeights, maxWeight)) {
			return 3;
		}
		elevatorTotalWeight = elevatorTotalWeight + pWeights;
		boolean isWeightLimit = isWeightLimitExceed(elevatorTotalWeight, maxWeight);
		boolean isPersonalLimit = isPersonLimitExceed(elevatorPopulation, maxPersonCount);
		if (isPersonalLimit || isWeightLimit) {
			return 2;
		}
		return 1;
	}

	private boolean isPersonWeightExceedMaxWeight(int pWeight, int maxWeight) {
		if (pWeight > maxWeight) {
			return true;
		}
		return false;
	}

	private boolean isPersonTargetNotExist() {
		return false;
	}

	private int calculateElevatorStops(int totalCountInElevator) {
		resetElevatorCounter();
		if (totalCountInElevator == 0) {
			return 0;
		}
		return totalCountInElevator + 1;
	}

	private boolean isWeightLimitExceed(int totalWeightInElevator, int maxWeight) {
		if (totalWeightInElevator > maxWeight) {
			return true;
		}
		return false;
	}

	private boolean isPersonLimitExceed(int totalCountInElevator, int maxPersonCount) {
		if (totalCountInElevator == maxPersonCount) {
			return true;
		}
		return false;
	}

	private void resetElevatorCounter() {
		elevatorTotalWeight = 0;
		elevatorPopulation = 0;
	}

}
