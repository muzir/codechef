package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ISITCAKE {
	private static final String YES = "yes";
	private static final String NO = "no";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[][] timeMatrix = new int[10][10];
			for (int j = 0; j < 10; j++) {
				int[] timeLine = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				timeMatrix[j] = timeLine;
			}
			System.out.println(solution(timeMatrix));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ISITCAKE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(int[][] timeMatrix) {
		int timeCounter = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int time = timeMatrix[i][j];
				if (time <= 30) {
					timeCounter++;
				}
			}
		}
		return timeCounter >= 60 ? YES : NO;
	}
}
