package org.muzir.codechef.longContest.jan18;

import java.io.*;

public class RECTANGL {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String line = br.readLine();
			System.out.println(isRectangular(line));
		}
		br.close();
	}

	static String isRectangular(String line) {
		String[] array = line.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		int d = Integer.parseInt(array[3]);

		if (a == b && c == d) {
			return "YES";
		}
		if (a == c && b == d) {
			return "YES";
		}
		if (a == d && b == c) {
			return "YES";
		}
		return "NO";
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/RECTANGL.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
