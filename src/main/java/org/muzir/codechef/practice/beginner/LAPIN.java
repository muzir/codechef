package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class LAPIN {

	static final String YES = "YES";
	static final String NO = "NO";
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String param = br.readLine();
			System.out.println(solution(param));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/LAPIN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String solution(String s) {
		SortedPair sp = generatePair(s);
		if (sp.isFirstPartEqualToSecondPart()) {
			return "YES";
		}
		return "NO";
	}

	private static SortedPair generatePair(String s) {
		if (s == null || s.length() == 0 || s.length() == 1) {
			throw new IllegalArgumentException("Argument string length should be more than 1");
		}
		SortedPair p = null;
		int medium = s.length() / 2;
		if (s.length() % 2 == 0) {
			p = new SortedPair(s.substring(0, medium), s.substring(medium));
		} else {
			p = new SortedPair(s.substring(0, medium), s.substring(medium + 1));
		}
		return p;
	}

	static class SortedPair {
		private final String firstPart;
		private final String secondPart;

		public SortedPair(String firstPart, String secondPart) {
			char[] firstPartArray = firstPart.toCharArray();
			Arrays.sort(firstPartArray);
			char[] secondPartArray = secondPart.toCharArray();
			Arrays.sort(secondPartArray);
			this.firstPart = String.valueOf(firstPartArray);
			this.secondPart = String.valueOf(secondPartArray);
		}

		public boolean isFirstPartEqualToSecondPart() {
			return firstPart.equals(secondPart);
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			SortedPair sortedPair = (SortedPair) o;
			return firstPart.equals(sortedPair.firstPart) &&
					secondPart.equals(sortedPair.secondPart);
		}

		@Override
		public int hashCode() {
			return Objects.hash(firstPart, secondPart);
		}

		@Override
		public String toString() {
			return "Pair{" +
					"firstPart='" + firstPart + '\'' +
					", secondPart='" + secondPart + '\'' +
					'}';
		}
	}
}
