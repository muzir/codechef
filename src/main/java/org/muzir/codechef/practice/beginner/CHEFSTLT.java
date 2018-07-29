package org.muzir.codechef.practice.beginner;

import java.io.*;

public class CHEFSTLT {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String param1 = br.readLine();
			String param2 = br.readLine();
			System.out.println(calculateDifference(param1, param2));
		}
		br.close();
	}

	static String calculateDifference(String param1, String param2) {
		Difference d = new Difference();
		char[] chars1 = param1.toCharArray();
		char[] chars2 = param2.toCharArray();
		int length = chars1.length;
		for (int i = 0; i < length; i++) {
			char c1 = chars1[i];
			char c2 = chars2[i];
			if (c1 == '?' || c2 == '?') {
				d.increaseMaxDifference();

			} else if (c1 != c2) {
				d.increaseMaxDifference();
				d.increaseMinDifference();
			}
		}
		return d.toString();
	}

	static class Difference {
		private int minDifference;
		private int maxDifference;

		void increaseMinDifference() {
			minDifference++;
		}

		void increaseMaxDifference() {
			maxDifference++;
		}

		@Override
		public String toString() {
			return minDifference + " " + maxDifference;
		}
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHEFSTLT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
