package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class MNMX {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String line = br.readLine();
			System.out.println(printMinimumCost(line));
		}
		br.close();
	}

	static long printMinimumCost(String line) {
		int[] array = Arrays.stream(line.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		Arrays.sort(array);
		int minimumValue = array[0];
		long arrayLenghMinusOne = array.length - 1;
		return minimumValue * arrayLenghMinusOne;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MNMX.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

}
