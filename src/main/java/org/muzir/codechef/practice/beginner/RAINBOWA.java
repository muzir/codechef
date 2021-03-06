package org.muzir.codechef.practice.beginner;

import java.io.*;

public class RAINBOWA {
	private static boolean isCodechefModeOn = false;
	static final String no = "no";
	static final String yes = "yes";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int lenght = Integer.parseInt(br.readLine());
			System.out.println(checkRainbowArray(br.readLine(), lenght));
		}
		br.close();
	}

	static String checkRainbowArray(String line, int lenght) {
		String[] sArray = line.split(" ");
		int pivotIndex = 0;
		if (lenght % 2 == 0) {
			pivotIndex = (lenght) / 2;
		} else {
			pivotIndex = (lenght - 1) / 2;
		}
		if (Integer.parseInt(sArray[pivotIndex]) != 7) {
			return no;
		}
		int current = Integer.parseInt(sArray[0]);
		if (current != 1) {
			return no;
		}
		int i = 0;
		int lastIndex = lenght - 1;
		while (i != pivotIndex) {
			int diff = Integer.parseInt(sArray[i + 1]) - Integer.parseInt(sArray[i]);
			if (diff != 0
					&& diff != 1) {
				return no;
			}
			if (Integer.parseInt(sArray[i]) != Integer.parseInt(sArray[(lastIndex - i)])) {
				return no;
			}
			i++;
		}
		return yes;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/RAINBOWA.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
