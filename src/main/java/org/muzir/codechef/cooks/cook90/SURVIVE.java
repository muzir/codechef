package org.muzir.codechef.cooks.cook90;

import java.io.*;
import java.util.Arrays;

public class SURVIVE {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nks = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(calculateMinDay(nks[0], nks[1], nks[2]));
		}
		br.close();
	}

	private static int calculateMinDay(int n, int k, int s) {
		int chocalateNeedToEat = s * k;
		int remainder = s / 7;
		int allowedDayToBuyChocalate = s - remainder;
		int acc = 0;
		for (int i = 0; i < allowedDayToBuyChocalate; i++) {
			acc = acc + n;
			if (acc >= chocalateNeedToEat) {
				return (i + 1);
			}
		}
		return -1;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/SURVIVE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
