package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class PERFCONT {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String np = br.readLine();
			String[] npArray = np.split(" ");
			int n = Integer.parseInt(npArray[0]);
			int p = Integer.parseInt(npArray[1]);
			String solutions = br.readLine();
			System.out.println(checkBalancer(solutions, n, p));
		}
		br.close();
	}

	static String checkBalancer(String line, int solutionCount, int participants) {
		int[] solutions = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
		int cakeWalkLevel = participants / 2;
		int hardLevel = participants / 10;
		int hardCounter = 0;
		int cakeCounter = 0;
		for (int i = 0; i < solutionCount; i++) {
			int solutionScore = solutions[i];
			if (solutionScore <= hardLevel) {
				hardCounter++;
			} else if (solutionScore >= cakeWalkLevel) {
				cakeCounter++;
			}
		}
		if (isBalance(hardCounter, cakeCounter)) {
			return "yes";
		}
		return "no";
	}

	private static boolean isBalance(int hardCounter, int cakeCounter) {
		if (hardCounter == 2 && cakeCounter == 1) {
			return true;
		}
		return false;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/PERFCONT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
