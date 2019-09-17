package org.muzir.codechef.longContest.june19;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CHFING {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			long[] nk = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
			long n = nk[0];
			long k = nk[1];
			System.out.println(findUnReachableNumbers(k, (k + n - 1l)));
		}
		br.close();
	}

	public static String findUnReachableNumbers(long firstParam, long secondParam) {
		List<Long> list = new ArrayList<>();
		for (long i = firstParam; i <= secondParam; i++) {
			list.add(i);
		}
		for (int i = 0; i < 100; i++) {
			long l = list.get(i);

			list = list.stream().sorted().collect(Collectors.toList());
		}
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHFING.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
