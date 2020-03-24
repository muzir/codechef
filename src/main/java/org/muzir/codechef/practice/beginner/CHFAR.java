package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CHFAR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int k = nk[1];
			String sequence = br.readLine();
			System.out.println(solution(k, sequence));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHFAR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(int k, String s) {
		int[] sequence = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		int countOnes = (int) Arrays.stream(sequence).filter(i -> i == 1).count();
		int length = sequence.length;
		if (k >= length - countOnes) {
			return "YES";
		}
		return "NO";
	}
}
