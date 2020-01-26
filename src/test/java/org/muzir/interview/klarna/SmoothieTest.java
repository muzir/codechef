package org.muzir.interview.klarna;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmoothieTest {

	@Test(expected = IllegalArgumentException.class)
	public void throwIllegalArgumentException_IfOrderIsNull() {
		Smoothie.ingredients(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void throwIllegalArgumentExceptionIfOrderIsEmpty() {
		Smoothie.ingredients("");
	}


	@Test
	public void classicSmoothie() {
		assertEquals("banana,honey,mango,peach,pineapple,strawberry",
				Smoothie.ingredients("Classic"));
	}

	@Test
	public void classicSmoothieAllergicToStrawberry() {
		assertEquals("banana,honey,mango,peach,pineapple",
				Smoothie.ingredients("Classic,-strawberry"));
	}

	@Test
	public void greenieSmoothieAllergicToGreenAppleAndLimeAndAvocadoAndAppleJuice() {
		assertEquals("ice,spinach",
				Smoothie.ingredients("Greenie,-green apple,-lime,-avocado,-apple juice"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void throwIllegalArgumentException_IfOrderContainsAdditionalIngredients() {
		Smoothie.ingredients("Classic,chocolate");
	}
}
