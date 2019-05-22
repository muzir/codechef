package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class MAGICHF {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nxs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int s = nxs[2];
			int x = nxs[1];
			Pair[] swapPairs = new Pair[s];
			for (int j = 0; j < s; j++) {
				int[] swaps = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				Pair pair = new Pair(swaps[0], swaps[1]);
				swapPairs[j] = pair;
			}
			System.out.println(solution(x, swapPairs));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MAGICHF.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(int x, Pair[] pairs) {
		for (Pair p : pairs) {
			if (x == p.getA()) {
				x = p.getB();
			} else if (x == p.getB()) {
				x = p.getA();
			}
		}
		return x;
	}

	static class Pair {
		private final int a;
		private final int b;

		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int getA() {
			return a;
		}

		public int getB() {
			return b;
		}
	}
}
