package org.muzir.codechef.longContest.aprill18;

import java.io.*;

public class GOODPREF {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String[] params = br.readLine().split(" ");
			String s = params[0];
			int n = Integer.parseInt(params[1]);
			System.out.println(solution(s, n));
		}
		br.close();
	}

	static long solution(String s, long n) {
		Compandor compandor = new Compandor(s);
		compandor.compare();
		if (compandor.isEqual() > 0) {
			int diffA = compandor.getDiffA();
			return ((n - 1) * s.length()) + diffA;
		} else if (compandor.isEqual() == 0) {
			int diffA = compandor.getDiffA();
			return diffA * n;
		}
		return 0;
	}

	private static class Compandor {
		int equalFlag;
		int diffA;
		String s;

		public Compandor(String param) {
			s = param;
		}

		public void compare() {
			char[] chars = s.toCharArray();
			int length = chars.length;
			int counterA = 0;
			int counterB = 0;
			for (int i = 0; i < length; i++) {
				char c = chars[i];
				if (c == 'a') {
					counterA++;
				} else {
					counterB++;
				}
				if (counterA > counterB) {
					diffA++;
				}
			}

			if (counterA > counterB) {
				equalFlag = 1;
			} else if (counterA == counterB) {
				equalFlag = 0;
			} else {
				equalFlag = -1;
			}
		}

		public int isEqual() {
			return equalFlag;
		}

		public int getDiffA() {
			return diffA;
		}

	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/GOODPREF.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
