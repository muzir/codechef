package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FRUITS {

	private static boolean isCodechefModeOn = true;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String strLineCount = readLine(dis);
		int lineCount = Integer.parseInt(strLineCount);
		for (int i = 0; lineCount > i; i++) {
			String lineOfInput = readLine(dis);
			String[] array = lineOfInput.split(" ");
			int countOfApples = Integer.parseInt(array[0]);
			int countOfOranges = Integer.parseInt(array[1]);
			int countOfGoldCoins = Integer.parseInt(array[2]);
			System.out.println(getMinimumDifference(countOfApples, countOfOranges, countOfGoldCoins));
		}
	}

	static int getMinimumDifference(int countOfApples, int countOfOranges, int countOfGoldCoins) {
		int difference = countOfApples - countOfOranges;
		difference = Math.abs(difference);
		if (countOfGoldCoins >= difference) {
			return 0;
		} else {
			return Math.abs(difference - countOfGoldCoins);
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in;
		in = new FileInputStream(path + "/FRUITS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
