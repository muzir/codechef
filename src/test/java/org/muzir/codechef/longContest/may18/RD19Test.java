package org.muzir.codechef.longContest.may18;

import org.junit.Assert;
import org.junit.Test;

public class RD19Test {
	@Test
	public void test() {
		int[] parameters = {2, 4, 6, 8};
		Assert.assertEquals(-1, RD19.solution(parameters));
	}

	@Test
	public void test1() {
		int[] parameters = {2, 4, 6, 9};
		Assert.assertEquals(0, RD19.solution(parameters));
	}

	@Test
	public void test2() {
		int[] parameters = {2, 3};
		Assert.assertEquals(0, RD19.solution(parameters));
	}

	@Test
	public void test3() {
		int[] parameters = {23, 23};
		Assert.assertEquals(-1, RD19.solution(parameters));
	}

	@Test
	public void test4() {
		int[] parameters = {23, 23};
		Assert.assertEquals(-1, RD19.solution(parameters));
	}

	@Test
	public void test5() {
		int i, k, j;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (i = 2; i <= 25000; i++) {
			k = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}
			}
			if (k == 0) {
				sb.append(i).append(",");
				count++;
			}
		}
		count--;
		System.out.println("Total: " + count);
		System.out.println(sb.toString());
	}

}
