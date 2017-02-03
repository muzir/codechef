package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LCOLLIS {
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
			String[] matrix = new String[n];
			for (int j = 0; j < n; j++) {
				String line = readLine(dis);
				matrix[j] = line;
			}
			System.out.println(solution(matrix, n, m));
		}
	}

	static int solution(String[] matrix, int n, int m) {
		int collison = 0;
		for (int j = 0; j < m; j++) {
			int tempCounter = 0;
			for (int i = 0; i < n; i++) {
				char v = matrix[i].charAt(j);
				if (v == '1') {
					tempCounter++;
				}
			}
			collison = collison + calculateColision(tempCounter);
		}
		return collison;
	}

	private static int calculateColision(int tempCounter) {
		if (tempCounter < 2) {
			return 0;
		}
		return (tempCounter * (tempCounter - 1)) / 2;

	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/LCOLLIS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
