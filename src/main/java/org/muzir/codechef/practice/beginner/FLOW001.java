package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FLOW001 {
	private static boolean isCodechefModeOff = true;

	public static void main(String args[]) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInputCount = readLine(dis);
		for (int j = 0; j < Integer.parseInt(lineOfInputCount.trim()); j++) {
			String line = readLine(dis);
			String arguments[] = line.split(" ");
			int arg0 = Integer.parseInt(arguments[0]);
			int arg1 = Integer.parseInt(arguments[1]);
			System.out.println(arg0 + arg1);
		}
	}

	private static InputStream createInputStream() {
		if (isCodechefModeOff) {
			String path = System.getProperty("user.dir");
			try {
				InputStream in = new FileInputStream(path + "/src/main/inputs/FLOW001.txt");
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
