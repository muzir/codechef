package org.muzir.codechef.practice.beginner;

import java.io.*;

public class TWOVSTEN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int param = Integer.parseInt(br.readLine());
			System.out.println(solution(param));
		}
		br.close();
	}

	private static int solution(int param) {
		if ((param % 10) == 0) {
			return 0;
		} else if ((param % 5) == 0) {
			return 1;
		}
		return -1;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/TWOVSTEN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
