package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class VALIDSTK {
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

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/VALIDSTK.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(String s) {
		int[] elements = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		int counter = 0;
		for (int i = 0; i < elements.length; i++) {
			int element = elements[i];
			if (element == 1) {
				counter++;
			} else {
				counter--;
			}
			if (counter < 0) {
				return "Invalid";
			}
		}
		return "Valid";
	}
}
