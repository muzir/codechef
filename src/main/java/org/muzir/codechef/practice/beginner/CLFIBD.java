package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

import static java.lang.System.out;

public class CLFIBD {
	private static boolean isCodechefModeOn = false;
	static String DYNAMIC = "Dynamic";
	static String NOT = "Not";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			out.println(solution(br.readLine()));
		}
		br.close();
	}

	static String solution(String param) {
		Integer[] fibonacciArray = new Integer[26];
		for (int i = 0; i < 26; i++) {
			fibonacciArray[i] = 0;
		}
		char[] parameters = param.toCharArray();
		int n = parameters.length;
		for (int i = 0; i < n; i++) {
			char c = parameters[i];
			int asciiCode = (int) c;
			int index = asciiCode - 97;
			fibonacciArray[index] = fibonacciArray[index] + 1;
		}
		fibonacciArray = Arrays.stream(fibonacciArray)
				.filter(k -> k > 0)
				.sorted()
				.toArray(Integer[]::new);
		if (fibonacciArray.length < 3) {
			return DYNAMIC;
		}

		int limit = fibonacciArray.length - 2;
		for (int i = 0; i < limit; i++) {
			int acc = fibonacciArray[i] + fibonacciArray[i + 1];
			if ((acc != fibonacciArray[i + 2]) && !isExceptionalCase(i, fibonacciArray)) {
				return NOT;
			}
		}
		return DYNAMIC;
	}

	private static boolean isExceptionalCase(int i, Integer[] fibonacciArray) {
		if (i != 1) {
			return false;
		}
		if (fibonacciArray[3] == (fibonacciArray[0] + fibonacciArray[2])) {
			return true;
		}
		return false;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CLFIBD.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
