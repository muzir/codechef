package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AVG {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String nkv = br.readLine();
			String elements = br.readLine();
			System.out.println(solution(nkv, elements));
		}
		br.close();
	}

	static int solution(String nkv, String elements) {
		int[] nkvValues = Arrays.stream(nkv.split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] elementsValue = Arrays.stream(elements.split(" ")).mapToInt(Integer::parseInt).toArray();
		Equation equation = new Equation(nkvValues[0], nkvValues[1], nkvValues[2], elementsValue);
		return equation.solve();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/AVG.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}


	static class Equation {

		private int average;
		private int arrayLength;
		private int missingElementCount;
		private int arraySum;
		private int[] elementsValue;

		public Equation(int arrayLength, int missingElementCount, int average, int[] elementsValue) {
			this.average = average;
			this.arrayLength = arrayLength;
			this.missingElementCount = missingElementCount;
			this.elementsValue = elementsValue;
			this.arraySum = Arrays.stream(elementsValue).sum();
		}

		int solve() {
			int total = average * (arrayLength + missingElementCount) - arraySum;
			if (total <= 0) {
				return -1;
			}
			if ((total % missingElementCount) == 0) {
				int deletedValue = total / missingElementCount;
				if (isUnique(deletedValue)) {
					return deletedValue;
				}
			}
			return -1;
		}

		private boolean isUnique(int deletedValue) {
			Arrays.sort(elementsValue);
			return Arrays.binarySearch(elementsValue, deletedValue) < 0;
		}
	}
}
