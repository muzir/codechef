package org.muzir.codechef.longContest.feb18;

import java.io.*;

public class CHEFCHR {
	static final String LOVELY = "lovely";
	static final String NORMAL = "normal";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String s = br.readLine();
			System.out.println(checkLovely(s));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/CHEFCHR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String checkLovely(String s) {
		char[] sArray = s.toCharArray();
		int lenght = sArray.length;
		ContinuesChecker cC = new ContinuesChecker();
		for (int i = 0; i < lenght; i++) {
			char c = sArray[i];
			cC.append(c);
			int firstOutLimitIndex = i - 4;
			if (firstOutLimitIndex >= 0) {
				cC.delete(sArray[firstOutLimitIndex]);
			}
			cC.countLovely();
		}
		return cC.toString();
	}

	static class ContinuesChecker {
		private int cCounter = 0;
		private int eCounter = 0;
		private int hCounter = 0;
		private int fCounter = 0;
		private int lovelyCounter = 0;

		void append(char c) {
			switch (c) {
				case 'c':
					cCounter++;
					break;
				case 'h':
					hCounter++;
					break;
				case 'e':
					eCounter++;
					break;
				case 'f':
					fCounter++;
					break;

			}
		}

		void delete(char c) {
			switch (c) {
				case 'c':
					if (cCounter != 0) {
						cCounter--;
					}
					break;
				case 'h':
					if (hCounter != 0) {
						hCounter--;
					}
					break;
				case 'e':
					if (eCounter != 0) {
						eCounter--;
					}
					break;
				case 'f':
					if (fCounter != 0) {
						fCounter--;
					}
					break;
			}
		}

		void countLovely() {
			if (cCounter == 1 && hCounter == 1 && eCounter == 1 && fCounter == 1) {
				lovelyCounter++;
			}
		}

		@Override
		public String toString() {
			if (lovelyCounter == 0) {
				return NORMAL;
			}
			return LOVELY + " " + lovelyCounter;
		}
	}
}
