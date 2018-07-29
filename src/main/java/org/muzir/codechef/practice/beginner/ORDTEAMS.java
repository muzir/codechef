package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ORDTEAMS {
	private static boolean isCodechefModeOn = false;
	private final static String NO = "no";
	private final static String YES = "yes";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] player1 = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			Player p1 = new Player(player1[0], player1[1], player1[2]);
			int[] player2 = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			Player p2 = new Player(player2[0], player2[1], player2[2]);
			int[] player3 = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			Player p3 = new Player(player3[0], player3[1], player3[2]);
			System.out.println(solution(p1, p2, p3));
		}
		br.close();
	}

	private static String solution(Player player1, Player player2, Player player3) {

		List<Player> players = new ArrayList<>();
		players.add(player1);
		players.add(player2);
		players.add(player3);

		int[] hardWord = {player1.hardWord, player2.hardWord, player3.hardWord};
		int[] intelligence = {player1.intelligence, player2.intelligence, player3.intelligence};
		int[] persistence = {player1.persistence, player2.persistence, player3.persistence};

		Arrays.sort(hardWord);
		Arrays.sort(intelligence);
		Arrays.sort(persistence);

		List<Player> sortedPlayers = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			Player player = new Player(hardWord[i], intelligence[i], persistence[i]);
			sortedPlayers.add(player);
			players.remove(player);
		}

		if (!players.isEmpty()) {
			return NO;
		}

		for (int i = 0; i < 2; i++) {
			if (!isObeyRule(sortedPlayers.get(i), sortedPlayers.get(i + 1))) {
				return NO;
			}
		}
		return YES;
	}

	private static boolean isObeyRule(Player player1, Player player2) {
		if ((player1.hardWord <= player2.hardWord)
				&& (player1.intelligence <= player2.intelligence)
				&& player1.persistence <= player2.persistence) {
			if ((player1.hardWord < player2.hardWord)
					|| (player1.intelligence < player2.intelligence)
					|| player1.persistence < player2.persistence) {
				return true;
			}
		}
		return false;
	}


	static class Player {
		private int hardWord;
		private int intelligence;
		private int persistence;

		Player(int hardWord, int intelligence, int persistence) {
			this.hardWord = hardWord;
			this.intelligence = intelligence;
			this.persistence = persistence;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Player player = (Player) o;
			return hardWord == player.hardWord &&
					intelligence == player.intelligence &&
					persistence == player.persistence;
		}

		@Override
		public int hashCode() {

			return Objects.hash(hardWord, intelligence, persistence);
		}
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ORDTEAMS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
