package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AMR15A {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInput = readLine(dis);
		String[] array = lineOfInput.split(" ");
		System.out.println(printBattle(array));
	}

	static String printBattle(String[] array) {
		int evenCounter = 0;
		int oddCounter = 0;
		for (String s : array) {
			int i = Integer.parseInt(s);
			if (isEven(i)) {
				evenCounter = evenCounter + 1;
			} else {
				oddCounter = oddCounter + 1;
			}
		}
		if (evenCounter > oddCounter) {
			return "READY FOR BATTLE";
		}
		return "NOT READY";
	}

	private static boolean isEven(int i) {
		if (i % 2 == 0) {
			return true;
		}
		return false;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in;
		in = new FileInputStream(path + "/AMR15A.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
