package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class PROC18A {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int k = nk[1];
			int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(solution(input, k));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/PROC18A.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(int[] input, int k) {
		int n = input.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (n < (i + k)) {
				break;
			}
			int temp = sumSubArray(Arrays.copyOfRange(input, i, i + k));
			max = Math.max(max, temp);

		}
		return max;
	}

	private static int sumSubArray(int[] subArray) {
		return Arrays.stream(subArray).sum();
	}
}
