package org.muzir.codechef.practice.beginner;

import java.io.*;

public class BIGSALE {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int n = Integer.parseInt(br.readLine());
			double acc = 0.00;
			for (int j = 0; j < n; j++) {
				String[] arr = br.readLine().split(" ");
				double price = Double.parseDouble(arr[0]);
				double quantity = Double.parseDouble(arr[1]);
				double discount = Double.parseDouble(arr[2]);
				acc = acc + calculate(price, quantity, discount);
			}
			System.out.println(String.format("%.6f", acc));
		}
		br.close();
	}

	static double calculate(double price, double quantity, double discount) {
		return quantity * (price - (((100 - discount) / 100) * (price + (price * discount / 100))));
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/BIGSALE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
