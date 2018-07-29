package org.muzir.codechef.longContest.legacy;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CHCHCL {
	private static boolean isCodechefModeOff = true;

	public static void main(String args[]) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInputCount = readLine(dis);
		for (int k = 0; k < Integer.parseInt(lineOfInputCount.trim()); k++) {
			String line = readLine(dis);
			String result[] = line.split(" ");
			int row = Integer.parseInt(result[0]);
			int column = Integer.parseInt(result[1]);
			boolean isRowEven = isEven(row);
			boolean isColumnEven = isEven(column);
			if (isRowEven || isColumnEven) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	private static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		}
		return false;
	}

	private static InputStream createInputStream() {
		if (isCodechefModeOff) {
			String path = System.getProperty("user.dir");
			try {
				InputStream in = new FileInputStream(path + "/src/main/inputs/CHCHCL.txt");
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
