package org.muzir.codechef.longContest.jan20b;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CHFDORA {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int rowCount = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()[0];
			String[] matrix = new String[rowCount];
			for (int j = 0; j < rowCount; j++) {
				matrix[j] = br.readLine();
			}
			System.out.println(solution(matrix));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHFDORA.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(String[] matrix) {
		int n = matrix.length;
		int m = matrix[0].length();
		int[][] intMatrix = new int[n][m];
		int k = 0;
		for (String s : matrix) {
			int[] row = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
			intMatrix[k] = row;
			k = k + 1;
		}
		System.out.println(Arrays.deepToString(intMatrix));
		for (int x = 2; x < n; x = x + 3) {
			for (int y = 2; y < m; y = y + 3) {

				for (int i = 0; i < x; i++) {
					for (int j = 0; j < y; j++) {
						System.out.println(intMatrix[i][j]);
					}
				}
			}
		}
		return 0;
	}
}
