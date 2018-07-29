package org.muzir.codechef.practice.beginner;

import java.io.*;

public class ZUBREACH {
	private static boolean isCodechefModeOn = false;
	private static final String REACHED = "REACHED";
	private static final String DANGER = "DANGER";
	private static final String SOMEWHERE = "SOMEWHERE";


	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String[] mn = br.readLine().split(" ");
			int m = Integer.parseInt(mn[0]);
			int n = Integer.parseInt(mn[1]);
			String[] xy = br.readLine().split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			br.readLine();
			String sequence = br.readLine();
			System.out.println("Case " + (i + 1) + ": " + solution(sequence, x, y, m, n));
		}
		br.close();
	}

	static String solution(String sequence, int x, int y, int m, int n) {
		int coordinateX = 0;
		int coordinateY = 0;
		char[] s = sequence.toCharArray();
		int lenght = s.length;
		for (int i = 0; i < lenght; i++) {
			char c = s[i];
			if (c == 'U') {
				coordinateY++;
			} else if (c == 'D') {
				coordinateY--;
			} else if (c == 'R') {
				coordinateX++;
			} else if (c == 'L') {
				coordinateX--;
			}
		}

		if (coordinateX == x && coordinateY == y) {
			return REACHED;
		}

		if (coordinateX < 0 || coordinateX > m) {
			return DANGER;
		}
		if (coordinateY < 0 || coordinateY > n) {
			return DANGER;
		}
		return SOMEWHERE;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ZUBREACH.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
