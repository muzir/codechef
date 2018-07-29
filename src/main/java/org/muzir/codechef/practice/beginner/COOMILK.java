package org.muzir.codechef.practice.beginner;

import java.io.*;

public class COOMILK {
	private static boolean isCodechefModeOn = false;
	static final String NO = "NO";
	static final String YES = "YES";
	static final String COOKIE = "cookie";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			System.out.println(checkFollowInstruction(br.readLine()));
		}
		br.close();
	}

	static String checkFollowInstruction(String s) {
		String[] array = s.split(" ");
		int lenght = array.length;
		if (lenght == 1 && COOKIE.equals(array[0])) {
			return NO;
		}
		if (COOKIE.equals(array[lenght - 1])) {
			return NO;
		}
		if (s.contains("cookie cookie")) {
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
			String filePath = path + "/src/main/inputs/COOMILK.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
