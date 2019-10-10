package org.muzir.codechef.longContest.oct19b;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class SAKTAN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] params = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			int rowNum = params[0];
			int colNum = params[1];
			int stepNum = params[2];

			String[] stepParams = new String[stepNum];
			for (int j = 0; j < stepNum; j++) {
				stepParams[j] = br.readLine();
			}
			System.out.println(solution(rowNum, colNum, stepParams));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/SAKTAN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(int rowCount, int colCount, String[] paramArray) {

		int oddCounter = 0;

		HashMap<Integer, Integer> rowHashMap = new HashMap<>(rowCount);
		HashMap<Integer, Integer> colHashMap = new HashMap<>(colCount);

		Arrays.stream(paramArray).forEach(s -> {
			String[] params = s.split(" ");
			int row = Integer.parseInt(params[0]);
			int col = Integer.parseInt(params[1]);

			int rowSum = getValue(rowHashMap, row) + 1;
			rowHashMap.put(row, rowSum);

			int colSum = getValue(colHashMap, col) + 1;
			colHashMap.put(col, colSum);

		});

		for (int i = 1; i <= rowCount; i++) {
			int row = getValue(rowHashMap, i);
			for (int j = 1; j <= colCount; j++) {
				int col = getValue(colHashMap, j);
				int cellValue = row + col;
				if (isOdd(cellValue)) {
					oddCounter = oddCounter + 1;
				}
			}
		}
		return oddCounter;
	}

	private static int getValue(HashMap<Integer, Integer> map, int index) {
		return map.get(index) == null ? 0 : map.get(index);
	}

	private static boolean isOdd(int cellValue) {
		return cellValue % 2 == 1;
	}
}
