package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author erhun.baycelik
 *
 */
public class ALPHABET {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String knownWord = readLine(dis);
		int testCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCount; i++) {
			String bookWord = readLine(dis);
			System.out.println(solution(knownWord, bookWord));
		}
	}

	static String solution(String knownWord, String bookWord) {
		char[] wordsChar = bookWord.toCharArray();
		for (char c : wordsChar) {
			if (!knownWord.contains(String.valueOf(c))) {
				return "No";
			}
		}
		return "Yes";
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/ALPHABET.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
