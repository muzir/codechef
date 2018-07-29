package org.muzir.codechef.longContest.aprill18;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

/**
 * https://www.quora.com/Let-S-1-2-3-4-What-is-the-total-number-of-unordered-pairs-of-disjoint-subsets-of-S-equal-to
 */
public class AVGPR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			int[] sequence = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			System.out.println(solution1(sequence));
		}
		br.close();
	}

	static int solution(int[] sequence) {
		Arrays.sort(sequence);
		int length = sequence.length;
		int lastIndex = length - 1;
		int counter = 0;
		for (int j = 0; j < length; j++) {
			for (int i = j; i < lastIndex; i++) {
				int current = sequence[j];
				int nextIdex = i + 1;
				int next = sequence[nextIdex];
				if (isEligableToCompute(current, next)) {
					int avg = calculateAvg(current, next);
					int result = Arrays.binarySearch(sequence, j, nextIdex, avg);
					if (result >= 0) {
						counter++;
					}
				}
			}
		}
		return counter;
	}

	static int solution1(int[] sequence) {
		Arrays.sort(sequence);
		int length = sequence.length;
		HashSet<Integer> unOrderedSet = new HashSet<>();
		for (int i = 0; i < length; i++) {
			unOrderedSet.add(sequence[i]);
		}
		int lastIndex = length - 1;
		int counter = 0;
		for (int j = 0; j < length; j++) {
			for (int i = j; i < lastIndex; i++) {
				int current = sequence[j];
				int nextIdex = i + 1;
				int next = sequence[nextIdex];
				if (isEligableToCompute(current, next)) {
					int avg = calculateAvg(current, next);
					if (unOrderedSet.contains(avg)) {
						counter++;
					}
				}
			}
		}
		return counter;
	}

	private static int calculateAvg(int current, int next) {
		return (current + next) / 2;
	}

	private static boolean isEligableToCompute(int current, int next) {
		if (isEven(current) && isEven(next)) {
			return true;
		}
		if (!isEven(current) && !isEven(next)) {
			return true;
		}
		return false;
	}

	private static boolean isEven(int param) {
		return param % 2 == 0;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/AVGPR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
