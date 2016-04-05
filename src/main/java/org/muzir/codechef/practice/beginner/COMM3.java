package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author erhun.baycelik
 *
 */
public class COMM3 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int lineOfInputCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < lineOfInputCount; i++) {
			String strAllowedDistanceBetweenPositions = readLine(dis);
			int allowedDistanceBetweenPositions = Integer.parseInt(strAllowedDistanceBetweenPositions);
			ArrayList<SimpleEntry> entryPairs = new ArrayList<SimpleEntry>();
			for (int j = 1; j < 3; j++) {
				String line = readLine(dis);
				StringTokenizer tokenizer = new StringTokenizer(line, " ");
				int param1 = Integer.parseInt(tokenizer.nextToken());
				int param2 = Integer.parseInt(tokenizer.nextToken());
				SimpleEntry<Integer, Integer> entry = new SimpleEntry(param1, param2);
				entryPairs.add(entry);
			}
			communicateTransavier(entryPairs);
		}
	}

	private static void communicateTransavier(ArrayList<SimpleEntry> entryPairs) {
		for (SimpleEntry<Integer, Integer> entry : entryPairs) {
			
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/SNAPE.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
