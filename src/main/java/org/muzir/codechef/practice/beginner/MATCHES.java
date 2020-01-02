package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class MATCHES {
	private static boolean isCodechefModeOn = false;
	private static HashMap<Character, Integer> NUMBER_MATCH_COUNT_MAP;

	public static void main(String[] args) throws IOException {
		initializeMap();
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] params = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(solution(params[0], params[1]));
		}
		br.close();
	}

	static void initializeMap() {
		NUMBER_MATCH_COUNT_MAP = new HashMap<>();
		NUMBER_MATCH_COUNT_MAP.put('0', 6);
		NUMBER_MATCH_COUNT_MAP.put('1', 2);
		NUMBER_MATCH_COUNT_MAP.put('2', 5);
		NUMBER_MATCH_COUNT_MAP.put('3', 5);
		NUMBER_MATCH_COUNT_MAP.put('4', 4);
		NUMBER_MATCH_COUNT_MAP.put('5', 5);
		NUMBER_MATCH_COUNT_MAP.put('6', 6);
		NUMBER_MATCH_COUNT_MAP.put('7', 3);
		NUMBER_MATCH_COUNT_MAP.put('8', 7);
		NUMBER_MATCH_COUNT_MAP.put('9', 6);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MATCHES.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(int a, int b) {
		int total = a + b;
		return calculateMatchCount(total);
	}

	private static int calculateMatchCount(int total) {
		int numberOfMatches = 0;
		String s = String.valueOf(total);
		for (char c : s.toCharArray()) {
			int numberMatchCount = NUMBER_MATCH_COUNT_MAP.get(c);
			numberOfMatches = numberOfMatches + numberMatchCount;
		}
		return numberOfMatches;
	}
}
