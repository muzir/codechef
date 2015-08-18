package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 * Started on 31/07/2015 9:30 PM
 * </p>
 * <p>
 * Finished on 3/08/2015 10:15 PM
 * </p>
 * 
 * @author erhun.baycelik
 *
 */
public class PERMUT2 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		for (;;) {
			String lineOfInput = readLine(dis);
			int lineOfInputCount = Integer.parseInt(lineOfInput);
			if (lineOfInputCount == 1) {
				System.out.println("ambiguous");
				readLine(dis);
				continue;
			}
			if (lineOfInputCount == 0) {
				break;
			}
			String input = readLine(dis);
			String[] inputArray = convertToInputArray(input);
			String[] inversePermutationArray = createInversePermutationArray(inputArray);
			if (isArrayBiDirectional(inputArray, inversePermutationArray)) {
				System.out.println("ambiguous");
			} else {
				System.out.println("not ambiguous");
			}
		}
	}

	private static boolean isArrayBiDirectional(String[] inputArray, String[] inversePermutationArray) {
		for (int i = 0; i < inputArray.length; i++) {
			String inputArrayParam = inputArray[i];
			String inversePermutationArrayParam = inversePermutationArray[i];
			if (inputArrayParam.equals(inversePermutationArrayParam)) {
				return false;
			}
		}
		for (int i = 0; i < inputArray.length; i++) {
			if (!inputArray[i].equals(inversePermutationArray[i])) {
				return false;
			}
		}

		return true;
	}

	private static String[] convertToInputArray(String input) {
		String[] arr = input.split(" ");
		return arr;
	}

	private static String[] createInversePermutationArray(String[] inputArray) {
		int lineOfInputCount = inputArray.length;
		String[] inversePermutationArray = new String[lineOfInputCount];
		for (int i = 0; i < lineOfInputCount; i++) {
			String val = inputArray[i];
			int inverseIndex = Integer.valueOf(val);
			inversePermutationArray[inverseIndex - 1] = String.valueOf(i + 1);
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
