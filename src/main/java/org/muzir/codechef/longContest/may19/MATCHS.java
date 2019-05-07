package org.muzir.codechef.longContest.may19;

import java.io.*;
import java.util.Arrays;

public class MATCHS {
	static final String RICH = "Rich";
	static final String ARI = "Ari";

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			long[] nm = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
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
		if (n == m) {
			return ARI;
		}
		long x = Math.max(n, m);
		long y = Math.min(n, m);
		long div = x / y;
		if ((div % 2) == 1 && div > 1) {
			return ARI;
		}
		return RICH;
	}
}
