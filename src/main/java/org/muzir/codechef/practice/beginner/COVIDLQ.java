package org.muzir.codechef.practice.beginner;

import java.io.*;

public class COVIDLQ {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
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
			String filePath = path + "/src/main/inputs/COVIDLQ.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(String s) {
		char[] queue = s.replaceAll(" ", "").toCharArray();
		int length = queue.length;
		int lastOneIndex = -1;
		for (int i = 0; i < length; i++) {
			char current = queue[i];
			if (current == '1') {
				if (lastOneIndex != -1) {
					if ((i - lastOneIndex) < 6) {
						return "NO";
					}
				}
				lastOneIndex = i;
			}
		}
		return "YES";
	}
}
