package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class STUDVOTE {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] nk = readLine(dis).split(" ");
			int k = Integer.parseInt(nk[1]);
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			System.out.println(solution(a, k));
		}
	}

	static int solution(int[] a, int k) {
		int counter = 0;
		int lenght = a.length;
		int[] output = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			int v = a[i];
			v = v - 1;
			if (v == i) {
				output[v] = -100;
			} else {
				int t = output[v];
				t = t + 1;
				output[v] = t;
			} // end of else
		} // end of for
		for (int j = 0; j < lenght; j++) {
			if (output[j] >= k) {
				counter++;
			}
		}
		return counter;
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
		InputStream in = new FileInputStream(path + "/src/main/inputs/STUDVOTE.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
