package org.muzir.codechef.longContest;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class RESERVOI {
	private static boolean isCodechefModeOn = false;

	private static final char WATER = 'W';
	private static final char BRICK = 'B';
	private static final char AIR = 'A';
	private static final char EMPTY = 0;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] strNM = readLine(dis).split(" ");
			int n = Integer.parseInt(strNM[0]);
			int m = Integer.parseInt(strNM[1]);
			char[] reservoi = createReservoi(n, m, dis);
			System.out.println(isReservoiStable(reservoi, n, m));
		}
	}

	static String isReservoiStable(char[] reservoi, int n, int m) {
		int length = reservoi.length;
		for (int i = 0; i < length; i++) {
			char c = reservoi[i];
			char left = getLeft(i, m, reservoi, length);
			if (isLeftNotStable(c, left)) {
				// System.out.println("Left No:" + i);
				return "no";
			}
			char right = getRight(i, m, reservoi, length);
			if (isRightNotStable(c, right)) {
				// System.out.println("Right No:" + i);
				return "no";
			}
			char above = getAbove(i, m, reservoi, length);
			if (isAboveNotStable(c, above)) {
				// System.out.println("above No:" + i);
				return "no";
			}
			char below = getBelow(i, m, reservoi, length);
			if (isBelowNotStable(c, below)) {
				// System.out.println("below No:" + i);
				return "no";
			}
		}
		return "yes";
	}

	private static char getBelow(int i, int m, char[] reservoi, int length) {
		char below = EMPTY;
		if (isBelowExist(i, m, length)) {
			below = reservoi[i + m];
		}
		return below;
	}

	private static char getAbove(int i, int m, char[] reservoi, int length) {
		char above = EMPTY;
		if (isAboveExist(i, m, length)) {
			above = reservoi[i - m];
		}
		return above;
	}

	private static char getRight(int i, int m, char[] reservoi, int length) {
		char right = EMPTY;
		if (isRightExist(i, m, length)) {
			right = reservoi[i + 1];
		}
		return right;
	}

	private static char getLeft(int i, int m, char[] reservoi, int length) {
		char left = EMPTY;
		if (isLeftExist(i, m, length)) {
			left = reservoi[i - 1];
		}
		return left;
	}

	private static boolean isBelowNotStable(char c, char below) {
		switch (c) {
		case WATER:
			if(below==WATER){
				return false;
			}
			return below != BRICK ? true : false;
		case BRICK:
			return below != EMPTY && below != BRICK ? true : false;
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
			return above != EMPTY && above != AIR && above != WATER ? true : false;
		case BRICK:
			return false;
		case AIR:
			return above != EMPTY && above != AIR ? true : false;
		default:
			break;
		}
		return false;
	}

	static boolean isRightNotStable(char c, char right) {
		switch (c) {
		case WATER:
			return right != BRICK && right != WATER ? true : false;
		case BRICK:
			return false;
		case AIR:
			return right == WATER ? true : false;
		}
		return false;
	}

	private static boolean isLeftNotStable(char c, char left) {
		switch (c) {
		case WATER:
			return left != BRICK && left != WATER ? true : false;
		case BRICK:
			return false;
		case AIR:
			return left == WATER ? true : false;
		}
		return false;
	}

	private static boolean isBelowExist(int i, int m, int length) {
		return isExist(i + m, length);
	}

	private static boolean isAboveExist(int i, int m, int length) {
		return isExist(i - m, length);
	}

	private static boolean isRightExist(int i, int m, int length) {
		if ((i + 1) % m == 0) {
			return false;
		}
		return isExist(i + 1, length);
	}

	private static boolean isLeftExist(int i, int m, int length) {
		if (i % m == 0) {
			return false;
		}
		return isExist(i - 1, length);
	}

	private static boolean isExist(int i, int length) {
		if (0 <= i && i < length) {
			return true;
		}
		return false;
	}

	static char[] createReservoi(int n, int m, DataInputStream dis) throws IOException {
		int lenght = n * m;
		char[] input = new char[lenght];
		int counter = 0;
		for (int i = 0; i < n; i++) {
			String row = readLine(dis);
			for (int j = 0; j < m; j++) {
				char c = row.charAt(j);
				input[counter] = c;
				counter++;
			}
		}
		return input;
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
