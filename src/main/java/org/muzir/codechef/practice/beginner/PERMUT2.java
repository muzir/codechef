package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Started on 31/07/2015 9:30 PM
 * 
 * @author erhun.baycelik
 *
 */
public class PERMUT2 {
	private static boolean isCodechefModeOn = true;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInput = readLine(dis);
		for (;;) {
			int lineOfInputCount = Integer.parseInt(lineOfInput);
			if (lineOfInputCount == 1) {
				System.out.println("ambiguous");
				continue;
			}
			if (lineOfInputCount == 0) {
				break;
			}
			int[] inversePermutationArray = createInversePermutationArray(lineOfInputCount);
			String input = readLine(dis);
			int[] inputArray = convertToInputArray(input);
			if (isArrayBiDirectional(inputArray, inversePermutationArray)) {
				System.out.println("ambiguous");
			} else {
				System.out.println("not ambiguous");
			}
		}
	}

	private static boolean isArrayBiDirectional(int[] inputArray, int[] inversePermutationArray) {
		
		return false;
	}

	private static int[] convertToInputArray(String input) {
		String[] arr = input.split(" ");
		int arrayLenght = arr.length;
		int[] intArr = new int[arrayLenght];
		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}

	private static int[] createInversePermutationArray(int lineOfInputCount) {
		int[] inversePermutationArray = new int[lineOfInputCount];
		inversePermutationArray[0] = lineOfInputCount;
		for (int i = 1; i < lineOfInputCount; i++) {
			inversePermutationArray[i] = i;
		}
		return inversePermutationArray;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in;
		in = new FileInputStream(path + "/PERMUT2");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
