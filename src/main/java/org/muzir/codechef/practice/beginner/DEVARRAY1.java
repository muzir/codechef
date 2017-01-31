package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DEVARRAY1 {
	private static boolean isCodechefModeOn = false;
	private static int min;
	private static int max;
	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String[] nq = readLine(dis).split(" ");
		int q = Integer.parseInt(nq[1]);
		String strArray = readLine(dis);
		int[] a = getArrayOfString(strArray);
		setMinMax(a);
		for (int i = 0; i < q; i++) {
			int v = Integer.parseInt(readLine(dis));
			if (v <= max && v >= min) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		dis.close();
		reader.close();
	}

	private static void setMinMax(int[] a) {
		min = a[0];
		max = 0;
		int lenght = a.length;
		for (int i = 0; i < lenght; i++) {
			int v = a[i];
			min = Math.min(v, min);
			max = Math.max(v, max);
		}
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
		InputStream in = new FileInputStream(path + "/DEVARRAY.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
