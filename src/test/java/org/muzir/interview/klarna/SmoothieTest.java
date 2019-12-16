package org.muzir.interview.klarna;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmoothieTest {

	@Test(expected = IllegalArgumentException.class)
	public void invalidNullInput() {
		Smoothie.ingredients(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidEmptyInput() {
		Smoothie.ingredients("");
	}


	@Test
	public void classicSmoothie() {
		assertEquals("banana,honey,mango,peach,pineapple,strawberry",
				Smoothie.ingredients("Classic"));
	}

	@Test
	public void classicSmoothieWithoutStrawberry() {
		assertEquals("banana,honey,mango,peach,pineapple",
				Smoothie.ingredients("Classic,-strawberry"));
	}

	@Test
	public void greenieSmoothieWithoutStrawberry() {
		//GREENIE("Greenie", new String[]{"green apple", "lime", "avocado", "spinach", "ice", "apple juice"}),
		assertEquals( "ice,spinach",
				Smoothie.ingredients("Greenie,-green apple,-lime,-avocado,-apple juice"));
	}

}
