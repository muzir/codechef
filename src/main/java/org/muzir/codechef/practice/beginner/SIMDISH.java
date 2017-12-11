package org.muzir.codechef.practice.beginner;

import java.io.*;

public class SIMDISH {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String firstLine = br.readLine();
			String secondLine = br.readLine();
			String[] firstArray = firstLine.split(" ");
			String[] secondArray = secondLine.split(" ");
			System.out.println(compareSimilarity(firstArray, secondArray));
		}
		br.close();
	}

	private static String compareSimilarity(String[] firstArray, String[] secondArray) {
		int counter = 0;
		int length = secondArray.length;
		for (int i = 0; i < length; i++) {
			if (isContain(firstArray, secondArray[i])) {
				counter++;
			}
			if (counter == 2) {
				return "similar";
			}
		}
		return "dissimilar";
	}

	private static boolean isContain(String[] firstArray, String s) {
		int length = firstArray.length;
		for (int i = 0; i < length; i++) {
			if (firstArray[i].equals(s)) {
				return true;
			}
		}
		return false;
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/SIMDISH.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
