package org.muzir.codechef.longContest.jan20b;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BRKBKS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String line = br.readLine();
			System.out.println(solution(line));
		}
		br.close();
	}

	static int solution(String line) {
		int[] params = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
		int s = params[0];
		int[] parameters = Arrays.copyOfRange(params, 1, 4);
		validateParams(parameters, s);
		int hitCount = calculateHitCount(parameters, s);
		int reversedHitCount = calculateHitCount(reverseArray(parameters), s);
		return Math.min(hitCount, reversedHitCount);
	}

	private static int calculateHitCount(int[] paramaters, int s) {
		int hitCount = 1;
		int sumBricksWidth = 0;
		for (int i = 0; i < paramaters.length; i++) {
			sumBricksWidth += paramaters[i];
			if (s < sumBricksWidth && i == 1) {
				hitCount = hitCount + 2;
				sumBricksWidth = 0;
			} else if (s < sumBricksWidth && i == 2) {
				hitCount = hitCount + 1;
				sumBricksWidth = 0;
			}
		}
		return hitCount;
	}

	private static void validateParams(int[] params, int s) {
		int maxOfTheSequence = 0;
		for (int i = 0; i < params.length; i++) {
			maxOfTheSequence = Math.max(maxOfTheSequence, params[i]);
		}
		if (maxOfTheSequence > s) {
			throw new IllegalArgumentException("it is guaranteed that Ada can break all bricks");
		}
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/BRKBKS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	private static int[] reverseArray(int[] params) {
		int[] reversedArray = new int[params.length];
		for (int i = 0; i < params.length; i++) {
			reversedArray[params.length - 1 - i] = params[i];
		}
		return reversedArray;
	}
}
