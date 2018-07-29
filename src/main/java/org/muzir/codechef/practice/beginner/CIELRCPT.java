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
public class CIELRCPT {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int lineOfInputCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < lineOfInputCount; i++) {
			Integer input = Integer.valueOf(readLine(dis));
			int fraction = input / 2048;
			input = input % 2048;
			String binaryInput = Integer.toBinaryString(input);
			System.out.println(oneCount(binaryInput) + fraction);
		}
	}

	private static int oneCount(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == '1') {
				count = count + 1;
			}
		}
		return count;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/CIELRCPT.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
