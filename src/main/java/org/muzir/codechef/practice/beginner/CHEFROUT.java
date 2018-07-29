package org.muzir.codechef.practice.beginner;

import java.io.*;

public class CHEFROUT {
	private static boolean isCodechefModeOn = false;
	static final String no = "no";
	static final String yes = "yes";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(checkChefDailyRoutine(br.readLine()));
		}
		br.close();
	}

	static String checkChefDailyRoutine(String dailyRoutine) {
		char current = dailyRoutine.charAt(0);
		int lastIndex = dailyRoutine.length() - 1;
		for (int i = 0; i < lastIndex; i++) {
			char next = dailyRoutine.charAt(i + 1);
			if (current == 'E') {
				if (next == 'C') {
					return no;
				}
			} else if (current == 'S') {
				if (next == 'C' || next == 'E') {
					return no;
				}
			}
			current = next;
		}
		return yes;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHEFROUT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
