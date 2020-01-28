package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NOMATCH {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			System.out.println(solution(br.readLine()));
		}
		br.close();
	}

	static long solution(String line) {
		int[] sequence = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(sequence);
		int length = sequence.length;
		long total = 0;
		int halfLength = length / 2;
		for (int i = 0; i < halfLength; i++) {
			long frontValue = sequence[i];
			long tailValue = sequence[length - 1 - i];
			long tempTotal = frontValue - tailValue;
			total += Math.abs(tempTotal);
		}
		return total;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/NOMATCH.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
