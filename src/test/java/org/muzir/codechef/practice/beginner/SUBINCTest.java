package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class SUBINCTest {

	@Test
	public void test() {
		assertEquals(1, SUBINC.calculateSubArrays(SUBINC.getArrayOfString("1")));
		assertEquals(3, SUBINC.calculateSubArrays(SUBINC.getArrayOfString("1 2")));
	}

	@Test
	public void test1() {
		assertEquals(1, SUBINC.calculateSubArrays(SUBINC.getArrayOfString("5")));
		assertEquals(6, SUBINC.calculateSubArrays(SUBINC.getArrayOfString("1 4 2 3")));
	}

	@Test
	public void test2() {
		assertEquals(15, SUBINC.calculateSubArrays(SUBINC.getArrayOfString("1 5 6 1 3 4 232 5 23 98 43 1")));
	}

	@Test
	public void test3() {
		long start = System.currentTimeMillis();
		StringBuilder input = new StringBuilder();
		for (int i = 1; i <= 10000; i++) {
			input.append(i).append(" ");
		}
		assertEquals(10001, SUBINC.calculateSubArrays(SUBINC.getArrayOfString(input.toString())));
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
		assertEquals(100001, SUBINC.calculateSubArrays(SUBINC.getArrayOfString(input.toString())));
		long end = System.currentTimeMillis();
		long millis = end - start;
		System.out.println(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
		System.out.println("Milisecond:" + millis);
	}
}
