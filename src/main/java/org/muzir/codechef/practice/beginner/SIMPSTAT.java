package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class SIMPSTAT {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String[] nK = br.readLine().split(" ");
			int k = Integer.parseInt(nK[1]);
			String line = br.readLine();
			System.out.println(solution(line, k));
		}
		br.close();
	}

	static String solution(String line, int k) {
		int[] a = Arrays.stream(line.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		int lenght = a.length;
		double x = lenght;
		if (k != 0) {
			Arrays.sort(a);
			int highIndex = lenght - k;
			for (int i = 0; i < k; i++) {
				a[i] = 0;
			}
			for (int i = highIndex; i < lenght; i++) {
				a[i] = 0;
			}
			x = lenght - (2 * k);
		}
		double sum = 0;
		for (int i = 0; i < lenght; i++) {
			sum = sum + a[i];
		}

		double result = sum / x;
		return String.format("%.8f", result);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/SIMPSTAT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
