package org.muzir.codechef.longContest.feb18;

import java.io.*;
import java.util.Arrays;

public class CHEFPTNT {
	private static boolean isCodechefModeOn = false;
	static final String YES = "yes";
	static final String NO = "no";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String nmxk = br.readLine();
			String workers = br.readLine();
			System.out.println(finishPatentCases(nmxk, workers));
		}
		br.close();
	}

	static String finishPatentCases(String nmxk, String workers) {
		int[] array = Arrays.stream(nmxk.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

		int n = array[0];
		int m = array[1];
		int x = array[2];
		int k = array[3];

		int evenWorkersCount = 0;
		for (int i = 0; i < k; i++) {
			if (workers.charAt(i) == 'E') {
				evenWorkersCount++;
			}
		}
		int oddWorkersCount = k - evenWorkersCount;
		int result = calculateMaxLabor(evenWorkersCount, oddWorkersCount, m, x);
		if (result >= n) {
			return YES;
		}
		return NO;
	}

	static int calculateMaxLabor(int evenWorkersCount, int oddWorkersCount, int m, int x) {
		int evenMountsCount = m / 2;
		int oddMountsCount = Math.round((float) m / 2f);

		return Math.min(evenMountsCount * x, evenWorkersCount) + Math.min(oddMountsCount * x, oddWorkersCount);
	}

	static int calculateResult(int evenWorkersCount, int oddWorkersCount, int m, int x) {
		if (m == 0) {
			return 0;
		}
		if (isEvenMonth(m)) {
			if (isWorkerCountFinished(evenWorkersCount)) {
				return 0;
			}
			int labor = getLabor(evenWorkersCount, x);
			return labor + calculateResult(evenWorkersCount - labor, oddWorkersCount, m - 1, x);
		}
		if (isWorkerCountFinished(oddWorkersCount)) {
			return 0;
		}
		int labor = getLabor(oddWorkersCount, x);
		return labor + calculateResult(evenWorkersCount, oddWorkersCount - labor, m - 1, x);
	}

	private static boolean isWorkerCountFinished(int workerCount) {
		if (workerCount == 0) {
			return true;
		}
		return false;
	}

	private static boolean isEvenMonth(int month) {
		if (month % 2 == 0) {
			return true;
		}
		return false;
	}

	private static int getLabor(int workerCount, int x) {
		if (workerCount > x) {
			return x;
		}
		return workerCount;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHEFPTNT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
