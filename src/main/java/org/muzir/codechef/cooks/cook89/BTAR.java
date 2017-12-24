package org.muzir.codechef.cooks.cook89;

import java.io.*;

public class BTAR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			System.out.println(calculateMinSteps(br.readLine()));
		}
		br.close();
	}

	static int calculateMinSteps(String s) {
		String[] sArray = s.split(" ");
		int length = sArray.length;
		int acc = 0;
		int oneCounter = 0;
		int twoCounter = 0;
		int threeCounter = 0;
		for (int i = 0; i < length; i++) {
			int value = Integer.parseInt(sArray[i]);
			int modulo = value % 4;
			if (modulo > 0) {
				switch (modulo) {
					case 1:
						oneCounter = oneCounter + 1;
						break;
					case 2:
						twoCounter = twoCounter + 1;
						break;
					case 3:
						threeCounter = threeCounter + 1;
						break;
				}
				acc = acc + modulo;
			}
		}
		if ((acc % 4) != 0) {
			return -1;
		}
		return calculateSteps(oneCounter, twoCounter, threeCounter);
	}

	private static int calculateSteps(int oneCounter, int twoCounter, int threeCounter) {
		int acc = 0;
		acc = acc + threeCounter;
		oneCounter = oneCounter - threeCounter;
		if (oneCounter > 0) {
			acc = acc + (oneCounter / 2);
		}
		twoCounter = twoCounter + (oneCounter / 2);
		if (twoCounter > 0) {
			acc = acc + (twoCounter / 2);
		}
		return acc;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/BTAR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
