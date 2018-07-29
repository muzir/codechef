package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class COLOR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			int roomCount = Integer.parseInt(readLine(dis));
			String roomColor = readLine(dis);
			System.out.println(calculateMinRoomCount(roomColor));
		}
	}

	static int calculateMinRoomCount(String roomColor) {
		int lenght = roomColor.length();
		int rCounter = 0;
		int bCounter = 0;
		int gCounter = 0;
		for (int i = 0; i < lenght; i++) {
			char c = roomColor.charAt(i);
			switch (c) {
			case 'R':
				rCounter++;
				break;
			case 'B':
				bCounter++;
				break;
			case 'G':
				gCounter++;
				break;
			}
		}
		int maxCounter = Math.max(Math.max(gCounter, bCounter), rCounter);
		return lenght - maxCounter;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/COLOR.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
