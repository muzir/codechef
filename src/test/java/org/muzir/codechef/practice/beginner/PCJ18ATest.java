package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class PCJ18ATest {
	@Test
	public void test() {
		int[] dishesSecretIngredient = {10, 20, 30};
		Assert.assertEquals(PCJ18A.YES, PCJ18A.solution(dishesSecretIngredient, 20));
		Assert.assertEquals(PCJ18A.NO, PCJ18A.solution(dishesSecretIngredient, 40));
	}
}
