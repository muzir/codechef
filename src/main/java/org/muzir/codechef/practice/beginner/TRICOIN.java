package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author erhun.baycelik
 * 
 * TLE (2.010000) Time Limit Exceed
 *
 */
public class TRICOIN {
	private static boolean isCodechefModeOn = false;

	static Map<Integer, Integer> resultMap = new HashMap<>();

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			int input = Integer.parseInt(readLine(dis));
			System.out.println(returnTriangleHeigh(input));
		}
	}

	static int returnTriangleHeigh(int input) {
		int height = 1;
		while (1 == 1) {
			int result = fibonacci(height);
			resultMap.put(height, result);
			if (result > input) {
				break;
			}
			height = height + 1;
		}
		return height - 1;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/TRICOIN.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	static int fibonacci(int i) {
		Integer existingResult = resultMap.get(i);
		if (existingResult != null) {
			return existingResult;
		}
		if (i == 0) {
			return 0;
		}
		return i + fibonacci(i - 1);
	}

}
