package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author erhun.baycelik
 *
 */
public class VCS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String argumentLine = readLine(dis);
			String[] nmk = argumentLine.split(" ");
			int sourceOfFileCount = Integer.parseInt(nmk[0]);
			String ignored = readLine(dis);
			int[] ignoredArray = getArrayOfString(ignored);
			String tracked = readLine(dis);
			int[] trackedArray = getArrayOfString(tracked);

			int ignoredAndTrackedCount = countIgnoredAndTracked(ignoredArray, trackedArray);
			int untrackedAndUnignored = getUntrackedAndUnignored(sourceOfFileCount, ignoredArray, trackedArray);
			System.out.println(ignoredAndTrackedCount + " " + untrackedAndUnignored);
		}
	}

	private static int[] getArrayOfString(String ignored) {
		String[] arrayStr = ignored.split(" ");
		int[] returnArray = new int[arrayStr.length];
		for (int i = 0; i < arrayStr.length; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	static int getUnionCount(int[] ignored, int[] tracked) {
		Set<Integer> ignoredSet = Arrays.stream(ignored).boxed().collect(Collectors.toSet());
		Set<Integer> trackedSet = Arrays.stream(tracked).boxed().collect(Collectors.toSet());
		Set<Integer> ignoredAndTrackedSet = new HashSet<>();
		ignoredAndTrackedSet.addAll(ignoredSet);
		ignoredAndTrackedSet.addAll(trackedSet);
		return ignoredAndTrackedSet.size();
	}

	static int getTotalCount(int[] ignored, int[] tracked) {
		int ignoredCount = 0;
		int trackedCount = 0;
		if (ignored != null) {
			ignoredCount = ignored.length;
		}
		if (tracked != null) {
			trackedCount = tracked.length;
		}
		return ignoredCount + trackedCount;
	}

	static int countIgnoredAndTracked(int[] ignored, int[] tracked) {
		int totalCount = getTotalCount(ignored, tracked);
		int unionCount = getUnionCount(ignored, tracked);
		return totalCount - unionCount;
	}

	static int getUntrackedAndUnignored(int sourceFileCount, int[] ignoredArray, int[] trackedArray) {
		int unionCount = getUnionCount(ignoredArray, trackedArray);
		return Math.abs(sourceFileCount - unionCount);
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/VCS.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
