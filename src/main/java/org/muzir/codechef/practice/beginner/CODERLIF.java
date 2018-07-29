package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CODERLIF {
	private static boolean isCodechefModeOn = false;

	private final static String CODER_LIFE_MATTERS = "#coderlifematters";
	private final static String ALL_CODERS_ARE_FUN = "#allcodersarefun";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] sequence = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			System.out.println(solution(sequence));
		}
		br.close();
	}

	private static String solution(int[] sequence) {
		int lenght = sequence.length;
		int coderDaysLimit = 0;
		for (int i = 0; i < lenght; i++) {
			if (sequence[i] == 1) {
				coderDaysLimit++;
			} else {
				coderDaysLimit = 0;
			}

			if (coderDaysLimit > 5) {
				return CODER_LIFE_MATTERS;
			}
		}
		return ALL_CODERS_ARE_FUN;
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CODERLIF.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
