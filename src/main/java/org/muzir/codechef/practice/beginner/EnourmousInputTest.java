package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * The purpose of this problem is to verify whether the method you are using to
 * read input data is sufficiently fast to handle problems branded with the
 * enormous Input/Output warning. You are expected to be able to process at
 * least 2.5MB of input data per second at runtime. Input
 * 
 * The input begins with two positive integers n k (n, k<=107). The next n lines
 * of input contain one positive integer ti, not greater than 109, each. Output
 * 
 * Write a single integer to output, denoting how many integers ti are divisible
 * by k. Example
 * 
 * Input: 7 3 1 51 966369 7 9 999996 11
 * 
 * Output: 4
 * 
 * 
 * @author muzir
 *
 */
public class EnourmousInputTest {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream(System.getProperty("user.dir")
				+ "/src/main/inputs/input.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		String linesOfInput = tokenizer.nextToken(" ");
		String divisorValue = tokenizer.nextToken(" ");
		int linesCount = Integer.parseInt(linesOfInput);
		int divisor = Integer.parseInt(divisorValue);
		int counter = 0;
		for (int i = 0; i < linesCount; i++) {
			String dividendValue = reader.readLine();
			int dividend = Integer.parseInt(dividendValue);
			if (dividend % divisor == 0) {
				counter = counter + 1;
			}
		}
		reader.close();
		System.out.print(counter);
	}
}
