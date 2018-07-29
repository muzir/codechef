package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author erhun.baycelik
 *
 */
public class RECTSQ {
	private static boolean isCodechefModeOn = true;

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String argumentLine = readLine(dis);
			String[] arguments = argumentLine.split(" ");
			int arg0 = Integer.parseInt(arguments[0]);
			int arg1 = Integer.parseInt(arguments[1]);
			System.out.println(printSquareCount(arg0, arg1));
		}
	}

	static int printSquareCount(int arg0, int arg1) {
		int ebob = ebob(arg0, arg1);
		int division1 = arg0 / ebob;
		int division2 = arg1 / ebob;
		return division1 * division2;
	}

	static int ebob(int a, int b) {
		int minimum = Math.min(a, b);
		int ebob = 1;
		for (int i = 2; i <= minimum; i++) {
			if (a % i == 0 && b % i == 0) {
				ebob = i;
			}
		}
		return ebob;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/RECTSQ.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
