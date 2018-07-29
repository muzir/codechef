package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class ALEXTASK {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			readLine(dis);
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			System.out.println(solution(a));
		}
		dis.close();
	}

	static String solution(int[] a) {
		int lenght = a.length;
		BigInteger ans = lcm(a[0], a[1]);
		for (int i = 0; i < lenght; i++) {
			for (int j = i + 1; j < lenght; j++) {
				int param1 = a[i];
				int param2 = a[j];
				ans = ans.min(lcm(param1, param2));
			}
		}
		return ans.toString();
	}

	private static BigInteger lcm(int i, int j) {
		BigInteger x = BigInteger.valueOf(i);
		BigInteger y = BigInteger.valueOf(j);
		BigInteger z = x.multiply(y);
		return z.divide(BigInteger.valueOf(gcd(i, j)));
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
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

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/ALEXTASK.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
