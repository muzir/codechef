package org.muzir.codechef.longContest.legacy;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RESERVOI1 {
	private static boolean isCodechefModeOn = false;

	private static final char WATER = 'W';
	private static final char BRICK = 'B';
	private static final char AIR = 'A';

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] strNM = readLine(dis).split(" ");
			int n = Integer.parseInt(strNM[0]);
			int m = Integer.parseInt(strNM[1]);
			Map<Entry<Integer, Integer>, Character> reservoi = createReservoi(n, m, dis);
			System.out.println(isReservoiStable(reservoi, n, m));
		}
		dis.close();
	}

	static Map<Entry<Integer, Integer>, Character> createReservoi(int n, int m, DataInputStream dis)
			throws IOException {
		Map<Entry<Integer, Integer>, Character> reservoi = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String row = readLine(dis);
			for (int j = 0; j < m; j++) {
				char c = row.charAt(j);
				Map.Entry<Integer, Integer> entry = new AbstractMap.SimpleEntry<Integer, Integer>(i, j);
				reservoi.put(entry, c);
			}
		}
		return reservoi;
	}

	static String isReservoiStable(Map<Entry<Integer, Integer>, Character> reservoi, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				Map.Entry<Integer, Integer> entry = new AbstractMap.SimpleEntry<Integer, Integer>(i, j);
				char current = reservoi.get(entry);
				Map.Entry<Integer, Integer> entryLeft = new AbstractMap.SimpleEntry<Integer, Integer>(i, j - 1);
				Character left = reservoi.get(entryLeft);
				if (left != null) {
					if (isLeftNotStable(current, left)) {
						return "no";
					}
				}
				Map.Entry<Integer, Integer> entryRight = new AbstractMap.SimpleEntry<Integer, Integer>(i, j + 1);
				Character right = reservoi.get(entryRight);
				if (right != null) {
					if (isRightNotStable(current, right)) {
						return "no";
					}
				}
				Map.Entry<Integer, Integer> entryAbove = new AbstractMap.SimpleEntry<Integer, Integer>(i - 1, j);
				Character above = reservoi.get(entryAbove);
				if (above != null) {
					if (isAboveNotStable(current, above)) {
						return "no";
					}
				}
				Map.Entry<Integer, Integer> entryBelow = new AbstractMap.SimpleEntry<Integer, Integer>(i + 1, j);
				Character below = reservoi.get(entryBelow);
				if (below != null) {
					if (isBelowNotStable(current, below)) {
						return "no";
					}
				}
			}

		}
		return "yes";
	}

	private static boolean isBelowNotStable(char c, char below) {
		switch (c) {
		case WATER:
			return below != BRICK ? true : false;
		case BRICK:
			return below != BRICK ? true : false;
		case AIR:
			return false;
		default:
			break;
		}
		return false;
	}

	private static boolean isAboveNotStable(char c, char above) {
		switch (c) {
		case WATER:
			return above != AIR ? true : false;
		case BRICK:
			return false;
		case AIR:
			return above != AIR ? true : false;
		default:
			break;
		}
		return false;
	}

	static boolean isRightNotStable(char c, char right) {
		return isLeftNotStable(c, right);
	}

	private static boolean isLeftNotStable(char c, char left) {
		switch (c) {
		case WATER:
			return left != BRICK ? true : false;
		case BRICK:
			break;
		case AIR:
			return left == WATER ? true : false;
		}
		return false;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/RESERVOI.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
