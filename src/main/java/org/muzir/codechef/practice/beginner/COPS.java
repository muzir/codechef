package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author erhun.baycelik
 *
 */
public class COPS {
	private static boolean isCodechefModeOn = true;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String argumentLine = readLine(dis);
			String[] xy = argumentLine.split(" ");
			int housesPerMinute = Integer.parseInt(xy[1]);
			int maximumMinutes = Integer.parseInt(xy[2]);
			int copsCapacity = housesPerMinute * maximumMinutes;
			argumentLine = readLine(dis);
			int[] copsHouseIndexArray = getArrayOfString(argumentLine);
			getSafeHousesCount(copsCapacity, copsHouseIndexArray);
			System.out.println(getSafeHousesCount(copsCapacity, copsHouseIndexArray));
		}
	}

	static int getSafeHousesCount(int copsCapacity, int[] copsHouseIndexArray) {
		List<Integer> houses = buildHouses();
		for (int j = 0; j < copsHouseIndexArray.length; j++) {
			int copsHouseIndex = copsHouseIndexArray[j];
			int startIndex = getCopsHouseStartIndex(copsHouseIndex, copsCapacity);
			int endIndex = getCopsHouseEndIndex(copsHouseIndex, copsCapacity);
			eliminateHouses(startIndex, endIndex, houses);
		}
		return houses.size();
	}

	// private static void printHouses(List<Integer> houses) {
	// houses.forEach(i -> System.out.println(i));
	// }

	private static int[] getArrayOfString(String parameter) {
		String[] arrayStr = parameter.split(" ");
		int[] returnArray = new int[arrayStr.length];
		for (int i = 0; i < arrayStr.length; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	static int getCopsHouseStartIndex(int startIndex, int copsCapacity) {
		int result = startIndex - copsCapacity;
		if (result <= 0) {
			result = 1;
		}
		return result;
	}

	static int getCopsHouseEndIndex(int startIndex, int copsCapacity) {
		int result = startIndex + copsCapacity;
		if (result >= 100) {
			result = 100;
		}
		return result;
	}

	static List<Integer> eliminateHouses(int startIndex, int endIndex, List<Integer> houses) {
		if (houses == null || houses.size() == 0) {
			return houses;
		}
		for (Integer i = startIndex; i <= endIndex; i++) {
			houses.remove(i);
		}
		return houses;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/COPS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	private static List<Integer> buildHouses() {
		List<Integer> houses = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			houses.add(i);
		}
		return houses;
	}

}
