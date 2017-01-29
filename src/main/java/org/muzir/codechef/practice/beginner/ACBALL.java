package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ACBALL {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String s1 = readLine(dis);
			String s2 = readLine(dis);
			System.out.println(solution(s1, s2));
		}
	}

	static String solution(String s1, String s2) {
		int lenght = s1.length();
		char[] z = new char[lenght];
		for (int i = 0; i < lenght; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			z[i] = xor(c1, c2);
		} // end of for loop
		String result = new String(z);
		return result;
	}

	static char xor(char c1, char c2) {
		if (c1 == 'W' && c2 == 'W') {
			return 'B';
		} else if (c1 == 'B' && c2 == 'W') {
			return 'B';
		} else if (c1 == 'W' && c2 == 'B') {
			return 'B';
		} else if (c1 == 'B' && c2 == 'B') {
			return 'W';
		}
		return 1;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/ACBALL.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
