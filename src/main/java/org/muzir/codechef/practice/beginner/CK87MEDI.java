package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CK87MEDI {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int k = Integer.parseInt(br.readLine().split(" ")[1]);
			System.out.println(chefEmploymentTest(br.readLine(), k));
		}
		br.close();
	}

	static int chefEmploymentTest(String s, int k) {
		int[] array = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(array);
		int lastIndex = array.length - 1;
		if (k == lastIndex) {
			return array[lastIndex];
		} else if (k > lastIndex) {
			return 100;
		}
		return array[(lastIndex + k) / 2];
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/CK87MEDI.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
