package org.muzir.codechef.practice.beginner;

import java.io.*;

public class ADACRA {
	private static boolean isCodechefModeOn = false;
	static final char U = 'U';
	static final char D = 'D';

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(calculateMinimumStep(br.readLine()));
		}
		br.close();
	}

	static int calculateMinimumStep(String line) {
		int length = line.length();
		char prev = line.charAt(0);
		int dCounter = 0;
		int uCounter = 0;
		for (int i = 1; i < length; i++) {
			char current = line.charAt(i);
			if (prev != current) {
				if (current == U) {
					dCounter++;
				}
				if (current == D) {
					uCounter++;
				}
			}
			prev = current;
		}
		char lastChar = line.charAt(length - 1);
		if (lastChar == U) {
			uCounter++;
		} else {
			dCounter++;
		}
		return Math.min(dCounter, uCounter);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ADACRA.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
