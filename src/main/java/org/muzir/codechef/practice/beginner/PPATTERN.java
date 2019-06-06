package org.muzir.codechef.practice.beginner;

import java.io.*;

public class PPATTERN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int arg = Integer.parseInt(br.readLine());
			int[][] array = new int[arg][arg];
			solution(arg, 0, array);
			printMatrix(array);
		}
		br.close();
	}

	private static void solution(int arg, int param, int[][] array) {
		for (int i = 0; i < arg; i++) {
			for (int j = 0; j < arg; j++) {
				if (array[i][j] == 0) {
					param = param + 1;
					array[i][j] = param;
				} else {
					continue;
				}

				int tempRow = i + 1;
				int tempCol = j - 1;
				while (true) {
					if ((tempRow >= arg) || (tempCol < 0)) {
						break;
					}
					if (array[tempRow][tempCol] == 0) {
						param = param + 1;
						array[tempRow][tempCol] = param;
					}
					tempRow = tempRow + 1;
					tempCol = tempCol - 1;
				}
			}
		}
		int argPower = arg * arg;
		if (param == argPower) {
			return;
		}
		solution(arg, param, array);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/PPATTERN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	private static void printMatrix(int[][] matrix) {
		String output = "";
		int arg = matrix.length;
		for (int i = 0; i < arg; i++) {
			for (int j = 0; j < arg; j++) {
				output = output + matrix[i][j];
				if ((i == arg - 1) && (j == arg - 1)) {
					continue;
				} else if (j == arg - 1) {
					output = output + "\n";
				} else {
					output = output + " ";
				}
			}
		}
		System.out.println(output);
	}
}

