package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

/**
 * @author erhun.baycelik
 *
 */
public class SNAPE {
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
		int param1Power = param1 * param1;
		int param2Power = param2 * param2;
		int powerTotal = param1Power + param2Power;
		double result1 = Math.sqrt(powerTotal);
		int powerDifference = Math.abs(param2Power - param1Power);
		double result2 = Math.sqrt(powerDifference);
		System.out.println("" + result2 + " " + result1);
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/SNAPE.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
