package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SUBINCTest {

	@Test
	public void test() {
		assertEquals(1, SUBINC.calculateSubArrays("1"));
		assertEquals(3, SUBINC.calculateSubArrays("1 2"));
	}

	@Test
	public void test1() {
		assertEquals(1, SUBINC.calculateSubArrays("5"));
		assertEquals(6, SUBINC.calculateSubArrays("1 4 2 3"));
		assertEquals(7, SUBINC.calculateSubArrays("1 2 1 1 4"));
		assertEquals(7, SUBINC.calculateSubArrays("1 2 4 1 4"));
		assertEquals(8, SUBINC.calculateSubArrays("1 2 3 1 2 3"));
		assertEquals(10, SUBINC.calculateSubArrays("1 2 3 1 2 3 2 1"));
	}

	@Test
	public void test2() {
		assertEquals(15, SUBINC.calculateSubArrays("1 5 6 1 3 4 232 5 23 98 43 1"));
	}

	@Test
	public void test3() {
		long start = System.currentTimeMillis();
		StringBuilder input = new StringBuilder();
		for (int i = 1; i <= 10000; i++) {
			input.append(i).append(" ");
		}
		assertEquals(10001, SUBINC.calculateSubArrays(input.toString()));
		long end = System.currentTimeMillis();
		long millis = end - start;
		System.out.println(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
		System.out.println("Milisecond:" + millis);
	}

	@Test
	public void test4() {
		long start = System.currentTimeMillis();
		StringBuilder input = new StringBuilder();
		for (int i = 1; i <= 100000; i++) {
			input.append(i).append(" ");
		}
		assertEquals(100001, SUBINC.calculateSubArrays(input.toString()));
		long end = System.currentTimeMillis();
		long millis = end - start;
		System.out.println(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
		System.out.println("Milisecond:" + millis);
	}

	@Test
	public void test5() {
		long start = System.currentTimeMillis();
		StringBuilder input = new StringBuilder();
		for (int i = 1; i <= 100000; i++) {
			input.append(1).append(" ");
		}
		assertEquals(100001, SUBINC.calculateSubArrays(input.toString()));
		long end = System.currentTimeMillis();
		long millis = end - start;
		System.out.println(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
		System.out.println("Milisecond:" + millis);
	}

	@Test
	public void test6() {
		long start = System.currentTimeMillis();
		StringBuilder input = new StringBuilder();
		for (int i = 100000; 0 < i; i--) {
			input.append(1);
			if (i != 1) {
				input.append(" ");
			}

		}
		assertEquals(100001, SUBINC.calculateSubArrays(input.toString()));
		long end = System.currentTimeMillis();
		long millis = end - start;
		System.out.println(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
		System.out.println("Milisecond:" + millis);
	}
}
