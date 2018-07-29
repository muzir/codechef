package org.muzir.codechef.practice.beginner;

import java.io.*;

public class TWONMS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String nr = br.readLine();
			String[] nrArray = nr.split(" ");
			int a = Integer.parseInt(nrArray[0]);
			int b = Integer.parseInt(nrArray[1]);
			int numberOfTurn = Integer.parseInt(nrArray[2]);
			System.out.println(calculateIntegerDivision(a, b, numberOfTurn));
		}
		br.close();
	}

	static int calculateIntegerDivision(int a, int b, int numberOfTurn) {
		if (isOdd(numberOfTurn)) {
			a = a * 2;
		}
		int maxValue = Math.max(a, b);
		int minValue = Math.min(a, b);
		return maxValue / minValue;
	}

	private static boolean isOdd(int numberOfTurn) {
		return numberOfTurn % 2 == 1;
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/TWONMS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
