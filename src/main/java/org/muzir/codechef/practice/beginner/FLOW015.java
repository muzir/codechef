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
public class FLOW015 {
	private static boolean isCodechefModeOn = false;
	private static final String[] days = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday",
			"sunday" };

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis).trim());
		for (int i = 0; i < testCaseCount; i++) {
			int year = Integer.parseInt(readLine(dis));
			System.out.println(solution(year));
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/FLOW015.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	public static String solution(int year) {
		int startingYear = 2001;
		if (year == startingYear) {
			return days[0];
		}
		int yearDiff = Math.abs(year - startingYear);
		int extraDays = calculateLeapYearCount(year, startingYear);
		extraDays = extraDays + yearDiff;
		int modCount = extraDays % 7;
		if (year > startingYear) {
			return days[modCount];
		} else {
			modCount = (7 - modCount) % 7;
			return days[modCount];
		}
	}

	static int calculateLeapYearCount(int year, int startingYear) {
		int min = Math.min(year, startingYear);
		int max = Math.max(year, startingYear);
		int counter = 0;
		for (int i = min; i < max; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				counter = counter + 1;
			}
		}
		return counter;
	}

}
