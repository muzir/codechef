package org.muzir.codechef.longContest.feb18;

import java.io.*;
import java.util.*;

public class PERMPAL {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String s = br.readLine();
			System.out.println(findPalindromePermutation(s));
		}
		br.close();
	}

	static String findPalindromePermutation(String s) {
		int n = s.length();
		if (n == 1) {
			return "1";
		}
		StringBuilder left = new StringBuilder();
		Deque<String> right = new ArrayDeque<>();
		Letter oddLetter = new Letter(' ', 0);
		int evenCounter = 0;
		int oddCounter = 0;
		Map<Character, Letter> letterMap = convertToMap(s);
		for (Map.Entry<Character, Letter> entry : letterMap.entrySet()) {
			Letter letter = entry.getValue();
			if (letter.isEvenOrderSize()) {
				List<Integer> orders = letter.orders;
				int lenght = orders.size();
				for (int j = 0; j < lenght; j++) {
					if (j % 2 == 0) {
						left.append(String.valueOf(orders.get(j) + 1));
						left.append(" ");
					} else {
						right.push(String.valueOf(orders.get(j) + 1));
					}
				}
				evenCounter++;
			} else {
				oddLetter = letter;
				oddCounter++;
			}
		}
		int letterMapLenght = letterMap.size();
		boolean isNEven = isEven(n);
		if (isNEven) {
			if (evenCounter != letterMapLenght) {
				return "-1";
			}
			if (oddCounter > 0) {
				return "-1";
			}
		} else {
			if (oddCounter != 1) {
				return "-1";
			}
		}
		return formatOrder(left, right, oddLetter, isNEven);
	}

	private static String formatOrder(StringBuilder left, Deque<String> right, Letter oddLetter, boolean isNEven) {
		if (isNEven) {
			return appendQueueToLeft(left, right);
		}
		List<Integer> orders = oddLetter.orders;
		int lenght = orders.size();
		for (int i = 0; i < lenght; i++) {
			left.append(orders.get(i) + 1).append(" ");
		}
		return appendQueueToLeft(left, right);
	}

	private static String appendQueueToLeft(StringBuilder left, Deque<String> right) {
		int queuSize = right.size();
		for (int i = 0; i < queuSize; i++) {
			left.append(right.pop());
			if (i != queuSize - 1) {
				left.append(" ");
			}
		}
		return left.toString();
	}

	private static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

	private static Map<Character, Letter> convertToMap(String s) {
		Map<Character, Letter> letterMap = new HashMap<>();
		int lenght = s.length();
		for (int i = 0; i < lenght; i++) {
			char c = s.charAt(i);
			Letter letter = letterMap.get(c);
			if (letter == null) {
				Letter newLetter = new Letter(c, i);
				letterMap.put(c, newLetter);
			} else {
				letter.addOrder(i);
			}
		}
		return letterMap;
	}

	static class Letter {
		char symbol;
		List<Integer> orders = new ArrayList();

		public Letter(char symbol, int order) {
			this.symbol = symbol;
			orders.add(order);
		}

		public void addOrder(int order) {
			orders.add(order);
		}


		public boolean isEvenOrderSize() {
			if (orders.size() % 2 == 0) {
				return true;
			}
			return false;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Letter letter = (Letter) o;
			return symbol == letter.symbol;
		}

		@Override
		public int hashCode() {
			return Objects.hash(symbol);
		}
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/PERMPAL.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
