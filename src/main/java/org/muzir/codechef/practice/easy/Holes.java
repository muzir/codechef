package org.muzir.codechef.practice.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 * 
 * The first line contains a single integer T <= 40, the number of test cases. T
 * test cases follow. The only line of each test case contains a non-empty text
 * composed only of uppercase letters of English alphabet. The length of the
 * text is less then 100. There are no any spaces in the input. Output
 * 
 * For each test case, output a single line containing the number of holes in
 * the corresponding text. Example
 * 
 * Input: 2 CODECHEF DRINKEATCODE
 * 
 * Output: 2 5
 * 
 * @author muzir
 *
 */
public class Holes {

	static String ONEHOLESLETTER = "ADOPRQ";
	static String TWOHOLESLETTER = "B";

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int linesCount = Integer.parseInt(reader.readLine());
		for (int i = 0; i < linesCount; i++) {
			String input = reader.readLine();
			System.out.println(calculateWordsHoles(input));
		}
	}

	private static int calculateWordsHoles(String input) {
		char[] inputChars = input.toCharArray();
		int counter = 0;
		for (char c : inputChars) {
			if (ONEHOLESLETTER.contains(c + "")) {
				counter = counter + 1;
			}
			if (TWOHOLESLETTER.contains(c + "")) {
				counter = counter + 2;
			}
		}
		return counter;
	}
}
