package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Input
 * 
 * 
 * An integer t, 1<=t<=100, denoting the number of testcases, followed by t
 * lines, each containing a single integer n, 1<=n<=100.
 * 
 * Output
 * 
 * 
 * For each integer n given at input, display a line with the value of n!
 * 
 * Example Sample input:
 * 
 * 4 1 2 5 3
 * 
 * Sample output:
 * 
 * 1 2 120 6
 * 
 * @author muzir
 *
 */
public class FCTRL2 {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int linesOfParamater = Integer.parseInt(reader.readLine());
		for (int i = 0; i < linesOfParamater; i++) {
			BigInteger param = new BigInteger(reader.readLine());
			System.out.println(factorial(param));
		}
	}

	private static BigInteger factorial(BigInteger param) {
		if (param.equals(BigInteger.ONE)) {
			return param;
		}
		return param.multiply(factorial(param.subtract(BigInteger.ONE)));
	}
}
