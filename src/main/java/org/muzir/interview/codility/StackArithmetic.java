package org.muzir.interview.codility;

import java.util.Stack;

public class StackArithmetic {
	static String OPERATORS = "+*";
	static String DIGITS = "0123456789";

	public static void main(String[] args) {
		System.out.println(solution("13+62*7+*"));
		System.out.println(solution("11++"));
		System.out.println(solution("12+31**"));
	}

	public static int solution(String S) {
		Stack<String> stack = new Stack<String>();
		if (S == null || S.isEmpty()) {
			return -1;
		}
		char chars[] = S.toCharArray();
		try {
			for (int i = 0; i < chars.length; i++) {
				String s = String.valueOf(chars[i]);
				if (DIGITS.contains(s)) {
					stack.push(s);
				} else if (OPERATORS.contains(s)) {
					int element1 = Integer.parseInt(stack.pop());
					int element2 = Integer.parseInt(stack.pop());
					int result = 0;
					if (s.equals("+")) {
						result = element1 + element2;
					}
					if (s.equals("*")) {
						result = element1 * element2;
					}
					stack.push(String.valueOf(result));
				}
			}
		} catch (Exception e) {
			return -1;
		}
		return Integer.parseInt(stack.pop());
	}
}
