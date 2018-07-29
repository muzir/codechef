package org.muzir.codechef.practice.beginner;

import java.io.*;

public class ICPC16B {
	private static boolean isCodechefModeOn = false;
	private final static String YES = "yes";
	private final static String NO = "no";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String n = br.readLine();
			String series = br.readLine();
			System.out.println(checkBeautifulArray(series));
		}
		br.close();
	}

	static String checkBeautifulArray(String series) {
		String[] array = series.split(" ");
		int positiveCounter = 0;
		int negativeCounter = 0;
		int minusOneCounter = 0;
		int oneCounter = 0;
		int lenght = array.length;
		if (lenght == 1) {
			return YES;
		}
		for (int i = 0; i < lenght; i++) {
			String param = array[i];
			int intParam = Integer.parseInt(param);
			if (intParam == -1) {
				minusOneCounter++;
			} else if (intParam == 1) {
				oneCounter++;
			} else if (intParam > 1) {
				positiveCounter++;
				if (positiveCounter > 1) {
					return NO;
				}
			} else if (-1 > intParam) {
				negativeCounter++;
				if (negativeCounter > 1) {
					return NO;
				}
			}
			if (minusOneCounter > 0 && negativeCounter > 0) {
				return NO;
			}
			if (minusOneCounter > 0 && positiveCounter > 0) {
				return NO;
			}
			if (negativeCounter > 0 && positiveCounter > 0) {
				return NO;
			}
		}
		if (minusOneCounter > 1 && oneCounter == 0) {
			return NO;
		}
		return YES;
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ICPC16B.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
