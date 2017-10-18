package org.muzir.codechef.practice.beginner;

import java.io.*;

public class BRLADDER {
	private static boolean isCodechefModeOn = true;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String input = readLine(dis);
			String[] inputs = input.split(" ");
			int x = Integer.valueOf(inputs[0]);
			int y = Integer.valueOf(inputs[1]);
			System.out.println(printRoadExist(x, y));
		}
	}


	public static String printRoadExist(int x, int y) {
		if (isRoadExist(x, y)) {
			return "YES";
		}
		return "NO";
	}

	private static boolean isRoadExist(int x, int y) {
		if (isOddConsecutive(x, y)) {
			return true;
		} else if (isEvenConsecutive(x, y)) {
			return true;
		} else if (isCustomConsecutive(x, y)) {
			return true;
		}
		return false;
	}

	private static boolean isCustomConsecutive(int x, int y) {
		int min = Math.min(x, y);
		int max = Math.max(x, y);
		if (isOdd(min) && isEven(max)) {
			int minResult = solveMinCustom(Math.min(x, y));
			int maxResult = solveMaxCustom(Math.max(x, y));
			return minResult == maxResult;
		}
		return false;
	}

	private static boolean isEven(int max) {
		return !isOdd(max);
	}

	private static int solveMaxCustom(int max) {
		return (max - 2) / 2;
	}

	private static int solveMinCustom(int min) {
		return (min - 1) / 2;
	}

	private static boolean isEvenConsecutive(int x, int y) {
		int diff = Math.abs(x - y);
		if (diff != 2) {
			return false;
		}
		if (isEven(x) && isEven(y)) {
			return true;
		}
		return false;
	}

	private static boolean isOddConsecutive(int x, int y) {
		int diff = Math.abs(x - y);
		if (diff != 2) {
			return false;
		}
		if (isOdd(x) && isOdd(y)) {
			return true;
		}
		return false;
	}

	private static boolean isOdd(int x) {
		return x % 2 == 1;
	}


	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/BRLADDER.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
