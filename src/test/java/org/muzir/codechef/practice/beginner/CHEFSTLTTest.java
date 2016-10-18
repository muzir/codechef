package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CHEFSTLTTest {
	private Chefstlt chefstlt;

	@Before
	public void setUp() {
		chefstlt = new Chefstlt();
	}

	@Test
	public void testIsAllowedCharacter() {
		Assert.assertEquals("1 3", chefstlt.calculateDifference("a?c", "??b"));
		Assert.assertEquals("0 3", chefstlt.calculateDifference("???a", "???a"));
		Assert.assertEquals("3 5", chefstlt.calculateDifference("?abac", "aba?w"));
	}

	@Test
	public void testCornerCases() {
		Assert.assertEquals("0 0", chefstlt.calculateDifference("", ""));
		Assert.assertEquals("0 0", chefstlt.calculateDifference(null, null));
		Assert.assertEquals("0 0", chefstlt.calculateDifference(null, "dsada"));
		Assert.assertEquals("0 0", chefstlt.calculateDifference("dadas", null));
		Assert.assertEquals("1 1", chefstlt.calculateDifference("0", "1"));
		Assert.assertEquals("0 0", chefstlt.calculateDifference("0", "0"));
		Assert.assertEquals("0 1", chefstlt.calculateDifference("a", "?"));
		Assert.assertEquals("0 1", chefstlt.calculateDifference("?", "a"));
		Assert.assertEquals("0 1", chefstlt.calculateDifference("?", "?"));
		Assert.assertEquals("0 2", chefstlt.calculateDifference("??", "??"));
		Assert.assertEquals("0 3", chefstlt.calculateDifference("???", "???"));
	}

	@Test
	public void testLargeInputs(){
		Assert.assertEquals("1 12", chefstlt.calculateDifference("abcd?e?f?g?i?", "aa?????????????"));
		Assert.assertEquals("2 8", chefstlt.calculateDifference("???FaaRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		Assert.assertEquals("16 22", chefstlt.calculateDifference("???FaaRDbIGCWlIRXf4NuHblfE4vx44neeeeeeeewpPXVIPOWliljPuf2w3VEhJveeW4bBeeeeee5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		Assert.assertEquals("70 76", chefstlt.calculateDifference("???FaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		Assert.assertEquals("70 82", chefstlt.calculateDifference("???FaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fab?????????"));
	}
}
