package org.muzir.codechef.practice.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cielab {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String line = reader.readLine();
		String[] lines = line.split(" ");
		Cielab cielab = new Cielab();
		int result = cielab.solution(Integer.parseInt(lines[0]), Integer.parseInt(lines[1]));
		System.out.println(result);
		isr.close();
		reader.close();
	}

	int solution(int a, int b) {
		int result = a - b;
		return cielSolve(result);
	}

	private int cielSolve(int result) {
		String originalResult = String.valueOf(result);
		int fakeResult = result - 1;
		String strFakeResult = String.valueOf(fakeResult);
		if (isOneChracterDiffer(originalResult, strFakeResult)) {
			return fakeResult;
		}
		return result + 1;
	}

	private boolean isOneChracterDiffer(String originalResult, String strFakeResult) {
		if (strFakeResult.length() != originalResult.length()) {
			return false;
		}
		if(strFakeResult.equals("0")){return false;}
		char[] charFakeResult = strFakeResult.toCharArray();
		char[] charOriginalResult = originalResult.toCharArray();
		int charDiff = 0;
		for (int i = 0; i < strFakeResult.length(); i++) {
			if (charFakeResult[i] != charOriginalResult[i]) {
				charDiff++;
			}
		}
		if (charDiff > 1) {
			return false;
		}
		return true;
	}

}
