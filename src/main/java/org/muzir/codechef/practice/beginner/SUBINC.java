package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public class SUBINC {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(readLine(dis));
			readLine(dis);
			System.out.println(permutation(n));
		}
	}

	static String permutation(int n) {
		if (n == 1 || n == 2) {
			return BigDecimal.ONE.toString();
		}
		BigDecimal arg = new BigDecimal(n);
		BigDecimal arg0 = arg.subtract(BigDecimal.ONE);
		BigDecimal arg1 = arg.multiply(arg0);
		BigDecimal arg2 = new BigDecimal(2);
		return arg1.divide(arg2).toString();
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/SUBINC.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
