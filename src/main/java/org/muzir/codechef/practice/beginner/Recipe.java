package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author erhun.baycelik
 *
 */
public class Recipe {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInput = readLine(dis);
		int lineOfInputCount = Integer.parseInt(lineOfInput);
		for (int i = 0; i < lineOfInputCount; i++) {
			String intputExpression = readLine(dis);
			int[] numberArray = parseExpressionAsNumberArray(intputExpression);
			int[] array = divideArrayElementUntilReachMinElement(numberArray);
			printOutputArray(array);
		}
	}

	private static void printOutputArray(int[] array) {
		StringBuilder str = new StringBuilder();
		for (int i : array) {
			str.append(i).append(" ");
		}
		System.out.println(str.toString());
	}

	private static int[] divideArrayElementUntilReachMinElement(int[] array) {
		Arrays.sort(array);
		int minElement = array[0];
		for (int i = 1; i <= minElement; i++) {
			array = simplifyArray(array, i);
		}
		return array;
	}

	private static int[] simplifyArray(int[] array, int i) {
		for (int element : array) {
			int division = element % i;
			if (division != 0) {
				return array;
			}
		}
		for (int j = 0; j < array.length; j++) {
			int division = array[j] / i;
			array[j] = division;
		}
		return array;
	}

	private static int[] parseExpressionAsNumberArray(String intputExpression) {
		// System.out.println("Input:" + intputExpression);
		StringTokenizer tokenizer = new StringTokenizer(intputExpression, " ");
		String element = tokenizer.nextToken();
		int[] numberArray = new int[Integer.parseInt(element)];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = Integer.parseInt(tokenizer.nextToken());
		}
		return numberArray;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in;
		in = new FileInputStream(path + "/RECIPE.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
