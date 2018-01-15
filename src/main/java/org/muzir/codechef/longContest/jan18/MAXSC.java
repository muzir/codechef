package org.muzir.codechef.longContest.jan18;

import java.io.*;
import java.util.Arrays;

/*
*
* 4
2
1 2
1 1
3
1 2 3
4 5 6
7 8 9
3
1 2 3
1 2 4
1 2 4
3
2 5 6
1 2 3
4 4 4
*
* */

public class MAXSC {
	private static boolean isCodechefModeOn = false;
	private static int[][] matrix = null;
	private static int[] indexArray = null;
	private static int impossibleFlag = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int lineCount = Integer.parseInt(br.readLine());
			impossibleFlag = 0;
			matrix = new int[lineCount][lineCount];
			for (int j = 0; j < lineCount; j++) {
				String line = br.readLine();
				matrix[j] = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			System.out.println(calculateMaxSum(matrix));
		}
		br.close();
	}

	static long calculateMaxSum(int[][] matrix) {
		int length = matrix.length;
		int lastIndex = length - 1;
		indexArray = new int[length];
		for (int i = 0; i < length; i++) {
			Arrays.sort(matrix[i]);
			if (i == 0) {
				indexArray[0] = lastIndex;
			} else {
				add(i, lastIndex);
				if (impossibleFlag < 0) {
					return -1;
				}
			}
		}
		return sumIndexArray();
	}

	private static long sumIndexArray() {
		int lenght = indexArray.length;
		long acc = 0;
		for (int i = 0; i < lenght; i++) {
			acc = acc + matrix[i][indexArray[i]];
		}
		return acc;
	}

	private static void add(int currentIndex, int currentMaxIndex) {
		int currentMax = matrix[currentIndex][currentMaxIndex];
		if (currentIndex == 0) {
			indexArray[currentIndex] = currentMaxIndex;
			return;
		}
		int prevMax = matrix[currentIndex - 1][indexArray[currentIndex - 1]];
		if (prevMax >= currentMax) {
			int prevMaxIndex = indexArray[currentIndex - 1] - 1;
			prevMax = matrix[currentIndex - 1][prevMaxIndex];
			while (prevMax >= currentMax) {
				prevMaxIndex = prevMaxIndex - 1;
				if (prevMaxIndex < 0) {
					impossibleFlag = -1;
					return;
				}
				prevMax = matrix[currentIndex - 1][prevMaxIndex];
			}
			add(currentIndex - 1, prevMaxIndex);
		}
		indexArray[currentIndex] = currentMaxIndex;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/MAXSC.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
