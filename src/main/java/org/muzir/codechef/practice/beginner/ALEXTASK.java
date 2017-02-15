package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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
		boolean flag = true;
		int lenght = a.length;
		int counter = 0;
		int i = 2;
		List<Integer> listDivider = new ArrayList<>();
		while (counter != 2) {
			if (!flag) {
				i = i+1;
			}
			flag = false;
			for (int j = 0; j < lenght; j++) {
				int n = a[j];
				if(n==1){
					counter++;
					a[j] = -1;
					continue;
				}
				if (n % i == 0) {
					listDivider.add(i);
					int division = n / i;
					if (division == 1) {
						counter = counter + 1;
						if (counter == 2) {
							break;
						}
						a[j] = -1;
					} else {
						a[j] = division;
						flag = true;
					}
					
				} // end of outer if
			} // end of for
		} // end of while
		BigInteger listResult = calculateListResult(listDivider);
		return listResult.toString();
	}

	private static BigInteger calculateListResult(List<Integer> listDivider) {
		if (listDivider == null || listDivider.isEmpty()) {
			return BigInteger.ONE;
		}
		BigInteger result = BigInteger.ONE;
		for (Integer i : listDivider) {
			result = result.multiply(BigInteger.valueOf(i));
		}
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
		InputStream in = new FileInputStream(path + "/ALEXTASK.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
