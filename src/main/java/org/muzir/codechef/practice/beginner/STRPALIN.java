package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.TreeSet;

public class STRPALIN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String arg0 = readLine(dis);
			String arg1 = readLine(dis);
			System.out.println(isPolindromic(arg0, arg1));
		}
	}

	static String isPolindromic(String arg0, String arg1) {
		TreeSet<Character> descTreeSet = new TreeSet<>(new Comparator() {
			@Override
			public int compare(Object arg0, Object arg1) {
				Character o0 = (Character) arg0;
				Character o1 = (Character) arg1;
				return o1.compareTo(o0);
			}
		});
		int lenght = arg0.length();
		for (int i = 0; i < lenght; i++) {
			Character c = arg0.charAt(i);
			descTreeSet.add(c);
		}

		int lenght1 = arg1.length();
		for (int i = 0; i < lenght1; i++) {
			if (descTreeSet.contains(arg1.charAt(i))) {
				return "Yes";
			}
		}
		return "No";
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/STRPALIN.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
