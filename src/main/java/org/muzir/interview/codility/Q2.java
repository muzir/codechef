package org.muzir.interview.codility;

import java.math.BigDecimal;

public class Q2 {
	private static final BigDecimal EXCEEDLIMIT = new BigDecimal("100000000");

	public int solution(int i, int j) {
		String str1 = String.valueOf(i);
		String str2 = String.valueOf(j);
		String strResult = build(str1, str2);
		BigDecimal bgResult = new BigDecimal(strResult);
		if (isLimitExceed(bgResult)) {
			return -1;
		}
		return Integer.parseInt(strResult);
	}

	private String build(String str1, String str2) {
		char[] inputArray1 = str1.toCharArray();
		char[] inputArray2 = str2.toCharArray();

		int lenght = Math.max(inputArray1.length, inputArray2.length);
		StringBuilder strResult = new StringBuilder();
		for (int i = 0; i < lenght; i++) {
			String strResult1 = getFromInputArray(i, inputArray1);
			String strResult2 = getFromInputArray(i, inputArray2);
			strResult.append(strResult1).append(strResult2);
		}

		return strResult.toString();
	}

	private String getFromInputArray(int i, char[] inputArray) {
		if (i > inputArray.length - 1) {
			return "";
		}
		return String.valueOf(inputArray[i]);
	}

	private boolean isLimitExceed(BigDecimal input) {
		if (input.compareTo(EXCEEDLIMIT) == 1) {
			return true;
		}
		return false;
	}

}
