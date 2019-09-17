package org.muzir.codechef.longContest.june19;

import java.io.*;
import java.math.BigDecimal;

public class KS2 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			long l = Long.parseLong(br.readLine());
			BigDecimal param = BigDecimal.valueOf(l).multiply(BigDecimal.TEN);
			System.out.println(solution(param).toPlainString());
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/KS2.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static BigDecimal solution(BigDecimal param) {
		if (isSumModuloEqualToZero(param)) {
			return param;
		}
		return solution(param.add(BigDecimal.ONE));
	}

	private static boolean isSumModuloEqualToZero(BigDecimal param) {
		String s = param.toPlainString();
		char[] charArray = s.toCharArray();
		long sum = 0;
		for (char c : charArray) {
			long i = Long.parseLong(String.valueOf(c));
			sum = sum + i;
		}
		return (sum % 10) == 0;
	}
}
