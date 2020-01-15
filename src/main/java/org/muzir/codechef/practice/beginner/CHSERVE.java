package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CHSERVE {
	static final String CHEF = "CHEF";
	static final String COOK = "COOK";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(solution(br.readLine()));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHSERVE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(String param) {
		int[] p1p2k = Arrays.stream(param.split(" ")).mapToInt(Integer::parseInt).toArray();
		int p1 = p1p2k[0];
		int p2 = p1p2k[1];
		int k = p1p2k[2];
		int total = p1 + p2;
		int division = total / k;
		String whoServeNext = division % 2 == 0 ? CHEF : COOK;
		return whoServeNext;
	}
}
