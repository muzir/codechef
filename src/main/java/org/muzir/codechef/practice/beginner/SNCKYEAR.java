package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class SNCKYEAR {
	static final String HOSTED = "HOSTED";
	static final String NOT_HOSTED = "NOT HOSTED";
	private static boolean isCodechefModeOn = false;
	private static Integer[] snackDownYears =
			{
					Integer.valueOf(2010),
					Integer.valueOf(2015),
					Integer.valueOf(2016),
					Integer.valueOf(2017),
					Integer.valueOf(2019)
			};

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			Integer param = Integer.valueOf(br.readLine());
			System.out.println(solution(param));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/SNCKYEAR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(Integer i) {
		if (isSnackdownYear(i)) {
			return HOSTED;
		}
		return NOT_HOSTED;
	}

	private static boolean isSnackdownYear(Integer i) {
		return Arrays.stream(snackDownYears).filter(p -> p.equals(i)).findAny().isPresent();
	}
}
