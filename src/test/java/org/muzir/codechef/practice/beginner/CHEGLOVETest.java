package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CHEGLOVETest {
	@Test
	public void test() {
		int[] chefFingers = {1, 2, 3};
		int[] gloveLenghts = {2, 3, 4};
		CHEGLOVE.Matcher matcher = new CHEGLOVE.Matcher(chefFingers, gloveLenghts);
		assertEquals("front", matcher.solution());
	}

	@Test
	public void test1() {
		int[] chefFingers = {1, 2, 1};
		int[] gloveLenghts = {1, 2, 1};
		CHEGLOVE.Matcher matcher = new CHEGLOVE.Matcher(chefFingers, gloveLenghts);
		assertEquals("both", matcher.solution());
	}

	@Test
	public void test2() {
		int[] chefFingers = {3, 2, 1};
		int[] gloveLenghts = {1, 2, 3};
		CHEGLOVE.Matcher matcher = new CHEGLOVE.Matcher(chefFingers, gloveLenghts);
		assertEquals("back", matcher.solution());
	}

	@Test
	public void test3() {
		int[] chefFingers = {1, 3, 2, 4};
		int[] gloveLenghts = {1, 2, 3, 5};
		CHEGLOVE.Matcher matcher = new CHEGLOVE.Matcher(chefFingers, gloveLenghts);
		assertEquals("none", matcher.solution());
	}
}
