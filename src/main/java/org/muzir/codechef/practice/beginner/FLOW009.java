package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FLOW009 {

	public static void main(String[] args) throws IOException {
		//FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/FLOW009.txt");
		//InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		int lineCount = Integer.parseInt(reader.readLine().trim());
		for (int i = 0; i < lineCount; i++) {
			String line = reader.readLine();
			String[] arguments = line.split(" ");
			System.out.println(calculateTotalExpenses(arguments[0], arguments[1]));
		}
		reader.close();
	}

	static String calculateTotalExpenses(String strQuantity, String strPrice) {
		BigDecimal price = new BigDecimal(strPrice);
		int quantity = Integer.parseInt(strQuantity);
		if (quantity > 1000) {
			price = price.multiply(new BigDecimal(0.9));
		}
		BigDecimal totalExpense = price.multiply(new BigDecimal(quantity));
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(6);
		df.setGroupingUsed(false);
		return df.format(totalExpense);
	}

}
