package org.muzir.codechef.longContest.june19;

import java.io.*;
import java.math.BigInteger;

public class RSIGNS {
	static final int MODULO_CONSTANT = 1_000_000_007;
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int k = Integer.parseInt(br.readLine());
			System.out.println(computeViaFormula(k));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/RSIGNS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static long computeViaFormula(int k) {
		BigInteger modConstant = BigInteger.valueOf(MODULO_CONSTANT);
		BigInteger result = new BigInteger("2").modPow(BigInteger.valueOf(k - 1), modConstant).multiply(BigInteger.TEN).mod(modConstant);
		return result.longValue();
	}


	/*public static long solution(int k) {
		long l = ((long) Math.pow(10, k)) - 1l;
		long counter = 0;
		for (long i = 0; i <= l; i++) {
			long l1 = l - i;
			if (isTwoDistinctDigit(l1, i)) {
				counter = counter + 1;
			}
		}
		return counter;
	}*/

	/*private static boolean isTwoDistinctDigit(long param, long param1) {
		String s1 = String.valueOf(param);
		String s2 = String.valueOf(param1);

		Map<Character, Integer> charMaps = new HashMap<>();

		char[] charArray1 = s1.toCharArray();
		for (char c : charArray1) {
			charMaps.put(Character.valueOf(c), 1);
		}

		char[] charArray2 = s2.toCharArray();
		for (char c : charArray2) {
			charMaps.put(Character.valueOf(c), 1);
		}

		return charMaps.size() == 2;
	}*/

}
