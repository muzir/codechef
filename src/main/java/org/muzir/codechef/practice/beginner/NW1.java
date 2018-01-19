package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.HashMap;

public class NW1 {
	private static boolean isCodechefModeOn = false;

	private static final HashMap<String, Integer> days;

	static {
		days = new HashMap<String, Integer>();
		days.put("mon", 0);
		days.put("tues", 1);
		days.put("wed", 2);
		days.put("thurs", 3);
		days.put("fri", 4);
		days.put("sat", 5);
		days.put("sun", 6);
	}

	private static int[] dayCounts = {4, 4, 4, 4, 4, 4, 4};

	public static void main(String[] args) throws IOException {

		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String[] ws = br.readLine().split(" ");
			int w = Integer.parseInt(ws[0]);
			String day = ws[1];
			int dayIndex = days.get(day);
			int remaining = w - 28;
			for (int j = 0; j < remaining; j++) {
				dayCounts[dayIndex] = 5;
				dayIndex++;
			}
			int lenght = dayCounts.length;
			StringBuilder sb = new StringBuilder();
			for (int k = 0; k < lenght; k++) {
				sb.append(dayCounts[k]);
				if (k != lenght - 1) {
					sb.append(" ");
				}
			}

			System.out.println(sb.toString());
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/NW1.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
