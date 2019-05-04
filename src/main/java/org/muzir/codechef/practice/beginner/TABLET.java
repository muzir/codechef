package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class TABLET {
	static final String NO_TABLET = "no tablet";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] np = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			int n = np[0];
			int price = np[1];
			int[][] tabletMatrix = new int[n][3];
			for (int j = 0; j < n; j++) {
				int[] tabletRecords = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				tabletMatrix[j] = tabletRecords;
			}
			System.out.println(solution(tabletMatrix, price));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/TABLET.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(int[][] tabletMatrix, int price) {
		int n = tabletMatrix.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int[] tabletRecord = tabletMatrix[i];
			int wi = tabletRecord[0];
			int hi = tabletRecord[1];
			int pi = tabletRecord[2];
			if (pi <= price) {
				max = Math.max(max, wi * hi);
			}
		}
		if (max == 0) {
			return NO_TABLET;
		}
		return String.valueOf(max);
	}
}
