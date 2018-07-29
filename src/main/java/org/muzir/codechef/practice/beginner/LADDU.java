package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LADDU {
	private static boolean isCodechefModeOn = false;

	private static final String CONTEST_HOSTED = "CONTEST_HOSTED";
	private static final String CONTEST_WON = "CONTEST_WON";
	private static final String TOP_CONTRIBUTOR = "TOP_CONTRIBUTOR";
	private static final String BUG_FOUND = "BUG_FOUND";
	private static final String INDIAN = "INDIAN";

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String line = readLine(dis);
			String[] lines = line.split(" ");
			int testCase = Integer.parseInt(lines[0]);
			String nationality = lines[1];
			System.out.println(solution(testCase, nationality, dis));
		}
		dis.close();
	}

	static int solution(int testCount, String nationality, DataInputStream dis) throws IOException {
		int sum = 0;
		for (int i = 0; i < testCount; i++) {
			String line = readLine(dis);
			sum = sum + getPoint(line);
		}
		int v = 400;
		if (INDIAN.equals(nationality)) {
			v = 200;
		}
		int maxMonth = sum / v;
		return maxMonth;
	}

	static int getPoint(String line) {
		if (line == null || line.isEmpty()) {
			return 0;
		}
		if (CONTEST_HOSTED.equals(line)) {
			return 50;
		} else if (TOP_CONTRIBUTOR.equals(line)) {
			return 300;
		}
		String[] lines = line.split(" ");
		String type = lines[0];
		int typeInt = 0;
		try {
			typeInt = Integer.parseInt(lines[1]);
		} catch (Exception e) {
			return typeInt;
		}
		if (CONTEST_WON.equals(type)) {
			int bonus = 0;
			if (typeInt < 20) {
				bonus = 20 - typeInt;
			}
			return 300 + bonus;
		}
		if (BUG_FOUND.equals(type)) {
			return typeInt;
		}
		return 0;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/LADDU.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
