package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CHEFSQTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String[] sequence = { "1", "2", "3", "4", "5", "6" };
		String[] favouriteSequence = { "2", "3", "4" };
		Assert.assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
	}

	@Test
	public void test1() {
		String[] sequence = { "22", "5", "15", "6", "33", "1", "4" };
		String[] favouriteSequence = { "4", "15" };
		Assert.assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
	}

	@Test
	public void test2() {
		String[] sequence = {};
		String[] favouriteSequence = { "4", "15" };
		Assert.assertEquals("No", CHEFSQ.isContain(sequence, favouriteSequence));

	}

	@Test
	public void test3() {
		String[] sequence = {};
		String[] favouriteSequence = {};
		Assert.assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));

	}

	@Test
	public void test4() {
		String[] sequence = { " " };
		String[] favouriteSequence = { " " };
		Assert.assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
	}

	@Test
	public void test6() {
		String[] sequence = { "1", "3", "4", "3" };
		String[] favouriteSequence = { "1", "4" };
		Assert.assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
	}

	@Test
	public void test7() {
		String[] sequence = { "1", "3", "4", "4", "3" };
		String[] favouriteSequence = { "1", "3" };
		Assert.assertEquals("Yes", CHEFSQ.isContain(sequence, favouriteSequence));
	}
}
