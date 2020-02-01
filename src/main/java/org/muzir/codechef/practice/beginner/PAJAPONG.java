package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PAJAPONG {
	static final String CHEF = "Chef";
	static final String PAJA = "Paja";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String xyk = br.readLine();
			System.out.println(solution(xyk));
		}
		br.close();
	}

	static String solution(String xyk) {
		int[] xykArray = Arrays.stream(xyk.split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = xykArray[0];
		int y = xykArray[1];
		int k = xykArray[2];

		int total = x + y;
		int division = total / k;
		if (division % 2 == 0) {
			return CHEF;
		}
		return PAJA;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/PAJAPONG.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
