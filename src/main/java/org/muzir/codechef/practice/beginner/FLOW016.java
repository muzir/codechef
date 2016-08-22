package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author erhun.baycelik
 *
 */
public class FLOW016 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/FLOW016.txt");
		// InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int lineCount = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < lineCount; i++) {
			String[] parameters = br.readLine().split(" ");
			System.out.print(gcd(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1])) + " "
					+ lcd(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]), 2).toString());
		}
		br.close();
	}

	static BigInteger lcd(int a, int b, int n) {
		if (a == 1 && b == 1) {
			return BigInteger.ONE;
		}
		boolean isDivide = false;
		if (a % n == 0) {
			isDivide = true;
			a = a / n;
		}
		if (b % n == 0) {
			isDivide = true;
			b = b / n;
		}
		if (!isDivide) {
			n = n + 1;
			return lcd(a, b, n);
		}
		return new BigInteger(String.valueOf(n)).multiply(lcd(a, b, n));
	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
