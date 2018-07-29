package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CHNGOR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			Integer.parseInt(br.readLine());
			String line = br.readLine();
			int[] iArray = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(calculateMin(iArray));
		}
		br.close();
	}

	static int calculateMin(int[] iArray) {
		int length = iArray.length;
		int acc = iArray[0];
		for (int i = 1; i < length; i++) {
			int temp1 = iArray[i];
			acc = acc | temp1;
		}
		return acc;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHNGOR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
