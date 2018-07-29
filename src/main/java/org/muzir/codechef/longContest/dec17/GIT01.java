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
		return Math.min(calculateFirstPattern(matrix), calculateSecondPattern(matrix));
	}

	private static int calculateFirstPattern(String[] matrix) {
		int length = matrix.length;
		int accumulator = 0;
		for (int i = 0; i < length; i++) {
			String line = matrix[i];
			int lineLenght = line.length();
			for (int j = 0; j < lineLenght; j++) {
				char c = line.charAt(j);
				if ((i + j) % 2 == 0) {
					if (c == 'G') {
						accumulator = accumulator + 3;
					}
				} else {
					if (c == 'R') {
						accumulator = accumulator + 5;
					}
				}

			}
		}
		return accumulator;
	}

	private static int calculateSecondPattern(String[] matrix) {
		int length = matrix.length;
		int accumulator = 0;
		for (int i = 0; i < length; i++) {
			String line = matrix[i];
			int lineLenght = line.length();
			for (int j = 0; j < lineLenght; j++) {
				char c = line.charAt(j);
				if ((i + j) % 2 == 0) {
					if (c == 'R') {
						accumulator = accumulator + 5;
					}
				} else {
					if (c == 'G') {
						accumulator = accumulator + 3;
					}
				}

			}
		}
		return accumulator;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/GIT01.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
