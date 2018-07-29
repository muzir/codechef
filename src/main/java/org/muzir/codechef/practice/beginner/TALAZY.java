package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class TALAZY {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] nbm = readLine(dis).split(" ");
			BigInteger n = new BigInteger(nbm[0]);
			BigInteger b = new BigInteger(nbm[1]);
			BigInteger m = new BigInteger(nbm[2]);
			System.out.println(solution(n, b, m));
		}
	}

	static BigInteger solution(BigInteger n, BigInteger b, BigInteger m) {
		if (n.equals(BigInteger.ZERO)) {
			return BigInteger.ZERO;
		}
		BigInteger two = new BigInteger("2");
		BigInteger solvedQ = BigInteger.ZERO;
		if (n.mod(two).equals(BigInteger.ZERO)) {
			solvedQ = n.divide(two);
		} else {
			solvedQ = (n.add(BigInteger.ONE).divide(two));
		}
		BigInteger remainingQ = n.subtract(solvedQ);
		BigInteger time = solvedQ.multiply(m);
		if (!remainingQ.equals(BigInteger.ZERO)) {
			time=time.add(b);
		}
		m = m.multiply(two);
		return time.add(solution(remainingQ, b, m));

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
		InputStream in = new FileInputStream(path + "/src/main/inputs/TALAZY.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
