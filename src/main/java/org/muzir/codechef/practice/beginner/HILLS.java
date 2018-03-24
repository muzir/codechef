package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class HILLS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String nud = br.readLine();
			String[] nudArray = nud.split(" ");
			int u = Integer.parseInt(nudArray[1]);
			int d = Integer.parseInt(nudArray[2]);
			String sequence = br.readLine();
			int[] a = Arrays.stream(sequence.split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();

			System.out.println(solution(a, u, d));
		}
		br.close();
	}

	static int solution(int[] a, int u, int d) {
		boolean isParachuteUsed = false;
		int lenght = a.length;
		for (int i = 0; i < lenght - 1; i++) {
			int current = a[i];
			int next = a[i + 1];
			if (next > current) {
				if (!((next - current) <= u)) {
					return i + 1;
				}
			} else {
				if (!((current - next) <= d)) {
					if (!isParachuteUsed) {
						isParachuteUsed = true;
					} else {
						return i + 1;
					}
				}
			}
		}
		return lenght;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/HILLS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
