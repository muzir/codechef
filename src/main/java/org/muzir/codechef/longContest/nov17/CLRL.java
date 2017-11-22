package org.muzir.codechef.longContest.nov17;

import java.io.*;

public class CLRL {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String nr = br.readLine();
			String[] nrArray = nr.split(" ");
			int n = Integer.parseInt(nrArray[0]);
			int rezibaRating = Integer.parseInt(nrArray[1]);
			String sequence = br.readLine();
			System.out.println(sequenceIsPossible(sequence, n, rezibaRating));
		}
		br.close();
	}

	static String sequenceIsPossible(String s, int n, int rezibaRating) {
		String[] sArray = s.split(" ");
		int lastRating = Integer.parseInt(sArray[n - 1]);
		if (lastRating != rezibaRating) {
			return "NO";
		}
		int leftCorner = 0;
		int rightCorner = 0;
		for (int i = 0; i < n; i++) {
			int currentRating = Integer.parseInt(sArray[i]);
			if (rezibaRating > currentRating) {
				if (leftCorner == 0) {
					leftCorner = currentRating;
				}
				if (leftCorner > currentRating) {
					return "NO";
				} else {
					leftCorner = currentRating;
				}
			} else if (currentRating > rezibaRating) {
				if (rightCorner == 0) {
					rightCorner = currentRating;
				}
				if (rightCorner < currentRating) {
					return "NO";
				} else {
					rightCorner = currentRating;
				}
			}
		}
		return "YES";
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/CLRL.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;

	}
}
