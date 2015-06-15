package org.muzir.codechef.practice.easy;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class NumGame {
	private static boolean isCodechefModeOff = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInputCount = readLine(dis);
		for (int j = 0; j < Integer.parseInt(lineOfInputCount); j++) {
			String strNumber = readLine(dis);
			System.out.println(findWinner(strNumber));
		}
	}

	public static String findWinner(String strNumber) {
		int number = Integer.valueOf(strNumber);
		if (isEven(number)) {
			return "ALICE";
		}
		return "BOB";
	}

	private static boolean isEven(int number) {
		int remainder = number % 2;
		if (remainder == 0) {
			return true;
		}
		return false;
	}

	private static InputStream createInputStream() {
		if (isCodechefModeOff) {
			String path = System.getProperty("user.dir");
			try {
				InputStream in = new FileInputStream(path + "/NumGame.txt");
				return in;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.in;
	}

	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
