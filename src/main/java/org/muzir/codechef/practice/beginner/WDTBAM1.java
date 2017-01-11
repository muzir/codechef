package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WDTBAM1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = getBufferedReader();
		int n, count, max = 0;
		;
		int[] a;
		String s1, s2;

		int numTestCases = Integer.valueOf(br.readLine());
		for (int t = 0; t < numTestCases; t++) {
			n = Integer.valueOf(br.readLine());
			s1 = br.readLine();
			s2 = br.readLine();
			count = 0;
			max = 0;
			a = convertToIntArray(br.readLine(), n + 1);
			for (int i = 0; i < n; i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					count++;
				}
			}
			if (count == n) {
				max = a[n];
			} else {
				for (int i = 0; i <= count; i++) {
					if (max < a[i]) {
						max = a[i];
					}
				}
			}
			System.out.println(max);

		}
		br.close();

	}

	private static int[] convertToIntArray(String s, int size) {
		int[] arr = new int[size];
		int i, index1 = 0, index2 = 0;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				arr[index1++] = Integer.valueOf(s.substring(index2, i));
				index2 = i + 1;
			}
		}
		arr[index1++] = Integer.valueOf(s.substring(index2, i));

		return arr;
	}

	private static BufferedReader getBufferedReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}

}
