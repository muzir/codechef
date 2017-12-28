package org.muzir.codechef.practice.beginner;

import java.io.*;

public class BUGCAL {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String line = br.readLine();
			String[] numberArray = line.split(" ");
			String aNumber = numberArray[0];
			String bNumber = numberArray[1];
			System.out.println(calculateBugyCalculator(aNumber, bNumber));
		}
		br.close();
	}

	static int calculateBugyCalculator(String aNumber, String bNumber) {
		char[] aNumbers = aNumber.toCharArray();
		char[] bNumbers = bNumber.toCharArray();
		int acc = 0;
		int lenght = Math.max(aNumbers.length, bNumbers.length);
		for (int i = 0; i < lenght; i++) {
			int aDigit = getDigit(i, aNumbers);
			int bDigit = getDigit(i, bNumbers);
			int sum = aDigit + bDigit;
			if (sum >= 10) {
				acc = acc + (((int) Math.pow(10, i)) * 10);
			}
		}
		int a = Integer.parseInt(aNumber);
		int b = Integer.parseInt(bNumber);
		return a + b - acc;
	}

	private static int getDigit(int i, char[] charDigitArray) {
		int lastIndex = charDigitArray.length - 1;
		try {
			return Character.getNumericValue(charDigitArray[lastIndex - i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/BUGCAL.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
