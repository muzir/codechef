package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MAXREM {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int n = Integer.parseInt(br.readLine());
		String sequence = br.readLine();
		System.out.println(solution(sequence));
		br.close();
	}

	static int solution(String sequence) {
		int[] array = Arrays.stream(sequence.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(array);
		return calculateMaximumRemaining(array);
	}

	private static int calculateMaximumRemaining(int[] sortedArray) {
		int lastIndex = sortedArray.length - 1;
		int maxRemaining = 0;
		for (int i = lastIndex; i > 0; i--) {
			int current = sortedArray[i];
			int previous = sortedArray[i - 1];
			if (current != previous) {
				maxRemaining = previous;
				break;
			}
		}
		return maxRemaining;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MAXREM.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
