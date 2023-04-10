package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.AbstractMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MSTEPTest {
	@Test
	public void test() {
		Map.Entry<Integer, Integer> entry1 = new AbstractMap.SimpleEntry<Integer, Integer>(1, 3);
		Map.Entry<Integer, Integer> entry2 = new AbstractMap.SimpleEntry<Integer, Integer>(2, 1);
		assertEquals(3, MSTEP.calculatePairAdjacent(entry1, entry2));
	}
	
	@Test
	public void test1(){
		
	}
}
