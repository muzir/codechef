package org.muzir.codechef.practice.beginner;

import java.io.*;

public class SNELECT {
	private static boolean isCodechefModeOn = false;
	static final String snakes = "snakes";
	static final String mongooses = "mongooses";
	static final String tie = "tie";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String row = br.readLine();
			System.out.println(selectWinner(row));
		}
		br.close();
	}

	static String selectWinner(String row) {
		char[] cArray = row.toCharArray();
		int sCounter = 0;
		int mCounter = 0;
		int lenght = cArray.length;
		for (int i = 0; i < lenght; i++) {
			char c = cArray[i];
			if (c == 's') {
				sCounter++;
				if (i != lenght - 1) {
					char next = cArray[i + 1];
					if (next == 'm') {
						mCounter++;
						sCounter--;
						cArray[i + 1] = ' ';
					}
				}
			} else if (c == 'm') {
				mCounter++;
				if (i != lenght - 1) {
					char next = cArray[i + 1];
					if (next == 's') {
						cArray[i + 1] = ' ';
					}
				}
			}
		}
		if (sCounter == mCounter) {
			return tie;
		} else if (sCounter > mCounter) {
			return snakes;
		}
		return mongooses;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/SNELECT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
