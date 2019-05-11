package org.muzir.codechef.longContest.may19;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class MATCHS {
	static final String RICH = "Rich";
	static final String ARI = "Ari";
	static String[] candidates = {ARI, RICH};

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			long[] nm = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
			resetCandidate();
			System.out.println(solution(nm[0], nm[1]));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MATCHS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(long n, long m) {
		String winner = candidates[0];
		//System.out.println("N:" + n + "M:" + m + "Winner:" + winner);
		long max = Math.max(n, m);
		long min = Math.min(n, m);
		if (max % min == 0) {
			resetCandidate();
			return winner;
		}
		long div = BigDecimal.valueOf(max).divide(BigDecimal.valueOf(min), RoundingMode.DOWN).longValue();
		if (div > 1) {
			resetCandidate();
			return winner;
		}
		swapCandidate();
		return solution(max - min, min);
	}

	private static void swapCandidate() {
		String temp = candidates[0];
		candidates[0] = candidates[1];
		candidates[1] = temp;
	}

	private static void resetCandidate() {
		candidates[0] = ARI;
		candidates[1] = RICH;
	}
}
