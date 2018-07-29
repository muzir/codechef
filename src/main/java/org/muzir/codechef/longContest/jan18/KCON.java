package org.muzir.codechef.longContest.jan18;

import java.io.*;
import java.util.Arrays;

public class KCON {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String[] nk = br.readLine().split(" ");
			int k = Integer.parseInt(nk[1]);
			String line = br.readLine();
			System.out.println(calculateMaxSubArray(line, k));
		}
		br.close();
	}

	public static long calculateMaxSubArray(String s, int k) {
		int[] tempArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = tempArray.length;
		long totalMax = getTotalMax(tempArray);
		long totalSum = getTotalSum(tempArray);

		if (k == 1) {
			return totalMax;
		}

		int[] dubleArray = new int[n * 2];
		int index = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				dubleArray[index] = tempArray[j];
				index++;
			}
		}

		long dubleTotalMax = getTotalMax(dubleArray);
		if (totalSum <= 0) {
			return dubleTotalMax;
		}
		long maxResult = totalSum * ((long) (k - 2)) + dubleTotalMax;
		return Math.max(maxResult, dubleTotalMax);
	}

	private static long getTotalSum(int[] tempArray) {
		long acc = 0;
		int lenght = tempArray.length;
		for (int i = 0; i < lenght; i++) {
			acc = acc + tempArray[i];
		}
		return acc;
	}

	private static long getTotalMax(int[] intArray) {
		int intLength = intArray.length;
		long totalMax = intArray[0];
		long lastValue = intArray[0];
		for (int i = 1; i < intLength; i++) {
			lastValue = Math.max(intArray[i], ((long) intArray[i] + lastValue));
			totalMax = Math.max(totalMax, lastValue);
		}
		return totalMax;
	}

	public static long calculateMaxSubArraySum(String s, int k) {
		int[] tempArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = tempArray.length;
		int lenght = n * k;
		int[] intArray = new int[lenght];
		int index = 0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				intArray[index] = tempArray[j];
				index++;
			}
		}
		int intLength = intArray.length;
		long totalMax = intArray[0];
		long lastValue = intArray[0];
		for (int i = 1; i < intLength; i++) {
			lastValue = Math.max(intArray[i], ((long)intArray[i] + lastValue));
			totalMax = Math.max(totalMax, lastValue);
		}
		return totalMax;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/KCON.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
