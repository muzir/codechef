package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class POTATOES {
	private static boolean isCodechefModeOn = false;
	private static Map<Integer, Boolean> IS_PRIME_CACHE = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] params = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(solution(params[0], params[1]));
		}
		br.close();
	}

	static int solution(int x, int y) {
		int total = x + y;
		int nextPrimeCounter = 1;
		for (; ; ) {
			total = total + 1;
			boolean isTotalPrime = isPrime(total);
			if (isTotalPrime) {
				return nextPrimeCounter;
			}
			nextPrimeCounter++;
			IS_PRIME_CACHE.put(total, isTotalPrime);
		}
	}

	static boolean isPrime(int total) {
		if (total < 2) {
			throw new IllegalArgumentException("Total can't be less than 2");
		}
		if (IS_PRIME_CACHE.get(total) != null) {
			return IS_PRIME_CACHE.get(total);
		}
		int paramMedium = (int) Math.sqrt(total);
		for (int i = 2; i <= paramMedium; i++) {
			if (total % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/POTATOES.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}


}
