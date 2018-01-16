package org.muzir.codechef.practice.beginner;

import java.io.*;

public class C00K0FF {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int problemCount = Integer.parseInt(br.readLine());
			String[] problemArray = new String[problemCount];
			for (int j = 0; j < problemCount; j++) {
				problemArray[j] = br.readLine();
			}
			System.out.println(checkContest(problemArray));
		}
		br.close();
	}

	private static String checkContest(String[] problemArray) {
		int problemCount = problemArray.length;
		int cakeWalkCounter = 0;
		int simpleCounter = 0;
		int easyCounter = 0;
		int easyMediumCounter = 0;
		int mediumCounter = 0;
		int mediumHardCounter = 0;
		int hardCounter = 0;

		for (int i = 0; i < problemCount; i++) {
			if ("cakewalk".equals(problemArray[i])) {
				cakeWalkCounter++;
			} else if ("simple".equals(problemArray[i])) {
				simpleCounter++;
			} else if ("easy".equals(problemArray[i])) {
				easyCounter++;
			} else if ("easy-medium".equals(problemArray[i])) {
				easyMediumCounter++;
			} else if ("medium".equals(problemArray[i])) {
				mediumCounter++;
			} else if ("medium-hard".equals(problemArray[i])) {
				mediumHardCounter++;
			} else if ("hard".equals(problemArray[i])) {
				hardCounter++;
			}
			if (cakeWalkCounter > 0
					&& simpleCounter > 0
					&& easyCounter > 0
					&& (easyMediumCounter > 0 || mediumCounter > 0)
					&& (mediumHardCounter > 0 || hardCounter > 0)) {
				return "Yes";
			}
		}

		return "No";
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr;
		isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/C00K0FF.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
