package org.muzir.codechef.practice.beginner;

import java.io.*;

public class NITIKA {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(formatName(br.readLine()));
		}
		br.close();
	}

	static String formatName(String s) {
		String[] sArray = s.split(" ");
		int lenght = sArray.length;
		if (lenght == 1) {
			String firstName = sArray[0];
			return formatToUpperCase(firstName);
		} else if (lenght == 2) {
			String formattedFirstName = formatToFirstLetterWithDot(sArray[0]);
			String formattedSecondName = formatToUpperCase(sArray[1]);
			return formattedFirstName + formattedSecondName;
		}
		String formattedFirstName = formatToFirstLetterWithDot(sArray[0]);
		String formattedSecondName = formatToFirstLetterWithDot(sArray[1]);
		String formattedThirdName = formatToUpperCase(sArray[2]);
		return formattedFirstName + formattedSecondName + formattedThirdName;
	}

	private static String formatToFirstLetterWithDot(String firstName) {
		char upperCase = Character.toUpperCase(firstName.charAt(0));
		return String.valueOf(upperCase) + ". ";
	}

	private static String formatToUpperCase(String name) {
		char upperCase = Character.toUpperCase(name.charAt(0));
		String formatted = String.valueOf(upperCase) + name.substring(1, name.length()).toLowerCase();
		return formatted;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/NITIKA.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
