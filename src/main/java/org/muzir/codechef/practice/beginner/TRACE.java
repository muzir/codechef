package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class TRACE {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] matrix = new int[n][n];
			for (int j = 0; j < n; j++) {
				matrix[j] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			System.out.println(findMatrixMaxTrace(matrix, n));
		}
		br.close();
	}

	public static int findMatrixMaxTrace(int[][] matrix, int n) {
		int maxSum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int l = i + 1;
				maxSum = Math.max(maxSum, findTraceSum(matrix, i, j, l));
			}
		}
		return maxSum;
	}

	private static int findTraceSum(int[][] matrix, int row, int col, int l) {
		int sum = 0;
		for (int i = row; i < l; i++) {
			for (int j = col; j < l; j++) {
				sum = sum + matrix[i][j];
			}
		}
		return sum;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/TRACE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
