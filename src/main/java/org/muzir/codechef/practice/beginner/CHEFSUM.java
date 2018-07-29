package org.muzir.codechef.practice.beginner;

import java.io.*;

public class CHEFSUM {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String line = br.readLine();
			System.out.println(returnMinIndex(line));
		}
		br.close();
	}

	static int returnMinIndex(String input) {
		String[] sArray = input.split(" ");
		int lenght = sArray.length;
		int minValue = Integer.parseInt(sArray[0]);
		int minIndex = 1;
		for (int i = 0; i < lenght; i++) {
			int k = Integer.parseInt(sArray[i]);
			if (k < minValue) {
				minValue = k;
				minIndex = i + 1;
			}
		}
		return minIndex;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHEFSUM.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
