package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class OMWG {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] nm = readLine(dis).split(" ");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			System.out.println(solution(n, m));
		}
	}

	static int solution(int n, int m) {
		int newN = n + 2;
		int newM = m + 2;
		int[][] matrix = new int[newN][newM];
		int acc = 0;
		for (int i = 1; i < newN - 1; i++) {
			for (int j = 1; j < newM - 1; j++) {
				int left = matrix[i][j - 1];
				int right = matrix[i][j + 1];
				int up = matrix[i + 1][j];
				int down = matrix[i - 1][j];
				matrix[i][j] = 1;
				acc = acc + left + right + up + down;
			} // end of ineer for
		} // end of outer for
		return acc;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/OMWG.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
