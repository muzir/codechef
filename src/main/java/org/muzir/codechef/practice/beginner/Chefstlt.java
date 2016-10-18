package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chefstlt {
	public static void main(String[] args) throws IOException {
		//FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/CHEFSTLT.txt");
		//InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int lineCount = Integer.parseInt(bf.readLine().trim());
		Chefstlt chefstlt = new Chefstlt();
		for (int i = 0; i < lineCount; i++) {
			String param1 = bf.readLine();
			String param2 = bf.readLine();
			System.out.println(chefstlt.calculateDifference(param1, param2));
		}
		bf.close();
	}

	String calculateDifference(String param1, String param2) {
		Difference d = new Difference();
		if (param1 == null || param2 == null) {
			return d.toString();
		}
		param1 = param1.toLowerCase();
		param2 = param2.toLowerCase();
		char[] chars1 = param1.toCharArray();
		char[] chars2 = param2.toCharArray();
		for (int i = 0; i < chars1.length; i++) {
			char c1 = chars1[i];
			char c2 = chars2[i];
			if (c1 == '?' || c2 == '?') {
				d.increaseMaxDifference();

			} else if (c1 != c2) {
				d.increaseMaxDifference();
				d.increaseMinDifference();
			}
		}
		return d.toString();
	}

	class Difference {
		private int minDifference;
		private int maxDifference;

		void increaseMinDifference() {
			minDifference++;
		}

		void increaseMaxDifference() {
			maxDifference++;
		}

		@Override
		public String toString() {
			return "" + minDifference + " " + maxDifference;
		}
	}
}
