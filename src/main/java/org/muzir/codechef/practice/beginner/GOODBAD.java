package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class GOODBAD {
	static boolean isCodechefModeOn = false;
	static final String CHEF = "chef";
	static final String BROTHER = "brother";
	static final String BOTH = "both";
	static final String NONE = "none";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nk = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			String s = br.readLine();
			System.out.println(findMessageSource(s, nk[0], nk[1]));
		}
		br.close();
	}

	 static String findMessageSource(String s, int n, int k) {
		char[] chars = s.toCharArray();
		int sCount = 0;
		int cCount = 0;
		for (int i = 0; i < n; i++) {
			char c = chars[i];
			if (Character.isUpperCase(c)) {
				cCount++;
			}
			if (Character.isLowerCase(c)) {
				sCount++;
			}
		}
		if (k >= sCount && k >= cCount) {
			return BOTH;
		}
		if (k < sCount && k < cCount) {
			return NONE;
		}
		if (k >= sCount) {
			return BROTHER;
		}
		return CHEF;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/GOODBAD.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
