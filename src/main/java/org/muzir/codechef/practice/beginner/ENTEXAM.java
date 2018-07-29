package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class ENTEXAM {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			int[] nkem = getArrayOfString(readLine(dis));
			int n = nkem[0];
			int k = nkem[1];
			// int e = nkem[2];
			int m = nkem[3];
			BigInteger[] examsTotal = new BigInteger[n - 1];
			BigInteger sergeysTotalPoint = BigInteger.ZERO;
			for (int j = 0; j < n; j++) {
				BigInteger a = sumArrayOfString(readLine(dis));
				if (j != n - 1) {
					examsTotal[j] = a;
				} else {
					sergeysTotalPoint = a;
				}
			} // end of inner for
			System.out.println(solution(examsTotal, k, m, n, sergeysTotalPoint));
		}
		dis.close();
	}

	private static String solution(BigInteger[] examsTotal, int k, int m, int n, BigInteger sergeysTotalPoint) {
		BigInteger kStudent = BigInteger.ZERO;
		BigInteger diff = BigInteger.ZERO;
		if (n == k) {
			return BigInteger.ZERO.toString();
		}
		Arrays.sort(examsTotal, Collections.reverseOrder());
		kStudent = examsTotal[k - 1];
		kStudent = kStudent.add(BigInteger.ONE);
		if (sergeysTotalPoint.compareTo(kStudent) == 1) {
			return BigInteger.ZERO.toString();
		}
		diff = kStudent.subtract(sergeysTotalPoint);
		BigInteger bigM = new BigInteger(String.valueOf(m));
		if (diff.compareTo(bigM) == 1) {
			return "Impossible";
		}
		return diff.toString();
	}

	static int[] getArrayOfString(String input) {
		String[] arrayStr = input.split(" ");
		int lenght = arrayStr.length;
		int[] returnArray = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	static BigInteger sumArrayOfString(String input) {
		BigInteger sum = BigInteger.ZERO;
		try {
			String[] arrayStr = input.split(" ");
			int lenght = arrayStr.length;
			for (int i = 0; i < lenght; i++) {
				BigInteger v = new BigInteger(arrayStr[i]);
				sum = sum.add(v);
			}
		} catch (Exception e) {
		}
		return sum;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/ENTEXAM.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
