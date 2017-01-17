package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Arrays;

public class SIMPSTAT {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] nK = readLine(dis).split(" ");
			int k = Integer.parseInt(nK[1]);
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			System.out.println(solution(a, k));
		}
		dis.close();
	}

	static String solution(int[] a, int k) {
		int lenght = a.length;
		double x = lenght;
		if (k != 0) {
			Arrays.sort(a);
			int lowIndex = k - 1;
			int highIndex = lenght - k;
			a[lowIndex] = 0;
			a[highIndex] = 0;
			x = lenght - 2;
		}
		double sum = 0;
		for (int i = 0; i < lenght; i++) {
			sum = sum + a[i];
		}
		DecimalFormat df = new DecimalFormat("#0.000000");
		double result = (double) sum / (double) x;
		return df.format(result);
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
		InputStream in = new FileInputStream(path + "/SIMPSTAT.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
