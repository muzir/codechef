package org.muzir.codechef.longContest.dec17;

import java.io.*;

public class GIT01 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String nm = br.readLine();
			int n = Integer.parseInt(nm.split(" ")[0]);
			int m = Integer.parseInt(nm.split(" ")[1]);
			String[] matrix = getMatrix(br, n, m);
			System.out.println(calculateMinCost(matrix));
		}
		br.close();
	}

	private static String[] getMatrix(BufferedReader rd, int n, int m) throws IOException {
		String[] matrix = new String[n];
		for (int i = 0; i < n; i++) {
			String line = rd.readLine();
			matrix[i] = line;
		}
		return matrix;
	}

	static int calculateMinCost(String[] matrix) {
		int accumulator = 0;
		int lenght = matrix.length;
		for (int i = 0; i < lenght; i++) {
			accumulator = accumulator + calculateChar(matrix[i]);
		}
		return accumulator;
	}

	private static int calculateChar(String line) {
		int evenR = 0;
		int evenG = 0;
		int oddR = 0;
		int oddG = 0;

		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c == 'R') {
				if (isEven(i)) {
					evenR++;
				} else {
					oddR++;
				}
			} else if (c == 'G') {
				if (isEven(i)) {
					evenG++;
				} else {
					oddG++;
				}
			}
		}
		if (evenG == evenR) {
			if (oddG == oddR) {
				return 0;
			} else if (oddG > oddR) {
				return oddR * 5 + evenG * 3;
			} else {
				return oddG * 3 + evenR * 5;
			}
		}
		if (evenG > evenR) {
			return evenR * 5 + oddG * 3;
		} else {
			return oddR * 5 + evenG * 3;
		}
	}


	static boolean isEven(int n) {
		return n % 2 == 0;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/GIT01.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
