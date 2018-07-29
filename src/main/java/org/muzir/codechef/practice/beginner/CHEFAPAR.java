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
		boolean isLate = false;
		for (int i = 0; i < length; i++) {
			int current = Integer.parseInt(lineArray[i]);
			if (current == 0) {
				acc = acc + 1000;
				isLate = true;

			}
			if (isLate) {
				acc = acc + 100;
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
			String filePath = path + "/src/main/inputs/CHEFAPAR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
