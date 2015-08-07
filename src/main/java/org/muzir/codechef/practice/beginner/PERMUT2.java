package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

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
			String[] inversePermutationArray = createInversePermutationArray(lineOfInputCount);
			String input = readLine(dis);
			String[] inputArray = convertToInputArray(input);
			if (isArrayBiDirectional(inputArray, inversePermutationArray)) {
				System.out.println("ambiguous");
			} else {
				System.out.println("not ambiguous");
			}
		}
	}

	private static boolean isArrayBiDirectional(String[] inputArray,
			String[] inversePermutationArray) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < inputArray.length; i++) {
			String inputArrayParam = inputArray[i];
			String inversePermutationArrayParam = inversePermutationArray[i];
			if (inputArrayParam.equals(inversePermutationArrayParam)) {
				return false;
			}
			map.put(inputArrayParam, inversePermutationArrayParam);
		}
		// System.out.println("Map:" + map.toString());
		for (int i = 0; i < inputArray.length; i++) {
			String inputArrayParam = inputArray[i];
			String inversePermutationArrayParam = inversePermutationArray[i];
			String sMapValue = map.get(inversePermutationArrayParam);
			// System.out.println("inputArrayParam:" + inputArrayParam);
			// System.out.println("inversePermutationArrayParam :"
			// + inversePermutationArrayParam);
			// System.out.println("sMapValue:" + sMapValue);
			if (!sMapValue.equals(inputArrayParam)) {
				return false;
			}
		}
		return true;
	}

	private static String[] convertToInputArray(String input) {
		String[] arr = input.split(" ");
		// int arrayLenght = arr.length;
		// int[] intArr = new int[arrayLenght];
		// for (int i = 0; i < arr.length; i++) {
		// intArr[i] = Integer.parseInt(arr[i]);
		// }
		// System.out.println("InputArray:");
		// printArrray(arr);
		return arr;
	}

	private static String[] createInversePermutationArray(int lineOfInputCount) {
		String[] inversePermutationArray = new String[lineOfInputCount];
		inversePermutationArray[0] = String.valueOf(lineOfInputCount);
		for (int i = 1; i < lineOfInputCount; i++) {
			inversePermutationArray[i] = String.valueOf(i);
		}
		// System.out.println("inversePermutationArray:");
		// printArrray(inversePermutationArray);
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

	// private static void printArrray(String[] arr) {
	// StringBuilder sb = new StringBuilder();
	// for (String s : arr) {
	// sb.append(s + " ");
	// }
	// System.out.println(sb.toString());
	// }
}
