package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MAX2 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int n = Integer.parseInt(br.readLine());
		String binaryString = br.readLine();
		System.out.println(solution1(binaryString));
		br.close();
	}

	static int solution(String binaryString) {
		BigInteger decimalValue = calculateDecimalFromBinary(binaryString);
		return calculateHighestPowerOfTwo(decimalValue);
	}

	static int solution1(String binaryString) {
		int length = binaryString.length();
		char[] charArray = binaryString.toCharArray();
		int highestPower = 0;
		for (int i = length - 1; i >= 0; i--) {
			char c = charArray[i];
			if (c == '0') {
				highestPower++;
			} else {
				break;
			}
		}
		return highestPower;
	}

	private static int calculateHighestPowerOfTwo(BigInteger decimalValue) {
		int highestPower = 0;
		while (true) {
			if (decimalValue.mod(BigInteger.valueOf((long) Math.pow(2, highestPower))).compareTo(BigInteger.ZERO) == 0) {
				highestPower++;
			} else {
				highestPower--;
				break;
			}
		}
		return highestPower;
	}

	private static BigInteger calculateDecimalFromBinary(String binaryString) {
		BigInteger total = BigInteger.ZERO;
		char[] binaryCharArray = binaryString.toCharArray();
		int length = binaryCharArray.length;
		for (int i = length - 1; i >= 0; i--) {
			char c = binaryCharArray[i];
			if (c == '1') {
				total = total.add(BigInteger.valueOf(2).pow(length - 1 - i));
			}
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
