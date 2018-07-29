package org.muzir.codechef.practice.beginner;

import java.io.*;

public class FLOW011 {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCaseCount; i++) {
			String parameter = br.readLine();
			System.out.println(calculateGrossSalary(parameter));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/FLOW011.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}


	static String calculateGrossSalary(String parameter) {
		double basicSalary = Double.parseDouble(parameter);
		double grossSalary = 0.0;
		if (basicSalary < 1500) {
			grossSalary = basicSalary * 2;
		} else {
			double da = basicSalary * 0.98;
			grossSalary = basicSalary + 500 + da;
		}

		if (grossSalary % 1 == 0) {
			return String.valueOf((int) grossSalary);
		}

		return String.format("%.2f", grossSalary);
	}


}
