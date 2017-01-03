package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author erhun.baycelik
 *
 */
public class BRACKETS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String input = readLine(dis);
			int maxBalanced = findMaxBalance(input);
			String prefix = generateBalancedSequence(maxBalanced, "(");
			String postfix = generateBalancedSequence(maxBalanced, ")");
			System.out.println(prefix + postfix);
		}
	}

	static String generateBalancedSequence(int maxBalanced, String character) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < maxBalanced; i++) {
			s.append(character);
		}
		return s.toString();
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/BRACKETS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	static int findMaxBalance(String s) {
		int balance = 0;
		int max_balance = 0;
		char[] chars = s.toCharArray();
		int lenght = chars.length;
		for (int i = 0; i < lenght; i++) {
			char c = chars[i];
			if (c == '(') {
				balance = balance + 1;
			}
			if (c == ')') {
				balance = balance - 1;
			}
			max_balance = Math.max(max_balance, balance);
		}
		return max_balance;
	}
}
