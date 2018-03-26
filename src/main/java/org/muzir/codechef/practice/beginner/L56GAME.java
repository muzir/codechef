package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class L56GAME {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			int[] sequence = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			System.out.println(solution(sequence));
		}
		br.close();
	}

	static int solution(int[] sequence) {
		int oddCount = 0;
		int lenght = sequence.length;
		for (int i = 0; i < lenght; i++) {
			int element = sequence[i];
			if ((element % 2) == 1) {
				oddCount++;
			}
		}
		if (lenght == 1 && oddCount == 1) {
			return 1;
		}
		if ((oddCount % 2) == 0) {
			return 1;
		}
		return 2;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/L56GAME.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
