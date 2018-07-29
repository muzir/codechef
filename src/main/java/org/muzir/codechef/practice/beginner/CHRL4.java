package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CHRL4 {

	private static boolean isCodechefModeOn = false;
	private static final int M = 1_000_000_007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] a = Arrays.stream(br.readLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		System.out.println(solution(a, k));
		br.close();
	}


	static int solution(int[] a, int k) {
		int lenght = a.length;
		if (lenght == 1) {
			return a[0];
		}
		int minimalProduct = a[0];
		for (int i = 0; i < lenght; i = i + k) {
			int tempProduct = (minimalProduct * a[i + 1]) % M;
			for (int j = 1; j <= k; j++) {
				int dest = a[i + j];
				int product = (a[i] * dest) % M;
				minimalProduct = Math.min(tempProduct, product);
			}
		}
		return minimalProduct;
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHRL4.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
