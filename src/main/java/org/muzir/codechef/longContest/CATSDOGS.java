package org.muzir.codechef.longContest;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CATSDOGS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] cdl = readLine(dis).split(" ");
			int c = Integer.parseInt(cdl[0]);
			int d = Integer.parseInt(cdl[1]);
			int l = Integer.parseInt(cdl[2]);
			System.out.println(shepherd(c, d, l));
		}
	}

	static String shepherd(int c, int d, int l) {
		if (l % 4 != 0) {
			return "no";
		}
		int petsCount = l / 4;
		int catsCount = calculateCatsCount(c, d);
		int minCount = d + catsCount;
		int maxCount = d + c;
		if ((minCount <= petsCount) && (petsCount <= maxCount)) {
			return "yes";
		}
		return "no";
	}

	static int calculateCatsCount(int c, int d) {
		int catsCount = c - 2 * d;
		if (catsCount > 0) {
			return catsCount;
		}
		return 0;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/CATSDOGS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
