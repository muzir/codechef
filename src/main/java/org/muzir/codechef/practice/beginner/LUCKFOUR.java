package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LUCKFOUR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int lineOfInputCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < lineOfInputCount; i++) {
			String input = readLine(dis);
			int fourCount = 0;
			for (char c : input.toCharArray()) {
				if (c == '4') {
					fourCount = fourCount + 1;
				}
			}
			System.out.println(fourCount);
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in;
		in = new FileInputStream(path + "/LUCKFOUR.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
