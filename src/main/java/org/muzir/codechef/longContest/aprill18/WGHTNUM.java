package org.muzir.codechef.longContest.aprill18;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class WGHTNUM {
	private static boolean isCodechefModeOn = false;


	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			long[] nw = Arrays.stream(br.readLine().split(" "))
					.mapToLong(Long::parseLong)
					.toArray();
			long n = nw[0];
			long w = nw[1];
			System.out.println(solution(n, w));
		}
		br.close();
	}

	private static long solution(long n, long w) {
		long variants = calculateVariants(w);
		return calculateModulo(n, variants);
	}

	private static long calculateVariants(long w) {
		if (w > 9 || w < -9) {
			return 0;
		}
		if (w < 0) {
			w = Math.abs(w);
			return (9 - w) + 1;
		}
		return 9 - w;
	}

	private static long calculateModulo(long n, long variants) {
		String strModulo = "1000000007";
		BigInteger modulo = new BigInteger(strModulo);
		String strExponent = String.valueOf(n - 2);
		BigInteger exponent = new BigInteger(strExponent);
		BigInteger powerTen = BigInteger.TEN.modPow(exponent, modulo);
		return (variants * powerTen.longValueExact()) % Long.parseLong(strModulo);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/WGHTNUM.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
