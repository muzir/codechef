package org.muzir.interview.mobilab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseNameTest {
	private ReverseName reverseName;

	@Before
	public void setUp() {
		reverseName = new ReverseName();
	}

	@Test
	public void shouldReverseName_Erhun() {
		String name = "Erhun";
		char[] reverseCharArray = { 'n', 'u', 'h', 'r', 'E' };
		char[] charName = name.toCharArray();
		Assert.assertArrayEquals(reverseCharArray, reverseName.reverseName(charName));
	}

	@Test
	public void shouldReverseName_Anil() {
		String name = "Anil";
		char[] reverseCharArray = { 'l', 'i', 'n', 'A' };
		char[] charName = name.toCharArray();
		Assert.assertArrayEquals(reverseCharArray, reverseName.reverseName(charName));
	}
	@Test
	public void shouldReverseName_Empty() {
		String name = "";
		char[] reverseCharArray = {};
		char[] charName = name.toCharArray();
		Assert.assertArrayEquals(reverseCharArray, reverseName.reverseName(charName));
	}
	@Test
	public void shouldReverseName_OneSize() {
		String name = "a";
		char[] reverseCharArray = {'a'};
		char[] charName = name.toCharArray();
		Assert.assertArrayEquals(reverseCharArray, reverseName.reverseName(charName));
	}
}
