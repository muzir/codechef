package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PCJ18ATest {
	@Test
	public void test() {
		int[] dishesSecretIngredient = {10, 20, 30};
		assertEquals(PCJ18A.YES, PCJ18A.solution(dishesSecretIngredient, 20));
		assertEquals(PCJ18A.NO, PCJ18A.solution(dishesSecretIngredient, 40));
	}
}
