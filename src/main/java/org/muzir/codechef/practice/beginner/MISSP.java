package org.muzir.codechef.practice.beginner;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MISSP {

	public static void main(String[] args) {
		// String path = System.getProperty("user.dir");
		// InputStream is = new FileInputStream(path + "/src/main/inputs/MISSP.txt");
		InputStream is = System.in;
		Scanner scanner = new Scanner(is);
		int testCaseCount = scanner.nextInt();
		for (int i = 0; i < testCaseCount; i++) {
			int lineCount = scanner.nextInt();
			int[] intDolls = new int[lineCount];
			for (int j = 0; j < lineCount; j++) {
				intDolls[j] = scanner.nextInt();
			}
			System.out.println(printOddDoll(intDolls));
			// System.out.println("input Array:" + printArray(array));
		}
		scanner.close();
	}

	static int printOddDoll(int[] p) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < p.length; i++) {
			int key = p[i];
			Integer value = map.get(key);
			if (value == null) {
				map.put(key, 1);
			} else {
				value = value + 1;
				map.put(key, value);
			}
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			Integer entryValue = e.getValue();
			if (!isEven(entryValue)) {
				return e.getKey();
			}
		}
		return 1;
	}

	private static boolean isEven(Integer entryValue) {
		if (entryValue % 2 == 0) {
			return true;
		}
		return false;
	}

	private static String printArray(int[] array) {
		String result = "";
		if (array == null) {
			return result;
		}
		for (int i = 0; i < array.length; i++) {
			result = result + "," + array[i];
		}
		return result;
	}

}
