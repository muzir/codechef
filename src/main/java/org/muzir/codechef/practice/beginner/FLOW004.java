package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FLOW004 {
	private static boolean isCodechefModeOff = true;

	public static void main(String args[]) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInputCount = readLine(dis);
		for (int k = 0; k < Integer.parseInt(lineOfInputCount.trim()); k++) {
			String line = readLine(dis);
			try {
				Integer.parseInt(line);
			} catch (Exception e) {
				continue;
			}
			char arguments[] = line.toCharArray();
			char sign = arguments[0];
			int i = 0;
			if (sign == '-') {
				i = 1;
			}
			// TODO sum first and last digits, consider negative number
			int first = Integer.parseInt(String.valueOf(arguments[i]));
			int last = Integer.parseInt(String.valueOf(arguments[arguments.length - 1]));
			System.out.println(first + last);
		}
	}

	private static InputStream createInputStream() {
		if (isCodechefModeOff) {
			String path = System.getProperty("user.dir");
			try {
				InputStream in = new FileInputStream(path + "/FLOW004.txt");
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
