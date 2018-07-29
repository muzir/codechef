package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public class FLOW007 {
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
			for (int j = arguments.length - 1; i <= j; i++, j--) {
				char swap1 = arguments[i];
				char swap2 = arguments[j];
				arguments[i] = swap2;
				arguments[j] = swap1;
			}
			String strArgument = String.valueOf(arguments);
			BigDecimal output = new BigDecimal(strArgument);
			System.out.println(output);
		}
	}

	private static InputStream createInputStream() {
		if (isCodechefModeOff) {
			String path = System.getProperty("user.dir");
			try {
				InputStream in = new FileInputStream(path + "/src/main/inputs/FLOW007.txt");
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
