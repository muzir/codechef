package org.muzir.codechef.practice.beginner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SMPAIRTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		List<Integer> elements = new ArrayList<Integer>();
		Collections.addAll(elements, 1, 2);
		Assert.assertEquals(new BigDecimal(3), SMPAIR.calculateSmallestPair(elements));
		Assert.assertEquals(new BigDecimal(-1), SMPAIR.calculateSmallestPair(Arrays.<Integer> asList(3, 5, 0, 8, 1, -1)));
		Assert.assertEquals(new BigDecimal(-10),
				SMPAIR.calculateSmallestPair(Arrays.<Integer> asList(3, 5, 0, 8, 1, -10)));
		Assert.assertEquals(new BigDecimal(-1000000),
				SMPAIR.calculateSmallestPair(Arrays.<Integer> asList(3, 5, 0, 8, 1, -1000000)));
		Assert.assertEquals(new BigDecimal(1),
				SMPAIR.calculateSmallestPair(Arrays.<Integer> asList(3, 5, 0, 8, 1, 1000000)));
	}

}
