package org.muzir.codechef.practice.beginner;

import java.io.*;

public class GOODSET {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(createGoodSet(n));
		}
		br.close();
	}

	static String createGoodSet(int n) {
		if (n == 1) {
			return "1";
		}
		if (n == 2) {
			return "1 2";
		}
		if (n == 3) {
			return "1 2 4";
		}
		StringBuilder baseSet = new StringBuilder("1 2 4");
		int lastIndex = 4;
		for (int i = 3; i < n; i++) {
			baseSet.append(" ");
			lastIndex = lastIndex + 3;
			baseSet.append(lastIndex);
		}
		return baseSet.toString();
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/GOODSET.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
