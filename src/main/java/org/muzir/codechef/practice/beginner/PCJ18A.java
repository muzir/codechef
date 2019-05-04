package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class PCJ18A {
	static final String NO = "NO";
	static final String YES = "YES";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nx = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = nx[0];
			int x = nx[1];
			int[] dishesSecretIngredient = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.println(solution(dishesSecretIngredient, x));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/PCJ18A.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(int[] dishesSecretIngredient, int leastSecretIngredientToBeLike) {
		if (isContainLeastSecretIngredientToBeLike(dishesSecretIngredient, leastSecretIngredientToBeLike)) {
			return YES;
		}
		return NO;
	}

	private static boolean isContainLeastSecretIngredientToBeLike(int[] dishesSecretIngredient, int leastSecretIngredientToBeLike) {
		return Arrays.stream(dishesSecretIngredient).anyMatch(i -> i >= leastSecretIngredientToBeLike);
	}
}

