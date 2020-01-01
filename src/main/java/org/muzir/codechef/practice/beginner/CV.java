package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class CV {
	private static boolean isCodechefModeOn = false;
	private static List<Character> VOVELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String letters = br.readLine();
			System.out.println(solution(letters));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CV.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(String s) {
		int counter = 0;
		char[] letters = s.toCharArray();
		for (int i = 0; i < letters.length - 1; i++) {
			boolean currentCharIsVovel = isVovel(letters[i]);
			boolean nextCharIsVovel = isVovel(letters[i + 1]);
			if (!currentCharIsVovel && nextCharIsVovel) {
				counter++;
			}
		}
		return counter;
	}

	private static boolean isVovel(char letter) {
		return VOVELS.contains(letter);
	}
}
