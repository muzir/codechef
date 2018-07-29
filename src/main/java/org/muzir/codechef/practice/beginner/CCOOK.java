package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CCOOK {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] params = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			System.out.println(solution(params));
		}
		br.close();
	}

	private static String solution(int[] params) {
		final int sum = Arrays.stream(params).sum();
		switch (sum) {
			case 0:
				return "Beginner";
			case 1:
				return "Junior Developer";
			case 2:
				return "Middle Developer";
			case 3:
				return "Senior Developer";
			case 4:
				return "Hacker";
			case 5:
				return "Jeff Dean";
		}
		return "";
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CCOOK.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
