package org.muzir.codechef.practice.beginner;

import java.io.*;

public class PLAYPIAN {
	public static final String NO = "no";
	static final String YES = "yes";
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
			String filePath = path + "/src/main/inputs/PLAYPIAN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(String s) {
		char[] chars = s.toCharArray();
		int n = chars.length;
		if ((n % 2) != 0) {
			return NO;
		}
		for (int i = 0; i < n; i++) {
			if ((i % 2) != 0) {
				StringBuilder temp = new StringBuilder();
				temp.append(chars[i - 1]);
				temp.append(chars[i]);
				if (temp.toString().equals("AA") || temp.toString().equals("BB")) {
					return NO;
				}
				temp = null;
			}
		}
		return YES;
	}
}
