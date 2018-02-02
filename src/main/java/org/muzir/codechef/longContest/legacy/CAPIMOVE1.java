package org.muzir.codechef.longContest.legacy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CAPIMOVE1 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		Scanner scanner = new Scanner(in);
		int testCaseCount = scanner.nextInt();
		for (int i = 0; i < testCaseCount; i++) {
			HashMap<Integer, HashSet<Integer>> connectionMap = new HashMap<>();
			int n = scanner.nextInt();
			int[] populationIntArray = new int[n];
			for (int k = 0; k < n; k++) {
				populationIntArray[k] = scanner.nextInt();
			}
			int pairCount = n - 1;
			for (int j = 0; j < pairCount; j++) {
				int source = scanner.nextInt();
				int target = scanner.nextInt();
				addConnectionMap(source, target, connectionMap);
			}
			System.out.println(printCapital(populationIntArray, connectionMap));
		}
		scanner.close();
	}

	static int[] getArrayOfString(String ignored) {
		String[] arrayStr = ignored.split(" ");
		int[] returnArray = new int[arrayStr.length];
		for (int i = 0; i < arrayStr.length; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	static String printCapital(int[] populationIntArray, HashMap<Integer, HashSet<Integer>> connectionMap) {
		int lenght = populationIntArray.length;
		StringBuilder sb = new StringBuilder();
		for (int v = 1; v <= lenght; v++) {
			HashSet<Integer> connectionSet = connectionMap.get(v);
			sb.append(returnCapitalByV(v, connectionSet, populationIntArray));
			if (v != lenght) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	static void addConnectionMap(int source, int target, HashMap<Integer, HashSet<Integer>> connectionMap) {
		HashSet<Integer> connectionSet = connectionMap.get(source);
		if (connectionSet == null) {
			connectionSet = new HashSet<Integer>();
		}
		connectionSet.add(target);
		connectionMap.put(source, connectionSet);

		connectionSet = connectionMap.get(target);
		if (connectionSet == null) {
			connectionSet = new HashSet<Integer>();
		}
		connectionSet.add(source);
		connectionMap.put(target, connectionSet);
	}

	static int returnCapitalByV(int v, HashSet<Integer> connectionSet, int[] populationIntArray) {
		int lenght = populationIntArray.length;
		int maxCounter = 0;
		int capitalIndex = 0;
		for (int i = 1; i <= lenght; i++) {
			if (i != v && !connectionSet.contains(i)) {
				int population = populationIntArray[i - 1];
				if (population > maxCounter) {
					capitalIndex = i;
					maxCounter = population;
				}
			}
		}
		return capitalIndex;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/CAPIMOVE.txt");
		return in;
	}

}
