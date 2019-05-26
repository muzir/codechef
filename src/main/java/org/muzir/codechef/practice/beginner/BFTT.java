package org.muzir.codechef.practice.beginner;

import java.io.*;

public class BFTT {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String param = br.readLine();
			System.out.println(solution(param));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/BFTT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(String param) {
		if (Integer.parseInt(param) < 333) {
			return 333;
		}
		int n = param.length();
		if (n == 3) {
			return 1333;
		}
		int newParam = 0;
		int tempParam = Integer.parseInt(param);
		while (true) {
			newParam = increaseOne(tempParam);
			int threeDigitCounter = calculateThreeDigitCount(String.valueOf(newParam));
			if (threeDigitCounter >= 3) {
				break;
			}
			tempParam = newParam;
		}
		return newParam;
	}

	private static int calculateThreeDigitCount(String param) {
		char[] digits = param.toCharArray();
		int counter = 0;
		for (char c : digits) {
			if (c == '3') {
				counter++;
			}
		}
		return counter;
	}

	private static int increaseOne(int param) {
		param = param + 1;
		return param;
	}
}
