package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class ICPC16A {
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

	static String solution(int[] params) {
		int x1 = params[0];
		int y1 = params[1];
		int x2 = params[2];
		int y2 = params[3];

		if (x1 == x2) {
			int yDiff = y2 - y1;
			if (yDiff > 0) {
				return "up";
			}
			return "down";
		} else if (y1 == y2) {
			int xDiff = x2 - x1;
			if (xDiff > 0) {
				return "right";
			}
			return "left";
		}
		return "sad";
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ICPC16A.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
