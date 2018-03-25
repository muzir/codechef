package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CO92JUDG {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			int[] a = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.sorted()
					.toArray();

			int[] b = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.sorted()
					.toArray();

			System.out.println(solution(a, b));
		}
		br.close();
	}

	static String solution(int[] a, int[] b) {
		a[a.length - 1] = 0;
		b[b.length - 1] = 0;

		int sumA = Arrays.stream(a).sum();
		int sumB = Arrays.stream(b).sum();
		if (sumA == sumB) return "Draw";
		if (sumA > sumB) return "Bob";
		return "Alice";
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/CO92JUDG.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
