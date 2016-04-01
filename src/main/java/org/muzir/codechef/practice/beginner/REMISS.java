package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

public class REMISS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int lineOfInputCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < lineOfInputCount; i++) {
			String line = readLine(dis);
			calculateSquareOfInputLine(line);
		}
	}

	private static void calculateSquareOfInputLine(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		int param1 = Integer.parseInt(tokenizer.nextToken());
		int param2 = Integer.parseInt(tokenizer.nextToken());
		int result1 = Math.max(param1, param2);
		int result2 = param1 + param2;
		System.out.println("" + result1 + " " + result2);
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/REMISS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
