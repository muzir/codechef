package org.muzir.codechef.practice.easy;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author muzir
 *
 */
public class SumTrian {
	private final static byte NL = 10;// new line
	private final static byte EOF = -1;// end of file
	private final static byte EOL = 0;// end of line
	private final static int SIZE = 1;

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/SumTrian.txt");
		BufferedInputStream reader = new BufferedInputStream(in);
		String lineOfInputCount = readLine(reader);
		// System.out.println(lineOfInputCount);
		for (int j = 0; j < Integer.parseInt(lineOfInputCount); j++) {
			String lineOfTriangleRowCount = readLine(reader);
			lineOfTriangleRowCount = lineOfTriangleRowCount.trim();
			// System.out.println(lineOfTriangleRowCount);
			List<Integer> finalList = new ArrayList<Integer>();
			for (int i = 0; i < Integer.parseInt(lineOfTriangleRowCount); i++) {
				String newLine = readLine(reader);
				// System.out.println(newLine);
				List<Integer> newList = createNewList(newLine);
				finalList = addToFinalList(newList, finalList);
			}
			System.out.println(Collections.max(finalList));
		}
		in.close();
		// System.out.println("Finished");
	}

	private static List<Integer> addToFinalList(List<Integer> newList,
			List<Integer> oldFinalList) {
		if (newList.size() == 1) {
			return new ArrayList<Integer>(newList);
		}
		List<Integer> newFinalList = new ArrayList<Integer>();
		for (int i = 0; i < newList.size(); i++) {
			int newListCurrentValue = newList.get(i);
			newFinalList = addOneIndexBefore(newListCurrentValue, oldFinalList,
					i, newFinalList);
			newFinalList = addCurrentValue(newListCurrentValue, oldFinalList,
					i, newFinalList);
		}
		return newFinalList;
	}

	private static List<Integer> addCurrentValue(int newListCurrentValue,
			List<Integer> oldFinalList, int index, List<Integer> newFinalList) {
		int finalListSameRowValue = oldFinalList.get(index);
		int newValue = finalListSameRowValue + newListCurrentValue;
		if (!checkFinalListCurrentIndexExist(oldFinalList, index)) {
			newFinalList.add(index, newValue);
			return newFinalList;
		}
		if (newFinalList.get(index).compareTo(newValue) < 0) {
			newFinalList.remove(index);
			newFinalList.add(index, newValue);
		}
		return newFinalList;
	}

	private static boolean checkFinalListCurrentIndexExist(
			List<Integer> finalList, int index) {
		try {
			finalList.get(index);
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	private static List<Integer> addOneIndexBefore(int newListCurrentValue,
			List<Integer> oldFinalList, int index, List<Integer> newFinalList) {
		int finalListOneIndexBeforeValue = 0;
		try {
			finalListOneIndexBeforeValue = oldFinalList.get(index - 1);
		} catch (IndexOutOfBoundsException e) {
			return new ArrayList<Integer>(oldFinalList);
		}
		int newValue = finalListOneIndexBeforeValue + newListCurrentValue;
		newFinalList.add(index - 1, newValue);
		return newFinalList;
	}

	private static List<Integer> createNewList(String newLine) {
		List<Integer> newList = new ArrayList<Integer>();
		if (isNumber(newLine)) {
			newList.add(Integer.parseInt(newLine));
			return newList;
		}
		StringTokenizer tokenizer = new StringTokenizer(newLine, " ");
		while (tokenizer.hasMoreTokens()) {
			String newElement = tokenizer.nextToken();
			newList.add(Integer.parseInt(newElement));
		}
		return newList;
	}

	private static boolean isNumber(String newLine) {
		try {
			Integer.parseInt(newLine);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	private static String readLine(BufferedInputStream reader)
			throws IOException {
		String line = "";
		byte[] container = new byte[SIZE];
		reader.read(container);
		byte byteRead = container[0];
		while (byteRead != NL && byteRead != EOL && byteRead != EOF) {
			String input = "";
			input = new String(container, 0, SIZE);
			line = line + input;
			reader.read(container);
			byteRead = container[0];
		}
		return line;
	}
}
