package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class WDTBAM {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			readLine(dis);
			String correctAnswer = readLine(dis);
			String chefAnswer = readLine(dis);
			String strAmount = readLine(dis);
			int[] amountArray = getArrayOfString(strAmount);
			System.out.println(findMaxWinAmount(amountArray, correctAnswer, chefAnswer));
		}
		dis.close();
	}

	static int findMaxWinAmount(int[] amountArray, String correctAnswer, String chefAnswer) {
		int counter = 0;
		int lenght = correctAnswer.length();
		for (int i = 0; i < lenght; i++) {
			char a = correctAnswer.charAt(i);
			char cA = chefAnswer.charAt(i);
			if (a == cA) {
				counter++;
			}
		}
		int max = 0;
		if (counter == lenght) {
			max = amountArray[lenght];
		}
		for (int i = 0; i <= counter; i++) {
			if (amountArray[i] > max) {
				max = amountArray[i];
			}
		}
		return max;
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
		InputStream in = new FileInputStream(path + "/WDTBAM.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
