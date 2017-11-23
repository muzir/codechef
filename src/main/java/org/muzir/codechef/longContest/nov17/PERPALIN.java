package org.muzir.codechef.longContest.nov17;

import java.io.*;

public class PERPALIN {
	private static boolean isCodechefModeOn = false;
	static String IMPOSSIBLE = "impossible";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String nr = br.readLine();
			String[] nrArray = nr.split(" ");
			int n = Integer.parseInt(nrArray[0]);
			int p = Integer.parseInt(nrArray[1]);
			System.out.println(constructPeriodicPolindrom(n, p));
		}
		br.close();
	}

	static String constructPeriodicPolindrom(int n, int p) {
		if (n < 2) {
			return IMPOSSIBLE;
		}
		if (p < 2) {
			return IMPOSSIBLE;
		}
		if (n % p != 0) {
			return IMPOSSIBLE;
		}
		int loopCount = n / p;
		if (p == 2) {
			return periodicPolindrom("ba", loopCount);
		}
		StringBuilder result = returnBase(p);
		return periodicPolindrom(result.toString(), loopCount);
	}

	private static StringBuilder returnBase(int p) {
		StringBuilder result = new StringBuilder("a");
		for (int i = 1; i < p - 1; i++) {
			result.append("b");
		}
		result.append("a");
		return result;
	}

	private static String periodicPolindrom(String base, int loopCount) {
		StringBuilder sb = new StringBuilder(base);
		for (int i = 1; i < loopCount; i++) {
			sb.append(base);
		}
		return sb.toString();
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/PERPALIN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
