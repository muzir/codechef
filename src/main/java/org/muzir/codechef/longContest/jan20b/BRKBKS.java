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
		validateParams(params);
		int sumOfBricksWidth = 0;
		for (int i = 1; i < params.length; i++) {
			sumOfBricksWidth += params[i];
		}
		int division = sumOfBricksWidth / s;
		if (sumOfBricksWidth % s == 0) {
			return division;
		}
		return division + 1;
	}

	private static void validateParams(int[] params) {
		int s = params[0];
		int maxOfTheSequence = 0;
		for (int i = 1; i < params.length; i++) {
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
}
