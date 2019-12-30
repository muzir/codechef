package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PRGIFT {
	static final String YES = "YES";
	static final String NO = "NO";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] params = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(solution(nk[1], params));
		}
		br.close();
	}

	static String solution(int k, int[] params) {
		int evenCounter = 0;
		int maxCounter = 0;
		for (int i = 0; i < params.length; i++) {
			if (isEven(params[i])) {
				evenCounter++;
			} else {
				evenCounter = 0;
			}
			maxCounter = Math.max(maxCounter, evenCounter);
		}
		if (k == 0 && maxCounter == params.length) {
			return NO;
		}
		if (maxCounter >= k) {
			return YES;
		}
		return NO;
	}

	private static boolean isEven(int n) {
		if (n == 0) {
			return false;
		}
		return n % 2 == 0;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/PRGIFT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
