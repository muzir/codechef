package org.muzir.codechef.practice.beginner;

import java.io.*;

public class FRK {
	private static boolean isCodechefModeOn = false;
	private static final String CH = "ch";
	private static final String HE = "he";
	private static final String EF = "ef";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		int friendCounter = 0;
		for (int i = 0; i < testCaseCount; i++) {
			String name = br.readLine();
			if (name.contains(CH) || name.contains(HE) || name.contains(EF)) {
				friendCounter++;
			}
		}
		System.out.println(friendCounter);
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/FRK.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
