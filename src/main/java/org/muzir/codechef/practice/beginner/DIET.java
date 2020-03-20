package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class DIET {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = nk[0];
			int k = nk[1];
			String dailyProteins = br.readLine();
			System.out.println(solution(k, dailyProteins));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/DIET.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(int k, String dailyProteins) {
		int[] proteins = Arrays.stream(dailyProteins.split(" ")).mapToInt(Integer::parseInt).toArray();
		int remainingProtein = 0;
		for (int i = 0; i < proteins.length; i++) {
			int currentDayProtein = proteins[i];
			currentDayProtein = currentDayProtein + remainingProtein;
			remainingProtein = currentDayProtein - k;
			if (remainingProtein < 0) {
				return "NO " + (i + 1);
			}
		}
		return "YES";
	}
}
