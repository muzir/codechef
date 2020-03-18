package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WATSCORE {
	private static final List<Integer> NON_SCORABLE_PROBLEMS = Arrays.asList(9, 10, 11);
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] params = new String[n];
			for (int j = 0; j < n; j++) {
				params[j] = br.readLine();
			}
			System.out.println(solution(n, params));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/WATSCORE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(int n, String... params) {
		HashMap<Integer, Integer> maxMap = new HashMap<>(n);
		for (int i = 0; i < n; i++) {
			int[] ps = Arrays.stream(params[i].split(" ")).mapToInt(Integer::parseInt).toArray();
			int pId = ps[0];
			int sValue = ps[1];
			if (NON_SCORABLE_PROBLEMS.contains(pId)) {
				continue;
			} else if (maxMap.get(pId) == null) {
				maxMap.put(pId, sValue);
			} else if (maxMap.get(pId) < sValue) {
				maxMap.put(pId, sValue);
			}
		}
		int sum = maxMap.values().stream().mapToInt(Integer::intValue).sum();
		return sum;
	}
}
