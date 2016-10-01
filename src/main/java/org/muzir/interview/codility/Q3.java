package org.muzir.interview.codility;

public class Q3 {
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
		int totalCountInElevator = 0;
		int totalWeightInElevator = 0;
		int totalStops = 0;
		for (int i = 0; i < personWeights.length; i++) {
			int pWeights = personWeights[i];
			totalWeightInElevator = totalWeightInElevator + pWeights;
			totalCountInElevator++;
			if (isPersonLimitExceed(totalCountInElevator, maxPersonCount)) {
				totalStops = totalStops + moveElevator(totalCountInElevator);
				totalWeightInElevator = 0;
				totalCountInElevator = 0;

			} else if (isWeightLimitExceed(totalWeightInElevator, maxWeight)) {
				totalStops = totalStops + moveElevator(totalCountInElevator);
				totalWeightInElevator = 0;
				totalCountInElevator = 0;

			}
			if (i == personWeights.length - 1) {
				moveElevator(totalCountInElevator);
				totalWeightInElevator = 0;
				totalCountInElevator = 0;
			}
		}
		return totalStops;
	}

	private int moveElevator(int totalCountInElevator) {
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

}
