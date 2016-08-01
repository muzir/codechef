package org.muzir.interview.codility;

public class Main {
	
	public static void main(String [] args){
		System.out.println(solution("a0Bb"));
		System.out.println(solution("aaaaaa"));
		System.out.println(solution("aa0aa0"));
		System.out.println(solution("aa0aaA"));
	}
	
	public static int solution(String S) {
		int longest = -1;
		int characterLong = 0;
		boolean isUpperCaseExist = false;
		if (S == null || S.isEmpty()) {
			return longest;
		}
		char chars[] = S.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			Character c = chars[i];
			if (Character.isUpperCase(c)) {
				isUpperCaseExist = true;

			}
			if (Character.isDigit(c)) {
				characterLong = 0;
				isUpperCaseExist = false;
			} else {
				characterLong = characterLong + 1;
			}
			if (isUpperCaseExist) {
				longest = characterLong;
			}
		}
		return longest;
	}
}
