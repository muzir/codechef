package org.muzir.codechef.longContest.nov17;

import java.io.*;

public class VILTRIBE {

	private static boolean isCodechefModeOn = false;


	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String tribeSeries = readLine(dis);
			Tribes tribes = new Tribes();
			tribes.calculateTribeCount(tribeSeries);
			System.out.println(tribes.getACounter() + " " + tribes.getBCounter());
			tribes = null;
		}
		reader.close();
	}


	static class Tribes {
		final char A = 'A';
		final char B = 'B';
		final char EMPTY_VILLAGE_CHAR = '.';
		int aCounter = 0;
		int bCounter = 0;
		int emptyCounter = 0;
		char previousChar = ' ';

		public int getACounter() {
			return aCounter;
		}

		public int getBCounter() {
			return bCounter;
		}


		public void calculateTribeCount(String tribeSeries) {
			int length = tribeSeries.length();
			for (int i = 0; i < length; i++) {
				char villageChar = tribeSeries.charAt(i);
				if (isCharA(villageChar)) {
					if (isPreviousCharIsA()) {
						aCounter = aCounter + emptyCounter;
					}
					aCounter++;
					previousChar = 'A';
					emptyCounter = 0;
				} else if (isCharB(villageChar)) {
					if (isPreviousCharIsB()) {
						bCounter = bCounter + emptyCounter;
					}
					bCounter++;
					previousChar = 'B';
					emptyCounter = 0;
				} else if (isEmptyChar(villageChar)) {
					emptyCounter++;
				}
			}
		}

		private boolean isPreviousCharIsB() {
			return previousChar == B;
		}

		private boolean isPreviousCharIsA() {
			return previousChar == A;
		}

		private boolean isEmptyChar(char villageChar) {
			return villageChar == EMPTY_VILLAGE_CHAR;
		}

		private boolean isCharB(char villageChar) {
			return villageChar == B;
		}

		private boolean isCharA(char villageChar) {
			return villageChar == A;
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/VILTRIBE.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
