package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class CHEFDETE {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		Integer.parseInt(readLine(dis));
		String line = readLine(dis);
		int[] a = getArrayOfString(line);
		System.out.println(solution(a));
		dis.close();
	}

	static String solution(int[] a) {
		int lenght = a.length;
		int[] output = new int[lenght];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < lenght; i++) {
			int v = a[i];
			map.put(i, v);
			output[i] = i + 1;
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			int value = e.getValue();
			if (value == 0) {
				int donIndex = e.getKey();
				output[donIndex] = -1;
				continue;
			}
			int index = value - 1;
			output[index] = -1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lenght; i++) {
			int value = output[i];
			if (value != -1) {
				sb.append(value).append(" ");
			}
		}
		String result = sb.toString();
		if (result.isEmpty()) {
			return result;
		}
		result = result.substring(0, sb.toString().length() - 1);
		return result;
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
		InputStream in = new FileInputStream(path + "/src/main/inputs/CHEFDETE.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
