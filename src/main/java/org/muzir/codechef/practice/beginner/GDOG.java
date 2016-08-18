package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author erhun.baycelik
 *
 */
public class GDOG {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		// InputStreamReader isr = new InputStreamReader(new FileInputStream(System.getProperty("user.dir") +
		// "/GDOG.txt"));
		BufferedReader br = new BufferedReader(isr);
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String line = br.readLine();
			String[] lineArgument = line.split(" ");
			int n = Integer.parseInt(lineArgument[0]);
			int k = Integer.parseInt(lineArgument[1]);
			System.out.println(maxRemainder(n, k));
		}
		br.close();
	}

	static int maxRemainder(int n, int k) {
		if (k == 1) {
			return 0;
		}
		List<Integer> remainders = new ArrayList<Integer>();
		for (int j = 2; j <= k; j++) {
			remainders.add(n % j);
		}
		return Collections.max(remainders);
	}
}
