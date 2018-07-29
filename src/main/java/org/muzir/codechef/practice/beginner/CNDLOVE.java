package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CNDLOVE {
	private static boolean isCodechefModeOn = false;
	private static String YES = "YES";
	private static String NO = "NO";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			Integer.parseInt(br.readLine());
			String line = br.readLine();
			int[] candies = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(solution(candies));
		}
		br.close();
	}

	private static String solution(int[] candies) {
		int lenght = candies.length;
		int accumulator = 0;
		for (int i = 0; i < lenght; i++) {
			int candy = candies[i];
			accumulator = accumulator + candy;
		}
		if (accumulator % 2 == 1) {
			return YES;
		}
		return NO;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CNDLOVE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
