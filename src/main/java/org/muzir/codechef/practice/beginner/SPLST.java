package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class SPLST {
	static final String YES = "YES";
	static final String NO = "NO";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String param = br.readLine();
			System.out.println(solution(param));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/SPLST.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(String s) {
		int[] intParamArray = Arrays.stream(s.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

		int x = intParamArray[3];
		int y = intParamArray[4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int selectedPileCount = intParamArray[j];
				int param1 = intParamArray[(j + 1) % 3];
				int param2 = intParamArray[(j + 2) % 3];
				int diff1 = x - param1;
				int diff2 = y - param2;
				if ((diff1 >= 0) && (diff2 >= 0)) {
					if ((diff1 + diff2) == selectedPileCount) {
						return YES;
					}
				}
			}
		}
		return NO;
	}
}
