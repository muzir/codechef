package org.muzir.codechef.practice.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CIELABTest {
	private Cielab cielab;

	private List<Integer> oneStage = new ArrayList<Integer>();

	@Before
	public void setUp() {
		oneStage.add(new Integer(1));
		oneStage.add(new Integer(2));
		oneStage.add(new Integer(3));
		oneStage.add(new Integer(4));
		oneStage.add(new Integer(5));
		oneStage.add(new Integer(6));
		oneStage.add(new Integer(7));
		oneStage.add(new Integer(8));
		oneStage.add(new Integer(9));
		oneStage.add(new Integer(0));
		cielab = new Cielab();
	}

	@Test
	public void shouldOneStage() {
		Integer exact = Integer.valueOf(cielab.solution(9, 1));
		oneStage.remove(new Integer(8));
		Assert.assertNotEquals(new Integer(8), exact);
		Assert.assertTrue(oneStage.contains(exact));
	}

	@Test
	public void shouldOne() {
		Integer exact = Integer.valueOf(cielab.solution(10000, 1));
		System.out.println(exact);
		Integer exact2 = Integer.valueOf(cielab.solution(2, 1));
		System.out.println(exact2);
	}
}
