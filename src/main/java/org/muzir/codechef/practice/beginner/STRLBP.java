package org.muzir.codechef.practice.beginner;

import java.io.*;

public class STRLBP {
	static final String UNIFORM = "uniform";
	static final String NON_UNIFORM = "non-uniform";

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String s = br.readLine();
			System.out.println(checkUniform(s));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/STRLBP.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String checkUniform(String s) {
		int uniformCounter = 0;
		for (int i = 0; i < 8; i++) {
			char current = s.charAt(i);
			char next = s.charAt((i + 1) % 8);
			if (current == '0' && next == '1') {
				uniformCounter++;
			}
			if (current == '1' && next == '0') {
				uniformCounter++;
			}
		}
		if (uniformCounter <= 2) {
			return UNIFORM;
		}
		return NON_UNIFORM;
	}
}
