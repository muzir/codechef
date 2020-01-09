package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MSNSADM1 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String goals = br.readLine();
			String fouls = br.readLine();
			System.out.println(solution(goals, fouls));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MSNSADM1.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(String goals, String fouls) {
		int[] goalValues = Arrays.stream(goals.split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] foulsValues = Arrays.stream(fouls.split(" ")).mapToInt(Integer::parseInt).toArray();
		int maxScore = 0;
		for (int i = 0; i < goalValues.length; i++) {
			int goalValue = goalValues[i];
			int foulValue = foulsValues[i];
			int score = (goalValue * 20) - (foulValue * 10);
			score = score < 0 ? 0 : score;
			maxScore = Math.max(maxScore, score);
		}
		return maxScore;
	}
}
