package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class SINS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] params = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int x = params[0];
			int y = params[1];
			System.out.println(solution(x, y));
		}
		br.close();
	}

	private static int solution(int x, int y) {
		if (x == y) {
			return 2 * x;
		}
		int min = Math.min(x, y);
		int max = 0;
		if (min == x) {
			max = y;
		} else {
			max = x;
		}
		int remainder = max % min;
		if (remainder == 0) {
			return 2 * min;
		}
		return solution(remainder, min);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/SINS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
