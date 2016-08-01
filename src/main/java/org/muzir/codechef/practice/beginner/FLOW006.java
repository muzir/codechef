package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FLOW006 {
	private static boolean isCodechefModeOff = true;

	public static void main(String args[]) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInputCount = readLine(dis);
		for (int j = 0; j < Integer.parseInt(lineOfInputCount.trim()); j++) {
			String line = readLine(dis);
			char arguments[] = line.toCharArray();
			int accumulator = 0;
			for (char c : arguments) {
				accumulator += Integer.parseInt(Character.toString(c));
			}
			System.out.println(accumulator);
		}
	}

	private static InputStream createInputStream() {
		if (isCodechefModeOff) {
			String path = System.getProperty("user.dir");
			try {
				InputStream in = new FileInputStream(path + "/FLOW006.txt");
				return in;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return System.in;
	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
