package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class KFIB {
	private static boolean isCodechefModeOn = false;

	private static int MOD_CONS = 1000000007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		String line = br.readLine();
		int[] nk = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(calculateKthFibonacci(nk[0], nk[1]));
		br.close();
	}

	static int calculateKthFibonacci(int n, int k) {
		if (n - k == 1) {
			return k;
		}
		if (n <= k) {
			return 1;
		}
		return (2 * calculateKthFibonacci(n - 1, k) - 1) % MOD_CONS;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/KFIB.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
