package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class RNDPAIR {
	private static boolean isCodechefModeOn = false;


	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int k = 0; k < testCaseCount; k++) {
			br.readLine();
			int[] intArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = intArray.length;
			int max = 0;
			for (int i = 0; i < n; ++i) {
				for (int j = i + 1; j < n; ++j) {
					max = Math.max(max, intArray[i] + intArray[j]);
				}
			}
			int num = 0, den = 0;
			for (int i = 0; i < n; ++i) {
				for (int j = i + 1; j < n; ++j) {
					if (intArray[i] + intArray[j] == max) {
						num += 1;
					}
					den += 1;
				}
			}
			double ans = num;
			ans = ans / (double)den;
			System.out.println(String.format( "%.8f", ans ) );
		}
		br.close();


	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/RNDPAIR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
