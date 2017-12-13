package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class LOSTMAX {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(findLostMax(br.readLine()));
		}
		br.close();
	}

	static int findLostMax(String s) {
		int[] orderedArray = mapOrderedArray(s);
		int lenght = orderedArray.length;
		int max = orderedArray[lenght - 1];
		if (max == lenght - 1) {
			max = orderedArray[lenght - 2];
		}
		return max;
	}

	private static int[] mapOrderedArray(String s) {
		int[] orderedArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(orderedArray);
		return orderedArray;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/LOSTMAX.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
