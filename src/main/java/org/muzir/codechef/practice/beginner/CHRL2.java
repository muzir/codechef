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
public class CHRL2 {

	private static boolean isCodechefModeOn = false;
	private static int iterateIndex = 0;
	private static char[] CHEF = { 'C', 'H', 'E', 'F' };

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String input = readLine(dis);
		System.out.println(solution(input));
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/CHRL2.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	public static int solution(String s) {
		char[] input = s.toCharArray();
		return moveMaximum(input);
	}

	private static int moveMaximum(char[] input) {
		int counter = 0;
		int lenght = input.length;
		StringBuilder temp = new StringBuilder();
		iterateIndex = 0;
		for (int i = 0; i < lenght; i++) {
			char c = input[i];
			char nextChar = getNextChar();
			if (c == nextChar) {
				temp.append(String.valueOf(c));
				input[i] = ' ';
				iterateIndex++;
			}
			if (temp.toString().equals("CHEF")) {
				counter++;
				temp = new StringBuilder();
				iterateIndex = 0;
			}
		}
		if (counter == 0) {
			return counter;
		}
		return moveMaximum(input) + counter;
	}

	private static char getNextChar() {
		if (iterateIndex > 3) {
			iterateIndex = 0;
		}
		return CHEF[iterateIndex];
	}

}
