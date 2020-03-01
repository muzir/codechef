package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class HMAPPY2 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String nabk = br.readLine();
			System.out.println(solution1(nabk));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/HMAPPY2.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(String s) {
		long[] nabk = Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).toArray();
		long n = nabk[0];
		long a = nabk[1];
		long b = nabk[2];
		long k = nabk[3];
		int counter = 0;
		for (int i = 1; i < n + 1; i++) {
			boolean dividableByA = i % a == 0;
			boolean dividableByB = i % b == 0;
			if (dividableByA & dividableByB) {
				continue;
			} else if (dividableByA | dividableByB) {
				counter++;
			}
			if (counter == k) {
				return "Win";
			}
		}
		return "Lose";
	}

	public static String solution1(String s) {
		long[] nabk = Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).toArray();
		long n = nabk[0];
		long a = nabk[1];
		long b = nabk[2];
		long k = nabk[3];

		long countOfDividableByA = n / a;
		long countOfDividableByB = n / b;
		long lcm = lcm(a, b);
		long countOfLcm = n / lcm;
		long total = (countOfDividableByA + countOfDividableByB) - 2 * countOfLcm;
		if (total >= k) {
			return "Win";
		}
		return "Lose";
	}

	public static long lcm(long number1, long number2) {
		BigInteger gcd = BigInteger.valueOf(number1).gcd(BigInteger.valueOf(number2));
		BigInteger absProduct = BigInteger.valueOf(number1).multiply(BigInteger.valueOf(number2)).abs();
		return absProduct.divide(gcd).longValue();
	}
}
