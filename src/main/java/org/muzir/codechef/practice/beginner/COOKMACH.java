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
public class COOKMACH {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] inputLine = readLine(dis).split(" ");
			int a = Integer.parseInt(inputLine[0]);
			int b = Integer.parseInt(inputLine[1]);
			System.out.println(calculateOperationCount(a, b));
		}
	}

	static int calculateOperationCount(int a, int b) {
		if (a == 0) {
			return 0;
		}
		if (a == b) {
			return 0;
		}
		if (a > b) {
			if (isEven(a)) {
				a = a / 2;
			} // end of isEven if
			else {
				a = (a - 1) / 2;
			}
		} else {
			if (b % a == 0) {
				a = a * 2;
			} else {
				if (isEven(a)) {
					a = a / 2;
				} else {
					a = (a - 1) / 2;
				}
			}
		}
		return calculateOperationCount(a, b) + 1;
	}

	private static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		}
		return false;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/COOKMACH.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
