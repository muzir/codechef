package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CSUM {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int k = nk[1];
			String sequence = br.readLine();
			System.out.println(solution(sequence, k));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CSUM.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(String s, int k) {
		int[] params = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = params.length;
		for (int i = 0; i < n - 1; i++) {
			int currentElement = params[i];
			for (int j = i + 1; j < n; j++) {
				int nextElement = params[j];
				int total = currentElement + nextElement;
				if (total == k) {
					return "Yes";
				}
			}
		}
		return "No";
	}
}
