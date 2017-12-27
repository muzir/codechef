package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class MATPAN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] valueArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			String s = br.readLine();
			System.out.println(calculatePangramMinCost(s, valueArray));
		}
		br.close();
	}

	static int calculatePangramMinCost(String s, int[] valueArray) {
		char[] cArray = s.toCharArray();
		int lenght = cArray.length;
		for (int i = 0; i < lenght; i++) {
			int temp = ((int) cArray[i] - 97);
			valueArray[temp] = 0;
		}
		int valueLenght = valueArray.length;
		int acc = 0;
		for (int i = 0; i < valueLenght; i++) {
			acc = acc + valueArray[i];
		}
		return acc;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/MATPAN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
