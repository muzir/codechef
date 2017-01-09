package org.muzir.codechef.longContest;

import static org.junit.Assert.assertEquals;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
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

	@Test
	public void test7() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Map<Integer, Integer> desSortedMap = new TreeMap(new Comparator() {
			@Override
			public int compare(Object param1, Object param2) {
				Integer o1 = (Integer) param1;
				Integer o2 = (Integer) param2;
				return o2.compareTo(o1);
			}
		});
		for (int i = 100000; i > 0; i--) {
			desSortedMap.put(i, i);
		}

		for (Map.Entry<Integer, Integer> entry : desSortedMap.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

	private void runCase(int input) {
		HashMap<Integer, HashSet<Integer>> connectionMap = new HashMap<>();
		StringBuilder populationStr = new StringBuilder();
		long start1 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < input - 2; k++) {
			sb.append(input).append(" ");
		}
		sb.append(input - 3).append(" ").append(input - 2);
		for (int i = 1; i <= input; i++) {
			int f = i + 1;
			CAPIMOVE.addConnectionMap(i + " " + f, connectionMap);
			populationStr.append(i).append(" ");
		}
		long end1 = System.currentTimeMillis();
		System.out.println("addConnectionMap:" + (end1 - start1));
		System.out.println(populationStr.toString());
		int[] populationIntArray = CAPIMOVE.getArrayOfString(populationStr.toString());
		long start = System.currentTimeMillis();
		assertEquals(sb.toString(), CAPIMOVE.printCapital(populationIntArray, connectionMap));
		long end = System.currentTimeMillis();
		System.out.println("printCapital:" + (end - start));
	}
}
