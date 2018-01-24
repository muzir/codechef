package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class SMRSTR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nq = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			int[] d = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.filter(k -> k != 1)
					.toArray();
			int[] q = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			System.out.println(findSmartStrategy(d.length, nq[1], d, q));
		}
		br.close();
	}

	static String findSmartStrategy(int dLenght, int qLenght, int[] d, int[] q) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < qLenght; i++) {
			int x = q[i];
			for (int j = 0; j < dLenght; j++) {
				x = Math.floorDiv(x, d[j]);
				if (x == 0) {
					break;
				}
			}
			sb.append(x);
			if (i != qLenght - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/SMRSTR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
