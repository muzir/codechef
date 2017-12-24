package org.muzir.codechef.cooks.cook89;

import java.io.*;

public class FBMT {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int scoreCount = Integer.parseInt(br.readLine());
			String[] sArray = new String[scoreCount];
			for (int j = 0; j < scoreCount; j++) {
				sArray[j] = br.readLine();
			}
			System.out.println(printWinnerTeamName(sArray));
		}
		br.close();
	}

	private static String printWinnerTeamName(String[] sArray) {
		int length = sArray.length;
		String firstTeamName = "";
		String secondTeamName = "";
		int firstTeamScore = 0;
		int secondTeamScore = 0;
		for (int i = 0; i < length; i++) {
			String temp = sArray[i];
			if (firstTeamName.equals("")) {
				firstTeamName = temp;
				firstTeamScore = firstTeamScore + 1;
			} else if (!temp.equals(firstTeamName)) {
				secondTeamName = temp;
				secondTeamScore = secondTeamScore + 1;
			} else if (temp.equals(firstTeamName)) {
				firstTeamScore = firstTeamScore + 1;
			}
		}
		if (firstTeamScore == secondTeamScore) {
			return "Draw";
		}
		if (firstTeamScore > secondTeamScore) {
			return firstTeamName;
		}
		return secondTeamName;
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/FBMT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
