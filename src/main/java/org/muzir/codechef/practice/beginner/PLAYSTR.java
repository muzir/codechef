package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class PLAYSTR {
	static final String YES = "YES";
	static final String NO = "NO";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String s = br.readLine();
			String r = br.readLine();
			System.out.println(solution(s, r));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/PLAYSTR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(String s, String r) {
		char[] sChars = s.toCharArray();
		char[] rChars = r.toCharArray();
		if (hasCharsOneCountsSame(sChars, rChars)) {
			return YES;
		}
		return NO;
	}

	private static boolean hasCharsOneCountsSame(char[] sChars, char[] rChars) {
		int sOneCounter = 0;
		int rOneCounter = 0;
		for (int i = 0; i < sChars.length; i++) {
			if (sChars[i] == '1') {
				sOneCounter++;
			}
			if (rChars[i] == '1') {
				rOneCounter++;
			}
		}
		return sOneCounter == rOneCounter;
	}
}
