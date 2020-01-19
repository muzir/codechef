package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXAM1 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String n = br.readLine();
			String correctAnswers = br.readLine();
			String chefAnswers = br.readLine();
			System.out.println(solution(correctAnswers, chefAnswers));
		}
		br.close();
	}

	static int solution(String correctAnswers, String chefAnswers) {
		char[] correctAnswersChars = correctAnswers.toCharArray();
		char[] chefAnswersChars = chefAnswers.toCharArray();
		int totalScore = 0;
		int length = correctAnswers.length();
		for (int i = 0; i < length; i++) {
			char correctAnswer = correctAnswersChars[i];
			char chefAnswer = chefAnswersChars[i];
			if (chefAnswer == 'N') {
				continue;
			} else if (chefAnswer == correctAnswer) {
				totalScore = totalScore + 1;
			} else if (i != length - 1) {
				i = i + 1;
			}
		}
		return totalScore;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/EXAM1.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
