package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LIFELTD {
	private final static String YES = "yes";
	private final static String NO = "no";
	private final static char charL = 'l';
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String[] matrix = new String[3];
			for (int j = 0; j < 3; j++) {
				matrix[j] = br.readLine();
			}
			System.out.println(solution(matrix));
		}
		br.close();
	}

	static String solution(String[] matrix) {
		int length = matrix.length;
		for (int i = 0; i < length; i++) {
			String line = matrix[i];
			char[] cells = line.toCharArray();
			int cellLength = cells.length;
			for (int j = 0; j < cellLength; j++) {
				char cellValue = cells[j];
				if (cellValue == charL && i != length - 1) {
					String belowLine = matrix[i + 1];
					char[] belowCells = belowLine.toCharArray();
					char belowCellValue = belowCells[j];
					if (belowCellValue == charL) {
						if (j != cellLength - 1) {
							char nextBelowRightValue = belowCells[j + 1];
							if (nextBelowRightValue == charL) {
								return YES;
							}
						}
					}
				}
			}
		}
		return NO;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/LIFELTD.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
