package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CHN09 {
	private static final String colourCode_a = "a";
	private static final String colourCode_b = "b";
	
	private static boolean isCodechefModeOn = false;



	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String input = readLine(dis);
			System.out.println(Math.min(sizeOfColour(input, colourCode_a), sizeOfColour(input, colourCode_b)));
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/CHN09.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	static int sizeOfColour(String input, String colourcodeA) {
		int accumulator = 0;
		if (input == null || input.isEmpty()) {
			return accumulator;
		}
		for (Character c : input.toCharArray()) {
			if (colourcodeA.equals(String.valueOf(c))) {
				accumulator = accumulator + 1;
			}
		}
		return accumulator;
	}
}
