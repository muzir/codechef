package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class NAICHEF {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nab = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = nab[0];
			int a = nab[1];
			int b = nab[2];
			int[] dieFaceValues = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(solution(dieFaceValues, a, b));
		}
		br.close();
	}

	static String solution(int[] dieFaceValues, int a, int b) {
		BigDecimal n = new BigDecimal(dieFaceValues.length);
		BigDecimal aTimesMatch = matchCount(dieFaceValues, a);
		BigDecimal bTimesMatch = matchCount(dieFaceValues, b);
		BigDecimal aRatio = aTimesMatch.divide(n, 10, BigDecimal.ROUND_UP);
		BigDecimal bRatio = bTimesMatch.divide(n, 10, BigDecimal.ROUND_UP);
		BigDecimal result = aRatio.multiply(bRatio);
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMinimumFractionDigits(10);
		decimalFormat.setGroupingUsed(false);
		return decimalFormat.format(result);
	}

	private static BigDecimal matchCount(int[] arr, int param) {
		return new BigDecimal(Arrays.stream(arr).filter(i -> i == param).count());
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/NAICHEF.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
