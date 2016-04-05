package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author erhun.baycelik
 *
 */
public class COMM3 {
	private static boolean isCodechefModeOn = false;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int lineOfInputCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < lineOfInputCount; i++) {
			String strAllowedDistanceBetweenPositions = readLine(dis);
			int allowedDistanceBetweenPositions = Integer.parseInt(strAllowedDistanceBetweenPositions);
			ArrayList<SimpleEntry> entryPairs = new ArrayList<SimpleEntry>();
			for (int j = 0; j < 3; j++) {
				String line = readLine(dis);
				StringTokenizer tokenizer = new StringTokenizer(line, " ");
				int param1 = Integer.parseInt(tokenizer.nextToken());
				int param2 = Integer.parseInt(tokenizer.nextToken());
				SimpleEntry<Integer, Integer> entry = new SimpleEntry(param1, param2);
				entryPairs.add(entry);
			}
			communicateTransceiver(entryPairs, allowedDistanceBetweenPositions);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void communicateTransceiver(ArrayList<SimpleEntry> entryPairs, int allowedDistanceBetweenNode) {
		int allowedDistanceCounter = 0;
		int powerAllowedDistance = allowedDistanceBetweenNode * allowedDistanceBetweenNode;
		for (int i = 0; i < 2; i++) {
			SimpleEntry<Integer, Integer> nodeOne = entryPairs.get(i);
			for (int j = i + 1; j < 3; j++) {
				SimpleEntry<Integer, Integer> nodeTwo = entryPairs.get(j);
				int xCoordinateDistance = Math.abs(nodeOne.getKey() - nodeTwo.getKey());
				int powerX = xCoordinateDistance * xCoordinateDistance;
				int yCoordinateDistance = Math.abs(nodeOne.getValue() - nodeTwo.getValue());
				int powerY = yCoordinateDistance * yCoordinateDistance;
				int totalPower = powerX + powerY;
				if (totalPower <= powerAllowedDistance) {
					allowedDistanceCounter = allowedDistanceCounter + 1;
				}
			}
		}
		if (allowedDistanceCounter > 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/COMM3.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
