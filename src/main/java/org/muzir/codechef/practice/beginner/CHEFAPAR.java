package org.muzir.codechef.practice.beginner;

import java.io.*;

public class CHEFAPAR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			System.out.println(calculateDues(br.readLine()));
		}
		br.close();
	}

	static int calculateDues(String s) {
		String[] lineArray = s.split(" ");
		int length = lineArray.length;
		int acc = 0;
		for (int i = 0; i < length; i++) {
			int current = Integer.parseInt(lineArray[i]);
			if (current == 0) {
				acc = acc + 1100;
			}
			int leftIndex = i - 1;
			if (current == 1 && leftIndex >= 0) {
				int left = Integer.parseInt(lineArray[leftIndex]);
				if (left == 0) {
					acc = acc + 100;
				}
			}
		}
		return acc;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/CHEFAPAR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
