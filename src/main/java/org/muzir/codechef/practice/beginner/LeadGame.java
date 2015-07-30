package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Round implements Comparable {
	private int playerOneScore;
	private int playerTwoScore;
	private int playerOneAccumulator;
	private int playerTwoAccumulator;
	private int roundWinner;
	private int maxLead;

	public Round(Round r) {
		this.playerOneScore = r.getPlayerOneScore();
		this.playerTwoScore = r.getPlayerTwoScore();
		this.playerOneAccumulator = r.getPlayerOneAccumulator();
		this.playerTwoAccumulator = r.getPlayerTwoAccumulator();
		this.roundWinner = r.getRoundWinner();
		this.maxLead = r.getMaxLead();
	}

	public Round() {
	}

	public int getPlayerOneAccumulator() {
		return playerOneAccumulator;
	}

	public void setPlayerOneAccumulator(int playerOneAccumulator) {
		this.playerOneAccumulator = playerOneAccumulator;
	}

	public int getPlayerTwoAccumulator() {
		return playerTwoAccumulator;
	}

	public void setPlayerTwoAccumulator(int playerTwoAccumulator) {
		this.playerTwoAccumulator = playerTwoAccumulator;
	}

	public int getPlayerOneScore() {
		return playerOneScore;
	}

	public void setPlayerOneScore(int playerOneScore) {
		this.playerOneScore = playerOneScore;
	}

	public int getPlayerTwoScore() {
		return playerTwoScore;
	}

	public void setPlayerTwoScore(int playerTwoScore) {
		this.playerTwoScore = playerTwoScore;
	}

	public int getRoundWinner() {
		return roundWinner;
	}

	public void setRoundWinner(int roundWinner) {
		this.roundWinner = roundWinner;
	}

	public int getMaxLead() {
		return maxLead;
	}

	public void setMaxLead(int maxLead) {
		this.maxLead = maxLead;
	}

	public int getCurrentWinner() {
		if (playerOneAccumulator == playerTwoAccumulator) {
			return 0;
		}
		if (playerOneAccumulator > playerTwoAccumulator) {
			return 1;
		}
		return 2;
	}

	public int getRoundMaxLead() {
		return Math.abs(playerOneAccumulator - playerTwoAccumulator);
	}

	public String toString() {
		return roundWinner + "  " + maxLead;
	}

	public int compareTo(Object o2) {
		Round round2 = (Round) o2;
		if (this.maxLead == round2.maxLead) {
			return 0;
		}
		if (this.maxLead > round2.maxLead) {
			return -1;
		}
		return 1;
	}
}

class PlayerMaxLead {
	private int playerOneMaxLead;
	private int playerTwoMaxLead;

	public int getMaxLead(int playerIndexId) {
		if (playerIndexId == 1) {
			return playerOneMaxLead;
		}
		return playerTwoMaxLead;
	}

	public int getWinner() {
		boolean isWinner = playerOneMaxLead > playerTwoMaxLead ? true : false;
		if (isWinner) {
			return 1;
		}
		return 2;
	}

	public void assignPlayerOneMaxLead(int newMaxLead) {
		playerOneMaxLead = playerOneMaxLead + newMaxLead;
	}

	public void assignPlayerTwoMaxLead(int newMaxLead) {
		if (newMaxLead > playerTwoMaxLead) {
			playerTwoMaxLead = newMaxLead;
		}
	}
}

class LeadingGame {
	private InputStream input;
	private PlayerMaxLead playerMaxLead = new PlayerMaxLead();

	public void setInput(InputStream in) {
		input = in;
	}

	public void readRoundData() throws NumberFormatException, IOException {
		if (input == null) {
			throw new IllegalArgumentException("Please give an input first");
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		int countOfRound = Integer.parseInt(reader.readLine());
		List<Round> roundList = new ArrayList<Round>(countOfRound);
		Round round = new Round();
		for (int i = 0; i < countOfRound; i++) {
			round = getRoundFromLine(round, reader.readLine());
			calculateRoundAcc(round);
			Round copyRound = new Round(round);
			roundList.add(copyRound);
		}
		reader.close();
		Collections.sort(roundList);
		System.out.println(roundList.get(0).toString());
		// for (Round r : roundList) {
		// System.out.println(r.toString());
		// }
	}

	private void calculateRoundAcc(Round round) {
		int playerOneAcc = round.getPlayerOneAccumulator();
		int playerTwoAcc = round.getPlayerTwoAccumulator();
		playerOneAcc = playerOneAcc + round.getPlayerOneScore();
		playerTwoAcc = playerTwoAcc + round.getPlayerTwoScore();
		round.setPlayerOneAccumulator(playerOneAcc);
		round.setPlayerTwoAccumulator(playerTwoAcc);
		int roundWinner = round.getCurrentWinner();
		round.setRoundWinner(roundWinner);
		round.setMaxLead(round.getRoundMaxLead());

	}

	private Round getRoundFromLine(Round round, String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		int playerOneScore = Integer.parseInt(tokenizer.nextToken());
		int playerTwoScore = Integer.parseInt(tokenizer.nextToken());
		round.setPlayerOneScore(playerOneScore);
		round.setPlayerTwoScore(playerTwoScore);
		return round;
	}

	public PlayerMaxLead getPlayerMaxLead() {
		return playerMaxLead;
	}
}

public class LeadGame {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		String filePath = System.getProperty("user.dir");
		InputStream in = new FileInputStream(filePath + "/TLG.txt");
		LeadingGame leadingGame = new LeadingGame();
		leadingGame.setInput(in);
		leadingGame.readRoundData();
	}
}
