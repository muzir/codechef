package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CHNGIT {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String paramSequence = br.readLine();
			int minimumNumberOfMoves = solution(paramSequence);
			System.out.println(minimumNumberOfMoves);
		}
		br.close();
	}

	static int solution(String paramSequence) {
		int[] sequence = Arrays.stream(paramSequence.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		Map<Integer, Integer> countMap = new HashMap<>();
		Arrays.stream(sequence).forEach(i -> {
			if (countMap.get(i) != null) {
				int value = countMap.get(i);
				value++;
				countMap.put(i, value);
			} else {
				countMap.put(i, 1);
			}
		});
		int length = sequence.length;
		return length - getMaxValue(countMap);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHNGIT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	private static int getMaxValue(Map<Integer, Integer> countMap) {
		int maxValue = 1;
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			maxValue = Math.max(entry.getValue(), maxValue);
		}
		return maxValue;
	}
}
