package org.muzir.codechef.cooks.cook90;

import java.io.*;

public class MULTHREE {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String line = br.readLine();
			String[] inputArray = line.split(" ");
			long k = Long.parseLong(inputArray[0]);
			int d0 = Integer.parseInt(inputArray[1]);
			int d1 = Integer.parseInt(inputArray[2]);
			System.out.println(checkMultipleThree(k, d0, d1));
		}
		br.close();
	}

	static String checkMultipleThree(long k, int d0, int d1) {
		long sum = d0 + d1;
		int[] array = new int[4];
		if (k < 6) {
			for (int i = 0; i < k; i++) {
				long mod0 = sum % 10;
				sum = sum + mod0;
			}
		} else {
			int d2 = (int) sum % 10;
			sum = sum + d2;
			for (int i = 0; i < 4; i++) {
				long mod0 = sum % 10l;
				array[i] = (int) mod0;
				sum = sum + mod0;
			}
			long remainder = (k - 3) % 4;
			sum = d0 + d1 + d2 + ((k - 3) / 4) * sumArray(array);
			for (int i = 0; i < remainder; i++) {
				sum = sum + array[i];
			}
		}

		if (sum % 3 == 0) {
			return "YES";
		}
		return "NO";
	}

	static int sumArray(int[] arr) {
		int l = arr.length;
		int acc = 0;
		for (int i = 0; i < l; i++) {
			acc = acc + arr[i];
		}
		return acc;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MULTHREE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
