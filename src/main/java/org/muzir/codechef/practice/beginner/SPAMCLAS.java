package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class SPAMCLAS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nMinXMax = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			int n = nMinXMax[0];
			int minX = nMinXMax[1];
			int maxX = nMinXMax[2];

			int[] ws = new int[n];
			int[] bs = new int[n];
			for (int j = 0; j < n; j++) {
				int[] wbs = Arrays.stream(br.readLine().split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();
				ws[j] = wbs[0];
				bs[j] = wbs[1];
			}
			System.out.println(calculateSpamNumbers(minX, maxX, ws, bs));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/SPAMCLAS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String calculateSpamNumbers(int minX, int maxX, int[] ws, int[] bs) {
		int spammerCounter = 0;
		int nonSpammerCounter = 0;
		int lenght = ws.length;
		boolean isXEven = isEven(minX);
		for (int i = 0; i < lenght; i++) {
			if (isEven(isXEven, ws[i], bs[i])) {
				nonSpammerCounter++;
				isXEven = true;
			} else {
				spammerCounter++;
				isXEven = false;
			}
		}
		int total = (maxX - minX) + 1;

		StringBuilder sb = new StringBuilder();
		sb.append(nonSpammerCounter).append(" ").append(spammerCounter);
		return sb.toString();
	}

	static boolean isEven(boolean isXEven, int w, int b) {
		boolean isWEven = isEven(w);
		boolean isBEven = isEven(b);

		if ((isXEven || isWEven) && isBEven) {
			return true;
		}
		if ((!isXEven && !isWEven) && !isBEven) {
			return true;
		}
		return false;
	}

	private static boolean isEven(int i) {
		return (i % 2) == 0;
	}
}
