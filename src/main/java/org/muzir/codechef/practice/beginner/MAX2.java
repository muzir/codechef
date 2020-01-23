package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MAX2 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int n = Integer.parseInt(br.readLine());
		String binaryString = br.readLine();
		System.out.println(solution(binaryString));
		br.close();
	}

	static int solution(String binaryString) {
		int decimalValue = calculateDecimalFromBinary(binaryString);
		return calculateHighestPowerOfTwo(decimalValue);
	}

	private static int calculateHighestPowerOfTwo(int decimalValue) {
		int highestPower = 0;
		while (true) {
			if (decimalValue % (int) Math.pow(2, highestPower) == 0) {
				highestPower++;
			} else {
				break;
			}
		}
		return highestPower;
	}

	private static int calculateDecimalFromBinary(String binaryString) {
		int total = 0;
		char[] binaryCharArray = binaryString.toCharArray();
		int length = binaryCharArray.length;
		for (int i = length - 1; i >= 0; i--) {
			char c = binaryCharArray[i];
			int currentDigitValueInDecimal = 0;
			if (c == '1') {
				currentDigitValueInDecimal = (int) Math.pow(2, length-1-i);
			}
			total += currentDigitValueInDecimal;
		}
		return total;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MAX2.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
