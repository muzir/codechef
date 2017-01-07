package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Start 12:17
 * @author erhun.baycelik
 *
 */
public class MOVIEWKN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			Integer.parseInt(readLine(dis));
			String[] movieLong = readLine(dis).split(" ");
			String[] movieRating = readLine(dis).split(" ");
			System.out.println(solution(movieLong, movieRating));
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/MOVIEWKN.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	public static int solution(String[] movieLong, String[] movieRating) {
		int selectedIndex = 0;
		int maxPoint = 0;
		int selectedIndexRating = 0;
		int lenght = movieLong.length;
		int l1 = Integer.parseInt(movieLong[0]);
		int r1 = Integer.parseInt(movieRating[0]);
		selectedIndexRating = r1;
		maxPoint = l1 * r1;
		for (int i = 0; i < lenght; i++) {
			int l = Integer.parseInt(movieLong[i]);
			int r = Integer.parseInt(movieRating[i]);
			int points = l * r;
			if (maxPoint == points) {
				if (r > selectedIndexRating) {
					selectedIndex = i;
					selectedIndexRating = r;
				}
			}
			if (maxPoint < points) {
				selectedIndex = i;
				selectedIndexRating = r;
				maxPoint = points;
			}
		}
		return selectedIndex + 1;
	}

}
