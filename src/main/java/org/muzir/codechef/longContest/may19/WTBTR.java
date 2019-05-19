package org.muzir.codechef.longContest.may19;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class WTBTR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int matrixSize = Integer.parseInt(br.readLine());
			int[][] matrix = new int[matrixSize][matrixSize];
			for (int j = 0; j < matrixSize; j++) {
				matrix[j] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
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
			String filePath = path + "/src/main/inputs/WTBTR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static BigDecimal solution(int[][] matrix) {
		return BigDecimal.valueOf(0);
	}
}
