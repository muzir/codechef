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

	static long[] calculateDeep2(long... sequenceA) {
		int length = sequenceA.length;
		long[] sequenceB = new long[length * length];
		for (int i = 0; i < length; i++) {
			long currentItem = sequenceA[i];
			for (int j = 0; j < length; j++) {
				long subItem = sequenceA[j];
				long newItem = currentItem + subItem;
				int index = (i * length) + j;
				sequenceB[index] = newItem;
			}
		}
		return sequenceB;
	}

	static long[] calculateDeepN(int n, long... sequenceA) {
		int length = sequenceA.length;
		// -2 is coming from calculateDeep2 n power 2
		int cycleCount = (int) Math.pow(length, n - 2);
		int arraySize = (int) Math.pow(length, n);
		long[] sequenceB = new long[arraySize];
		for (int i = 0; i < cycleCount; i++) {
			long[] temp = calculateDeep2(sequenceA);
			for (int j = 0; j < temp.length; j++) {
				int index = (i * temp.length) + j;
				sequenceB[index] = temp[j];
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
