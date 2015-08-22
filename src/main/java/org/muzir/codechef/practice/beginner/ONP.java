package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author erhun.baycelik
 *
 * <p>
 * Started on 18/08/2015 12:18 PM
 * Finished on 22/08/2015 11:34 PM
 * </p>
 * <p>
 * Finished on -
 * </p>
 *
 */
public class ONP {
	private static boolean isCodechefModeOn = false;

	private static List<Character> operatorList = Arrays.asList('+', '-', '*', '^', '/');

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String lineOfInput = readLine(dis);
		int lineOfInputCount = Integer.parseInt(lineOfInput);
		for (int i = 0; i < lineOfInputCount; i++) {
			String intputExpression = readLine(dis);
			String rpnExpression = parseExpressionAsRPN(intputExpression);
			System.out.println(rpnExpression);
		}
	}

	private static String parseExpressionAsRPN(String inputExpression) {
		char[] expression = inputExpression.toCharArray();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		for (char c : expression) {
			if (isOperand(c)) {
				sb.append(c);
			}
			if (isOperator(c)) {
				stack.push(c);
			}
			if (isCloseParanthesis(c)) {
				String operator = Character.toString(stack.pop());
				sb.append(operator);
			}
		}
		return sb.toString();
	}

	private static boolean isCloseParanthesis(char c) {
		if (c == ')') {
			return true;
		}
		return false;
	}

	private static boolean isOperator(char c) {
		if (operatorList.contains(c)) {
			return true;
		}
		return false;
	}

	private static boolean isOperand(char c) {
		return Character.isLetter(c);
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in;
		in = new FileInputStream(path + "/ONP.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
