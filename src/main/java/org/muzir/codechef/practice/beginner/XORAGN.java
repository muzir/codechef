package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class XORAGN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String sequence = br.readLine();
			System.out.println(solution(sequence));
		}
		br.close();
	}

	static long solution(String sequence) {
		long[] sequenceA = Arrays.stream(sequence.split(" ")).mapToLong(Long::parseLong).toArray();
		//long[] sequenceB = calculateSequenceB(sequenceA);
		return 2 * computeXOR(sequenceA);
	}

	static long[] calculateSequenceB(long[] sequenceA) {
		long[] sequenceB = new long[sequenceA.length * sequenceA.length];
		for (int i = 0; i < sequenceA.length; i++) {
			long currentItem = sequenceA[i];
			for (int j = 0; j < sequenceA.length; j++) {
				long subItem = sequenceA[j];
				long newItem = currentItem + subItem;
				int index = (i * sequenceA.length) + j;
				sequenceB[index] = newItem;
			}
		}
		return sequenceB;
	}

	static long computeXOR(long... sequence) {
		long previousResult = sequence[0];
		if (sequence.length == 1) {
			return previousResult;
		}
		for (int i = 0; i < sequence.length - 1; i++) {
			long nextElement = sequence[i + 1];
			previousResult = previousResult ^ nextElement;
		}
		return previousResult;
	}

	static long computeXOR(long a, long b) {
		return a ^ b;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/XORAGN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
