package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class MNMX {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int inputCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < inputCount; i++) {
			readLine(dis);
			String lineOfInput = readLine(dis);
			String[] array = lineOfInput.split(" ");
			System.out.println(printMinimumCost(array));
		}
	}

	static int printMinimumCost(String[] array) {
		int[] integers = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			integers[i] = Integer.parseInt(array[i]);
		}
		Arrays.sort(integers);
		int minimumValue = integers[0];
		return minimumValue * (integers.length - 1);
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in;
		in = new FileInputStream(path + "/MNMX.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
