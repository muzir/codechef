package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class THREEFR {
	public static final String YES = "yes";
	static final String NO = "no";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] xyz = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(solution(xyz[0], xyz[1], xyz[2]));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/THREEFR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(int x, int y, int z) {
		if ((-x + y + z) == 0 || (-x - y + z) == 0 || (-x + y - z) == 0 || (x - y - z) == 0 || (x + y - z) == 0 || (x - y + z) == 0) {
			return YES;
		}
		return NO;
	}
}
