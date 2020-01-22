package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BIT2A {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String parameters = br.readLine();
			System.out.println(solution1(parameters));
		}
		br.close();
	}

	static String solution(String parameters) {
		int greaterCounter = 0;
		int[] sortedArray = Arrays.stream(parameters.split(" ")).mapToInt(Integer::parseInt).toArray();
		int length = sortedArray.length;
		int[] strictlyGreaterArray = new int[length];
		for (int i = 0; i < length; i++) {
			greaterCounter = 0;
			int currentValue = sortedArray[i];
			for (int j = i + 1; j < length; j++) {
				int nextValue = sortedArray[j];
				if (nextValue > currentValue) {
					greaterCounter++;
				} else {
					break;
				}
			}
			strictlyGreaterArray[i] = greaterCounter;
		}
		String result = Arrays.stream(strictlyGreaterArray).mapToObj(String::valueOf).collect(Collectors.joining(" "));
		return result;
	}

	static String solution1(String parameters) {
		int[] sortedArray = Arrays.stream(parameters.split(" ")).mapToInt(Integer::parseInt).toArray();
		int length = sortedArray.length;
		int[] strictlyGreaterArray = new int[length];
		for (int i = 0; i < length; i++) {
			int currentValue = sortedArray[i];
			if (i == length - 1) {
				strictlyGreaterArray[i] = 0;
			} else {
				int nextValue = sortedArray[i + 1];
				if (currentValue == nextValue) {
					strictlyGreaterArray[i] = 0;
				} else {
					strictlyGreaterArray[i] = (length - 1) - i;
				}
			}
		}
		String result = Arrays.stream(strictlyGreaterArray).mapToObj(String::valueOf).collect(Collectors.joining(" "));
		return result;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/BIT2A.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
