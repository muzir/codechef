package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class DEVARRAY {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		String[] nq = br.readLine().split(" ");
		int n = Integer.parseInt(nq[0]);
		int q = Integer.parseInt(nq[1]);
		String strArray = br.readLine();
		int[] a = Arrays.stream(strArray.split(" "))
				.mapToInt(Integer::parseInt)
				.sorted()
				.toArray();
		int first = a[0];
		int last = a[n - 1];
		for (int i = 0; i < q; i++) {
			int v = Integer.parseInt(br.readLine());
			if (v <= last && v >= first) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/DEVARRAY.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
