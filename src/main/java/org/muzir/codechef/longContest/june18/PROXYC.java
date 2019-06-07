package org.muzir.codechef.longContest.june18;

import java.io.*;

public class PROXYC {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String s = br.readLine();
			System.out.println(solution(s));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/PROXYC.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(String s) {
		int d = s.length();
		char[] charArray = s.toCharArray();
		int pCounter = 0;
		for (char c : charArray) {
			if (c == 'P') {
				pCounter++;
			}
		}
		double p75 = Math.ceil((((float) d) * 75) / 100);
		int minimumProxy = (((int) p75) - pCounter);

		int proxyCounter = 0;
		for (int i = 0; i < d; i++) {
			char c = charArray[i];
			if ((c == 'A') && i != 0 && i != 1 && i != (d - 2) && i != (d - 1)) {
				char c2 = charArray[i - 2];
				char c1 = charArray[i - 1];

				char n2 = charArray[i + 2];
				char n1 = charArray[i + 1];

				if ((c1 == 'P' || c2 == 'P') && (n1 == 'P' || n2 == 'P')) {
					proxyCounter++;
				}
			}
		}

		if (minimumProxy < 0) {
			return 0;
		}

		if (proxyCounter >= minimumProxy) {
			return minimumProxy;
		}
		return -1;
	}
}
