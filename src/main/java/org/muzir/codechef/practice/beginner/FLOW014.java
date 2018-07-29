package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW014 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/inputs/FLOW014.txt");
		// InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int lineCount = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < lineCount; i++) {
			String line = br.readLine();
			String[] parameters = line.split(" ");
			String result = gradeSteel(Double.parseDouble(parameters[0]), Double.parseDouble(parameters[1]),
					Double.parseDouble(parameters[2]));
			System.out.println(result);
		}
		br.close();
	}

	static String gradeSteel(double hardness, double carbon, double tensile) {
		boolean isHardness = hardness > 50;
		boolean isCarbon = 0.7 > carbon;
		boolean isTensile = tensile > 5600;

		if (isHardness && isCarbon && isTensile) {
			return "10";
		} else if (isHardness && isCarbon) {
			return "9";
		} else if (isCarbon && isTensile) {
			return "8";
		} else if (isHardness && isTensile) {
			return "7";
		} else if (isHardness || isCarbon || isTensile) {
			return "6";
		} else {
			return "5";
		}
	}

}
