package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RPD {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String sequence = br.readLine();
			System.out.println(solution(sequence));
		}
		br.close();
	}

	static int solution(String sequence) {
		int[] params = Arrays.stream(sequence.split(" ")).mapToInt(Integer::parseInt).toArray();
		int length = params.length;
		int maxDigitSum = 0;
		for (int i = 0; i < length; i++) {
			int firstElement = params[i];
			for (int j = i + 1; j < length; j++) {
				int secondElement = params[j];
				int totalProduct = firstElement * secondElement;
				int digitSum = calculateDigitSum(totalProduct);
				maxDigitSum = Math.max(maxDigitSum, digitSum);
			}
		}
		return maxDigitSum;
	}

	private static int calculateDigitSum(int number) {
		int digitSum = 0;
		char[] digits = String.valueOf(number).toCharArray();
		for (char c : digits) {
			digitSum += Integer.parseInt(String.valueOf(c));
		}
		return digitSum;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/RPD.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
