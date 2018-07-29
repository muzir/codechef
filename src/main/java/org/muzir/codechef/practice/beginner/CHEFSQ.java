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
public class CHEFSQ {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			readLine(dis);
			String sequence = readLine(dis);
			String[] sequenceArray = sequence.split(" ");
			readLine(dis);
			String favouriteSequence = readLine(dis);
			String[] favouriteSequenceArray = favouriteSequence.split(" ");
			System.out.println(isContain(sequenceArray, favouriteSequenceArray));
		}
	}

	static String isContain(String[] sequence, String[] favouriteSequence) {
		for (String s : favouriteSequence) {
			if (!isArrayContain(sequence, s)) {
				return "No";
			}
		}
		return "Yes";
	}

	private static boolean isArrayContain(String[] sequence, String s) {
		for (String seq : sequence) {
			if (seq.equals(s)) {
				return true;
			}
		}
		return false;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/CHEFSQ.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
