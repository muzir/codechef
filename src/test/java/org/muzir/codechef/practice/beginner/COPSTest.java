package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class COPSTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(1, COPS.getCopsHouseStartIndex(12, 56));
		assertEquals(68, COPS.getCopsHouseEndIndex(12, 56));
	}

	@Test
	public void shouldGetSafeHousesCount() {
		int[] copsHouseIndexArray = { 1, 100 };
		assertEquals(58, COPS.getSafeHousesCount(20, copsHouseIndexArray));
	}

	@Test
	public void shouldGetSafeHousesCount2() {
		int[] copsHouseIndexArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(0, COPS.getSafeHousesCount(100, copsHouseIndexArray));
	}

	@Test
	public void shouldGetSafeHousesCount3() {
		int[] copsHouseIndexArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(10, COPS.getSafeHousesCount(80, copsHouseIndexArray));
	}

	@Test
	public void shouldGetSafeHousesCount4() {
		int[] copsHouseIndexArray = { 1 };
		assertEquals(98, COPS.getSafeHousesCount(1, copsHouseIndexArray));
	}

	@Test
	public void shouldEliminateHouses() {
		int startIndex = 1;
		int endIndex = 19;
		List<Integer> houses = new ArrayList<>();
		houses = buildHouses();
		List<Integer> remainingHouses = COPS.eliminateHouses(startIndex, endIndex, houses);
		assertEquals(81, remainingHouses.size());
	}

	private List<Integer> buildHouses() {
		List<Integer> houses = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			houses.add(i);
		}
		return houses;
	}

}
