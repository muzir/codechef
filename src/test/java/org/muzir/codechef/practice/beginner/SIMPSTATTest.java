package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import java.security.SecureRandom;

public class SIMPSTATTest {

	@Test
	public void test() {
		long start = System.currentTimeMillis();
		SecureRandom sr = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append(sr.nextInt(100));
			if (i != 9999) {
				sb.append(" ");
			}
		}
		System.out.println(SIMPSTAT.solution(sb.toString(), 0));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	@Test
	public void test1() {
		System.out.println(SIMPSTAT.solution("2 9 -10 25 1", 0));
	}
}
