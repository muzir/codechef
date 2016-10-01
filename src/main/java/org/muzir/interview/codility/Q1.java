package org.muzir.interview.codility;

public class Q1 {
	public int isValidPassword(String s) {
		int maxLenght = -1;
		if (s == null || s.equals("")) {
			return -1;
		}
		if (!isUpperCaseExist(s)) {
			return -1;
		}
		String[] strArray = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		for (String str : strArray) {
			if (isUpperCaseExist(str) && !isNumberExist(str)) {
				maxLenght = Math.max(maxLenght, str.length());
			}
		}
		return maxLenght;
	}

	private boolean isNumberExist(String str) {
		char[] chars = str.toCharArray();
		for (char c : chars) {
			if (!Character.isLetter(c)) {
				return true;
			}
		}
		return false;
	}

	private boolean isUpperCaseExist(String s) {
		char[] chars = s.toCharArray();
		for (char c : chars) {
			if (Character.isUpperCase(c)) {
				return true;
			}
		}
		return false;
	}
}
