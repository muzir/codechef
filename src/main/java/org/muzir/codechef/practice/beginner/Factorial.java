package org.muzir.codechef.practice.beginner;

/**
 * For example, they defined the function Z. For any positive integer N, Z(N) is
 * the number of zeros at the end of the decimal form of number N!. They noticed
 * that this function never decreases. If we have two numbers N1<N2, then Z(N1)
 * <= Z(N2). It is because we can never "lose" any trailing zero by multiplying
 * by any positive number. We can only get new and new zeros. The function Z is
 * very interesting, so we need a computer program that can determine its value
 * efficiently. Input
 * 
 * There is a single positive integer T on the first line of input (equal to
 * about 100000). It stands for the number of numbers to follow. Then there are
 * T lines, each containing exactly one positive integer number N, 1 <= N <=
 * 1000000000. Output
 * 
 * For every number N, output a single line containing the single non-negative
 * integer Z(N). Example
 * 
 * Sample Input:
 * 
 * 6 3 60 100 1024 23456 8735373
 * 
 * Sample Output:
 * 
 * 0 14 24 253 5861 2183837
 * 
 * @author muzir
 *
 */
public class Factorial {
	public static void main(String[] args) throws Exception {
		java.io.BufferedReader reader = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		int lines = Integer.parseInt(reader.readLine());
		if (lines <= 0) {
			System.out.println(0);
			return;
		}
		for (int i = 0; i < lines; i++) {
			String input = reader.readLine();
			if (input.equals("")) {
				continue;
			}
			int param = Integer.parseInt(input);
			if (param < 0) {
				continue;
			}
			System.out.println(calculateZero(param));

		}

	}

	private static int calculateZero(int param) {
		int counter = 0;
		int dividend = 0;
		int remainder = 0;
		do {
			dividend = param / 5;
			remainder = param % 5;
			counter = counter + dividend;
			param = dividend;
		} while (remainder <= param);
		return counter;
	}
}