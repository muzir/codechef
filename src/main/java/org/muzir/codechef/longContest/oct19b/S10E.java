package org.muzir.codechef.longContest.oct19b;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class S10E {
	private static boolean isCodechefModeOn = false;

	private static int SLIDING_WINDOW_SIZE = 5;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			System.out.println(solution(br.readLine()));
		}
		br.close();
	}

	static int solution(String param) {
		int[] paramArray = Arrays.stream(param.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		int paramLength = paramArray.length;

		int accumulator = 1;
		int startingIndex = 0;

		for (int i = 1; i < paramLength; i++) {
			int value = paramArray[i];
			int[] slidingWindowArray = Arrays.copyOfRange(paramArray, startingIndex, i);
			//printArray(slidingWindowArray);
			//System.out.println("Value:" + value);
			if (isPriceGood(slidingWindowArray, value)) {
				accumulator = accumulator + 1;
			}
			if (slidingWindowArray.length == SLIDING_WINDOW_SIZE) {
				startingIndex = startingIndex + 1;
			}
		}
		return accumulator;
	}

	private static int getMinValue(int[] slidingWindowArray) {
		Arrays.sort(slidingWindowArray);
		return slidingWindowArray[0];
	}

	private static void printArray(int[] arrr) {
		Arrays.stream(arrr).forEach(i -> System.out.print(i + ","));
		System.out.println(" ");
	}

	private static boolean isPriceGood(int[] slidingWindowArray, int value) {
		int minValue = getMinValue(slidingWindowArray);
		return value < minValue;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/S10E.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
