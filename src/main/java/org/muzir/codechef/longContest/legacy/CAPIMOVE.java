package org.muzir.codechef.longContest.legacy;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CAPIMOVE {
	private static boolean isCodechefModeOn = false;
	private static Map<Integer, Integer> desSortedMap;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			HashMap<Integer, HashSet<Integer>> connectionMap = new HashMap<>();
			int n = Integer.parseInt(readLine(dis));
			String populationStr = readLine(dis);
			int pairCount = n - 1;
			for (int j = 0; j < pairCount; j++) {
				String pairs = readLine(dis);
				addConnectionMap(pairs, connectionMap);
			}
			int[] populationIntArray = getArrayOfString(populationStr);
			System.out.println(printCapital(populationIntArray, connectionMap));
		}
		reader.close();
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

	static int returnCapitalByV(int v, HashSet<Integer> connectionSet, int[] populationIntArray) {
		int lenght = populationIntArray.length;
		int connectionSetSize = connectionSet.size();
		if (connectionSetSize == lenght - 1) {
			return 0;
		}
		Set<Entry<Integer, Integer>> entrySet = desSortedMap.entrySet();
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			int i = entry.getValue();
			if (i != v && !connectionSet.contains(i)) {
				return i;
			}
		}
		return 0;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	static String printCapital(int[] populationIntArray, HashMap<Integer, HashSet<Integer>> connectionMap) {
		int lenght = populationIntArray.length;
		StringBuilder sb = new StringBuilder();
		desSortedMap = new TreeMap(new Comparator() {
			@Override
			public int compare(Object param1, Object param2) {
				Integer o1 = (Integer) param1;
				Integer o2 = (Integer) param2;
				return o2.compareTo(o1);
			}
		});
		for (int k = 1; k <= lenght; k++) {
			desSortedMap.put(populationIntArray[k - 1], k);
		}
		for (int v = 1; v <= lenght; v++) {
			HashSet<Integer> connectionSet = connectionMap.get(v);
			sb.append(returnCapitalByV(v, connectionSet, populationIntArray));
			if (v != lenght) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	static void addConnectionMap(String pairs, HashMap<Integer, HashSet<Integer>> connectionMap) {
		String[] pairsArray = pairs.split(" ");
		int source = Integer.parseInt(pairsArray[0]);
		int target = Integer.parseInt(pairsArray[1]);

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

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/CAPIMOVE.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
