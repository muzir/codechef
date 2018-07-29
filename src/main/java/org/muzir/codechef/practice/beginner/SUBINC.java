package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class SUBINC {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String parameters = br.readLine();
			System.out.println(calculateSubArrays(parameters));
		}
		br.close();
	}


	static int calculateSubArrays(String parameters) {
		int[] n = Arrays.stream(parameters.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		int lenght = n.length;
		int counter = 0;
		boolean isSubArrayStart = true;
		for (int i = 1; i < lenght; i++) {
			counter++;
			int current = n[i];
			int prev = n[i - 1];
			if (current >= prev) {
				if (isSubArrayStart) {
					counter++;
					isSubArrayStart = false;
				}
			} else {
				isSubArrayStart = true;
			}
		}
		counter++;
		return counter;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/SUBINC.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}


}
