package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TTENIS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String matchResult = readLine(dis);
			System.out.println(solution(matchResult));
		}
	}

	static String solution(String s) {
		int lenght = s.length();
		boolean extraTime = false;
		int chef = 0;
		int competitor = 0;

		for (int i = 0; i < lenght; i++) {
			char c = s.charAt(i);
			if (c == '0') {
				competitor++;
			}
			if (c == '1') {
				chef++;
			}
			if (competitor == 10 && chef == 10) {
				extraTime = true;
			}
			if (extraTime) {
				int diff = chef - competitor;
				if (diff == 2) {
					return "WIN";
				}
				if (diff == -2) {
					return "LOSE";
				}
			} else {
				if (competitor == 11) {
					return "LOSE";
				} // end of if
				if (chef == 11) {
					return "WIN";
				} // end of if
			} // end of else
		} // end of for loop
		return "-1";
	}

	static int[] getArrayOfString(String input) {
		String[] arrayStr = input.split(" ");
		int lenght = arrayStr.length;
		int[] returnArray = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/TTENIS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
