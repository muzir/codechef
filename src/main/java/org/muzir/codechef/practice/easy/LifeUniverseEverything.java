package org.muzir.codechef.practice.easy;

import java.util.Scanner;

/**
 * Your program is to use the brute-force approach in order to find the Answer
 * to Life, the Universe, and Everything. More precisely... rewrite small
 * numbers from input to output. Stop processing input after reading in the
 * number 42. All numbers at input are integers of one or two digits. Example
 * 
 * 
 * Input: 1 2 88 42 99
 * 
 * Output: 1 2 88
 * 
 * @author muzir
 *
 */
public class LifeUniverseEverything {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			int input = scanner.nextInt();
			if (!(0 <= input && input < 100)) {
				new Exception("Unexpected format number or character");
				break;
			}
			if (input == 42) {
				break;
			}
			System.out.println(input);
		}
		scanner.close();
	}
}
