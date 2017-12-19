package org.muzir.codechef.practice.beginner;

import java.io.*;

public class SNAKPROC {
	private static boolean isCodechefModeOn = false;
	static final String INVALID = "Invalid";
	static final String VALID = "Valid";


	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String report = br.readLine();
			System.out.println(checkReport(report));
		}
		br.close();
	}

	static String checkReport(String report) {
		boolean hExist = false;
		boolean tExist = false;
		char[] reportArray = report.toCharArray();
		for (char c : reportArray) {
			if (c == 'T') {
				if (tExist) {
					return INVALID;
				} else if (!hExist) {
					return INVALID;
				}
				hExist = false;
				tExist = true;
			} else if (c == 'H') {
				if (hExist) {
					return INVALID;
				}
				hExist = true;
				tExist = false;
			}
		}
		if (hExist) {
			return INVALID;
		}
		return VALID;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/SNAKPROC.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
