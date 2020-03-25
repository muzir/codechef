package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class DSTAPLS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(solution(br.readLine()));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/DSTAPLS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(String s) {
		long[] nk = Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).toArray();
		long n = nk[0];
		long k = nk[1];
		long boxSize = n / k;
		if (boxSize % k == 0) {
			return "NO";
		}
		return "YES";
	}
}
