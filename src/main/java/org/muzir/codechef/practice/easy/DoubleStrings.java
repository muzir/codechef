package org.muzir.codechef.practice.easy;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DoubleStrings {
	private static boolean isCodechefModeOff = true;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInputCount = readLine(dis);
		for (int j = 0; j < Integer.parseInt(lineOfInputCount); j++) {
			String maximalPossibleNumberOfCharacters = readLine(dis);
			if (isEven(maximalPossibleNumberOfCharacters)) {
				System.out.println(maximalPossibleNumberOfCharacters);
				continue;
			}
			int intMaximalPossibleNumberOfCharacters = Integer
					.parseInt(maximalPossibleNumberOfCharacters);
			intMaximalPossibleNumberOfCharacters = intMaximalPossibleNumberOfCharacters - 1;
			System.out.println(intMaximalPossibleNumberOfCharacters);
		}
		in.close();
		dis.close();
	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	private static boolean isEven(String str) {
		int i = Integer.parseInt(str);
		if (i % 2 == 0) {
			return true;
		}
		return false;
	}

	private static InputStream createInputStream() {
		if (isCodechefModeOff) {
			String path = System.getProperty("user.dir");
			try {
				InputStream in = new FileInputStream(path
						+ "/DoubleStrings.txt");
				return in;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return System.in;
	}
}
