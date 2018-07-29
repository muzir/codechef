package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MSTEP {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(readLine(dis));
			Map<Integer, Entry<Integer, Integer>> matrix = createMatrixMap(n, dis);
			int minimumStep = findMinimumSteps(matrix, n);
			System.out.println(minimumStep);
		}
	}

	private static int findMinimumSteps(Map<Integer, Entry<Integer, Integer>> matrix, int n) {
		int nSquare = (int) Math.pow(n, 2);
		int minimumSteps = 0;
		for (int i = 1; i < nSquare; i++) {
			Entry<Integer, Integer> p1 = matrix.get(i);
			Entry<Integer, Integer> p2 = matrix.get(i + 1);
			int steps = calculatePairAdjacent(p1, p2);
			minimumSteps = minimumSteps + steps;
		}
		return minimumSteps;
	}

	static int calculatePairAdjacent(Entry<Integer, Integer> p1, Entry<Integer, Integer> p2) {
		int x1 = p1.getKey();
		int y1 = p1.getValue();

		int x2 = p2.getKey();
		int y2 = p2.getValue();

		int diffx = Math.abs(x1 - x2);
		int diffy = Math.abs(y1 - y2);

		return diffx + diffy;
	}

	private static Map<Integer, Entry<Integer, Integer>> createMatrixMap(int n, DataInputStream dis)
			throws IOException {
		Map<Integer, Entry<Integer, Integer>> matrix = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			String line = readLine(dis);
			String[] strNumbers = line.split(" ");
			int lenght = strNumbers.length;
			for (int j = 0; j < lenght; j++) {
				String strY = strNumbers[j];
				Map.Entry<Integer, Integer> entry = new AbstractMap.SimpleEntry<Integer, Integer>(i, j + 1);
				matrix.put(Integer.parseInt(strY), entry);
			}
		}
		return matrix;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/MSTEP.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
