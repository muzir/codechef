package org.muzir.interview.codility;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class Q3NewTest {
	private Q3New q3;

	@Before
	public void setUp() throws Exception {
		q3 = new Q3New();
	}

	@Test
	public void shouldInitialCases() {
		int[] emptyArray = {};
		int[] fullArray = { 2, 3, 5 };
		int maxFloor = 5;
		int maxPersonCount = 2;
		int maxWeight = 200;
		Assert.assertEquals(0, q3.solution(null, fullArray, maxFloor, maxPersonCount, maxWeight));
		Assert.assertEquals(0, q3.solution(fullArray, null, maxFloor, maxPersonCount, maxWeight));
		Assert.assertEquals(0, q3.solution(emptyArray, fullArray, maxFloor, maxPersonCount, maxWeight));
		Assert.assertEquals(0, q3.solution(fullArray, emptyArray, maxFloor, maxPersonCount, maxWeight));
	}

	@Test
	public void shouldValidCases1() {
		int[] personWeights = { 40 };
		int[] personTargetFloors = { 2 };
		int maxFloor = 5;
		int maxPersonCount = 2;
		int maxWeight = 200;
		Assert.assertEquals(2, q3.solution(personWeights, personTargetFloors, maxFloor, maxPersonCount, maxWeight));
	}

	@Test
	public void shouldValidCases2() {
		int[] personWeights = { 10, 40 };
		int[] personTargetFloors = { 2, 5 };
		int maxFloor = 5;
		int maxPersonCount = 1;
		int maxWeight = 200;
		Assert.assertEquals(4, q3.solution(personWeights, personTargetFloors, maxFloor, maxPersonCount, maxWeight));
	}

	@Test
	public void shouldValidCases3() {
		int[] personWeights = { 90, 90 };
		int[] personTargetFloors = { 2 };
		int maxFloor = 5;
		int maxPersonCount = 4;
		int maxWeight = 90;
		Assert.assertEquals(4, q3.solution(personWeights, personTargetFloors, maxFloor, maxPersonCount, maxWeight));
	}

	@Test
	public void shouldValidCases4() {
		int[] personWeights = { 90, 90 };
		int[] personTargetFloors = { 2 };
		int maxFloor = 5;
		int maxPersonCount = 4;
		int maxWeight = 80;
		Assert.assertEquals(0, q3.solution(personWeights, personTargetFloors, maxFloor, maxPersonCount, maxWeight));
	}

	@Test
	public void shouldValidCases5() {
		int[] personWeights = { 90, 90, 70, 60, 60, 75, 80 };
		int[] personTargetFloors = { 2, 3, 2, 4, 1, 3, 4 };
		int maxFloor = 5;
		int maxPersonCount = 4;
		int maxWeight = 80;
		Assert.assertEquals(10, q3.solution(personWeights, personTargetFloors, maxFloor, maxPersonCount, maxWeight));
	}

	@Test
	public void shouldValidCases() {
		int[] personWeights = { 60, 80, 40 };
		int[] personTargetFloors = { 2, 3, 5 };
		int maxFloor = 5;
		int maxPersonCount = 2;
		int maxWeight = 200;
		Assert.assertEquals(5, q3.solution(personWeights, personTargetFloors, maxFloor, maxPersonCount, maxWeight));
	}

}
