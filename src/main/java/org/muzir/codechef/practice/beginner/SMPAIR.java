package org.muzir.codechef.practice.beginner;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SMPAIR {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		// FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/inputs/SMPAIR.txt");
		// Scanner scanner = new Scanner(fs);
		int lineCount = scanner.nextInt();
		for (int i = 0; i < lineCount; i++) {
			int argCount = scanner.nextInt();
			ArrayList<Integer> elements = new ArrayList<Integer>();
			for (int z = 0; z < argCount; z++) {
				elements.add(scanner.nextInt());
			}
			BigDecimal smPair = calculateSmallestPair(elements);
			System.out.println(smPair);
		}
		scanner.close();
	}

	static BigDecimal calculateSmallestPair(List<Integer> elements) {
		Collections.sort(elements);
		int a = elements.get(0);
		int b = elements.get(1);
		BigDecimal x = new BigDecimal(a);
		BigDecimal y = new BigDecimal(b);
		return x.add(y);
	}
}
