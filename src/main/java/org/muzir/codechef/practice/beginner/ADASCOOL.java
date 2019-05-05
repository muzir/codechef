package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class ADASCOOL {
	static final String YES = "YES";
	static final String NO = "NO";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = arr[0];
			int m = arr[1];
			System.out.println(solution(n, m));
		}
		br.close();
	}

	static String solution(int n, int m) {
		if (n == 1 || m == 1) {
			return NO;
		}
		if ((n % 2 != 0) && (m % 2 != 0)) {
			return NO;
		}
		return YES;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ADASCOOL.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
