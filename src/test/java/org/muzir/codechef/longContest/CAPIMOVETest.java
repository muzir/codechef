package org.muzir.codechef.longContest;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class CAPIMOVETest {

	@Test
	public void test() {
		HashMap<Integer, HashSet<Integer>> connectionMap = new HashMap<>();
		CAPIMOVE.addConnectionMap("1 3", connectionMap);
		CAPIMOVE.addConnectionMap("2 3", connectionMap);
		CAPIMOVE.addConnectionMap("3 4", connectionMap);
		CAPIMOVE.addConnectionMap("4 5", connectionMap);
		CAPIMOVE.addConnectionMap("4 6", connectionMap);
		String populationStr = "5 10 15 20 25 30";
		int[] populationIntArray = CAPIMOVE.getArrayOfString(populationStr);
		assertEquals("6 6 6 2 6 5", CAPIMOVE.printCapital(populationIntArray, connectionMap));
	}

	@Test
	public void testAll() {
		long start = System.currentTimeMillis();
		runCase(10000);
		runCase(10000);
		runCase(10000);
		runCase(10000);
		runCase(10000);
		long end = System.currentTimeMillis();
		long millis = end - start;
		System.out.println(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
		System.out.println("Milisecond:" + millis);
	}

	@Test
	public void test2() {
		long start = System.currentTimeMillis();
		runCase(10000);
		long end = System.currentTimeMillis();
		long millis = end - start;
		System.out.println(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
		System.out.println("Milisecond:" + millis);
	}

	@Test
	public void test3() {
		long start = System.currentTimeMillis();
		runCase(10000);
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
		runCase(10000);
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
		runCase(10000);
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
		runCase(50000);
		long end = System.currentTimeMillis();
		long millis = end - start;
		System.out.println(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
		System.out.println("Milisecond:" + millis);
	}

	private void runCase(int input) {
		HashMap<Integer, HashSet<Integer>> connectionMap = new HashMap<>();
		StringBuilder populationStr = new StringBuilder();
		long start1 = System.currentTimeMillis();
		for (int i = 1; i < input; i++) {
			CAPIMOVE.addConnectionMap(i + " " + ++i, connectionMap);
			populationStr.append(i).append(" ");
		}
		long end1 = System.currentTimeMillis();
		System.out.println("addConnectionMap:" + (end1 - start1));
		int[] populationIntArray = CAPIMOVE.getArrayOfString(populationStr.toString());
		long start = System.currentTimeMillis();
		CAPIMOVE.printCapital(populationIntArray, connectionMap);
		long end = System.currentTimeMillis();
		System.out.println("printCapital:" + (end - start));
	}
}
