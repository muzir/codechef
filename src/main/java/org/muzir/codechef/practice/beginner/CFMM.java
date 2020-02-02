package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CFMM {
	private final static String CODECHEF = "codechef";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(br.readLine());
			StringBuilder allLetters = new StringBuilder();
			for (int j = 0; j < n; j++) {
				String line = br.readLine();
				allLetters.append(line);
			}
			System.out.println(solution(allLetters.toString()));
		}
		br.close();
	}

	static int solution(String allLetters) {
		Map<Character, Integer> lettersCountMap = countAllChars(allLetters);
		return findMinimumCountOfCodechefChars(lettersCountMap);
	}

	private static int findMinimumCountOfCodechefChars(Map<Character, Integer> lettersCountMap) {
		Map<Character, Integer> codeChefCharMaps = countAllChars(CODECHEF);
		int minimumCharacterWeight = Integer.MAX_VALUE;
		for (Map.Entry<Character, Integer> entry : codeChefCharMaps.entrySet()) {
			Character key = entry.getKey();
			Integer characterCountValue = entry.getValue();
			Integer keyValue = lettersCountMap.get(key);
			if (isRequiredCharsMissing(keyValue)) {
				minimumCharacterWeight = 0;
				break;
			}
			int totalCharacterWeight = keyValue / characterCountValue;
			minimumCharacterWeight = Math.min(minimumCharacterWeight, totalCharacterWeight);
		}
		return minimumCharacterWeight;
	}

	private static boolean isRequiredCharsMissing(Integer requiredCharsCount) {
		return requiredCharsCount == null;
	}

	private static Map<Character, Integer> countAllChars(String allLetters) {
		Map<Character, Integer> lettersCountMap = new HashMap<>();
		char[] letterChars = allLetters.toCharArray();
		for (char c : letterChars) {
			if (lettersCountMap.get(c) != null) {
				int charCount = lettersCountMap.get(c);
				charCount++;
				lettersCountMap.put(c, charCount);
			} else {
				lettersCountMap.put(c, 1);
			}
		}
		return lettersCountMap;
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CFMM.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
