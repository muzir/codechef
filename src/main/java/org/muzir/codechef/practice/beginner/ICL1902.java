package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ICL1902 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int param = Integer.parseInt(br.readLine());
			System.out.println(solution(param));
		}
		br.close();
	}

	 static int solution(int param) {
		return calculateCircles(param, 0);
	}

	private static int calculateCircles(int circleCount, int counter) {
		if (circleCount == 0) {
			return counter;
		}
		int squareRoot = (int) Math.sqrt(circleCount);
		int rootPow = squareRoot * squareRoot;
		circleCount = circleCount - rootPow;
		counter++;
		return calculateCircles(circleCount, counter);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ICL1902.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
