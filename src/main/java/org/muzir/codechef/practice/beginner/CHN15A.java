package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CHN15A {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int k = nk[1];
			String minionsDna = br.readLine();
			System.out.println(solution(k, minionsDna));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/CHN15A.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(int k, String minionsDna) {
		int[] minionDnaValues = Arrays.stream(minionsDna.split(" ")).mapToInt(Integer::parseInt).toArray();
		return (int) Arrays.stream(minionDnaValues).map(c -> c + k).filter(c -> c % 7 == 0).count();
	}
}
