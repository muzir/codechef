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
public class TWEED {
	private static boolean isCodechefModeOn = false;

	private static final String DEE = "Dee";
	private static final String DUM = "Dum";

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] nStartingPlayer = readLine(dis).split(" ");
			int param = Integer.parseInt(readLine(dis).split(" ")[0]);
			String startingPlayer = nStartingPlayer[1];
			int n = Integer.parseInt(nStartingPlayer[0]);
			if (n == 1) {
				if (DEE.equals(startingPlayer) && param % 2 == 0) {
					System.out.println(DEE);
				} else {
					System.out.println(DUM);
				}
			} else {
				System.out.println(DUM);
			}

		}
		dis.close();
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/TWEED.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
