package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FLOW010Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals("Destroyer", FLOW010.writeShip("d"));
		Assert.assertEquals("Destroyer", FLOW010.writeShip("D"));
		Assert.assertEquals("Cruiser", FLOW010.writeShip("c"));
		Assert.assertEquals("Cruiser", FLOW010.writeShip("C"));
		Assert.assertEquals("Frigate", FLOW010.writeShip("f"));
		Assert.assertEquals("Frigate", FLOW010.writeShip("F"));
		Assert.assertEquals("BattleShip", FLOW010.writeShip("b"));
		Assert.assertEquals("BattleShip", FLOW010.writeShip("B"));
	}
}
