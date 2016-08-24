package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Flow011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/FLOW011.txt");
		// InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int lineCount = Integer.parseInt(br.readLine().trim());
		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.CEILING);
		for (int i = 0; i < lineCount; i++) {
			String parameter = br.readLine();
			System.out.println(df.format(calculateGrossSalary(parameter)));
		}
		br.close();

	}

	static double calculateGrossSalary(String parameter) {
		double basicSalary = Double.parseDouble(parameter);
		double grossSalary = 0.0;
		if (basicSalary < 1500) {
			grossSalary = basicSalary * 2;
		} else {
			double da = basicSalary * 0.98;
			grossSalary = basicSalary + 500 + da;
		}
		return grossSalary;
	}

}
