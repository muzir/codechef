package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author erhun.baycelik
 *
 * TLE (2.010000) Time Limit Exceed for test case 3-4 gets
 */
public class DEVUGRAP {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String nK = readLine(dis);
			String[] nkArray = nK.split(" ");
			int n = Integer.parseInt(nkArray[0]);
			int k = Integer.parseInt(nkArray[1]);
			String input = readLine(dis);
			String[] grapes = input.split(" ");
			int accumulator = 0;
			for (int j = 0; j < grapes.length; j++) {
				int grapesCountInBucket = Integer.parseInt(grapes[j]);
				accumulator = accumulator + returnMinGrapesAddOrRemove(grapesCountInBucket, k);
			}
			System.out.println(accumulator);
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/DEVUGRAP.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	static int returnMinGrapesAddOrRemove(int grapesCountInBucket, int k) {
		double bdk = (double) k;
		double half = bdk / (double) 2;
		int modResult = grapesCountInBucket % k;
		if (half > (double) modResult && grapesCountInBucket != modResult) {
			return modResult;
		} else {
			return k - modResult;
		}
	}

}
