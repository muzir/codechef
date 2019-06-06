package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CHFINTRO {
	static String GOOD_BOI = "Good boi";
	static String BAD_BOI = "Bad boi";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();

		int[] params = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = params[0];
		int r = params[1];
		for (int j = 0; j < n; j++) {
			int arg = Integer.parseInt(br.readLine());
			System.out.println(solution(arg, r));
		}
		br.close();
	}

	static String solution(int arg, int r) {
		if (arg < r) {
			return BAD_BOI;
		}
		return GOOD_BOI;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHFINTRO.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
