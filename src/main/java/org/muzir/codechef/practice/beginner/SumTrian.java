package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

	private static List<Integer> finalList;
	private static List<Integer> newList;
	private static List<Integer> lookUpList;

	private static boolean isCodechefModeOff = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInputCount = readLine(dis);
		for (int j = 0; j < Integer.parseInt(lineOfInputCount); j++) {
			String lineOfTriangleRowCount = readLine(dis);
			if (isEmptyOrNullLine(lineOfTriangleRowCount)) {
				break;
			}
			lineOfTriangleRowCount = lineOfTriangleRowCount.trim();
			finalList = new ArrayList<Integer>();
			for (int i = 0; i < Integer.parseInt(lineOfTriangleRowCount); i++) {
				String newLine = readLine(dis);
				newList = createNewList(newLine);
				lookUpList = copyList(finalList);
				addToFinalList();
			}
			System.out.println(Collections.max(finalList));
		}
		in.close();
		dis.close();
	}

	private static InputStream createInputStream() {
		if (isCodechefModeOff) {
			String path = System.getProperty("user.dir");
			try {
				InputStream in = new FileInputStream(path + "/SumTrian.txt");
				return in;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.in;
	}

	private static boolean isEmptyOrNullLine(String lineOfTriangleRowCount) {
		if (lineOfTriangleRowCount == null
				|| "".equalsIgnoreCase(lineOfTriangleRowCount)) {
			return true;
		}
		return false;
	}

	private static List<Integer> copyList(List<Integer> finalList2) {
		return new ArrayList<Integer>(finalList2);
	}

	private static void addToFinalList() {
		if (newList.size() == 1) {
			finalList = copyList(newList);
			return;
		}
		for (int i = 0; i < newList.size(); i++) {
			int newListCurrentValue = newList.get(i);
			addOneIndexBefore(newListCurrentValue, i);
			addCurrentValue(newListCurrentValue, i);
		}
		return;
	}

	private static void addCurrentValue(int newListCurrentValue, int index) {
		if (isIndexNull(index, lookUpList)) {
			return;
		}
		int lookUpListSameRowValue = lookUpList.get(index);
		int newValue = lookUpListSameRowValue + newListCurrentValue;
		if (isIndexNull(index, finalList)) {
			finalList.add(index, newValue);
			return;
		}
		addFinalList(index, newValue);
		return;
	}

	private static void addOneIndexBefore(int newListCurrentValue, int index) {
		int finalListOneIndexBeforeValue = 0;
		if (isIndexNull(index - 1, lookUpList)) {
			return;
		}
		finalListOneIndexBeforeValue = lookUpList.get(index - 1);
		int newValue = finalListOneIndexBeforeValue + newListCurrentValue;
		addFinalList(index, newValue);
	}

	private static void addFinalList(int index, Integer newValue) {
		if (isIndexNull(index, finalList)) {
			finalList.add(index, newValue);
			return;
		}
		Integer existingValue = finalList.get(index);
		if (existingValue.compareTo(newValue) < 0) {
			finalList.remove(index);
			finalList.add(index, newValue);
		}
		return;
	}

	private static boolean isIndexNull(int index, List<Integer> checkList) {
		try {
			boolean isNull = checkList.get(index) == null ? Boolean.TRUE
					: Boolean.FALSE;
			return isNull;
		} catch (IndexOutOfBoundsException e) {
			return true;
		}

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

	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
