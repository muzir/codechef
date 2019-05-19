package org.muzir.codechef.longContest.may19;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class REDONE {
	static final long constant = 1_000_000_007l;
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		Calculator calculator = new Calculator();
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(calculator.solution(n));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/REDONE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static class Calculator {
		private Map<Long, Long> map;

		public Calculator() {
			map = new HashMap<>();
			map.put(1l, 1l);
		}

		public long solution(long n) {
			Long nCalculatedBefore = map.get(n);
			if (nCalculatedBefore != null) {
				return nCalculatedBefore;
			}
			for (long i = 2; i <= n; i++) {
				long temp = map.get(i - 1);
				if (map.get(i) == null) {
					map.put(i, calculateNextValue(i, temp));
				}
			}
			return map.get(n);
		}

		private long calculateNextValue(long current, long previous) {
			long sum = current + previous;
			long multiply = current * previous;
			return (sum + multiply) % constant;
		}
	}
}
