package org.muzir.codechef.practice.beginner;

import java.io.*;

public class TEMPLELA {
	private static boolean isCodechefModeOn = false;
	static final String no = "no";
	static final String yes = "yes";

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			System.out.println(checkTempleLand(br.readLine()));
		}
		br.close();
	}

	static String checkTempleLand(String s) {
		String[] sArray = s.split(" ");
		int length = sArray.length;
		if (length % 2 == 0) {
			return no;
		}
		int lastIndex = length - 1;
		if (!"1".equals(sArray[0]) || !"1".equals(sArray[lastIndex])) {
			return no;
		}
		int pivotIndex = length / 2;
		for (int i = 0; i < pivotIndex; i++) {
			if (!sArray[i].equals(sArray[lastIndex - i])) {
				return no;
			}
			int current = Integer.parseInt(sArray[i]);
			int next = Integer.parseInt(sArray[i + 1]);
			int diff = next - current;
			if (diff != 1) {
				return no;
			}
		}
		return yes;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/TEMPLELA.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
