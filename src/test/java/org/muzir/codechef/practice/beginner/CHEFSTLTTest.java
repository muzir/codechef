package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class CHEFSTLTTest {

	@Test
	public void testIsAllowedCharacter() {
		Assert.assertEquals("1 3", CHEFSTLT.calculateDifference("a?c", "??b"));
		Assert.assertEquals("0 3", CHEFSTLT.calculateDifference("???a", "???a"));
		Assert.assertEquals("3 5", CHEFSTLT.calculateDifference("?abac", "aba?w"));
	}

	@Test
	public void testCornerCases() {
		Assert.assertEquals("1 1", CHEFSTLT.calculateDifference("0", "1"));
		Assert.assertEquals("0 0", CHEFSTLT.calculateDifference("0", "0"));
		Assert.assertEquals("0 1", CHEFSTLT.calculateDifference("a", "?"));
		Assert.assertEquals("0 1", CHEFSTLT.calculateDifference("?", "a"));
		Assert.assertEquals("0 1", CHEFSTLT.calculateDifference("?", "?"));
		Assert.assertEquals("0 2", CHEFSTLT.calculateDifference("??", "??"));
		Assert.assertEquals("0 3", CHEFSTLT.calculateDifference("???", "???"));
	}

	@Test
	public void testLargeInputs() {
		Assert.assertEquals("1 12", CHEFSTLT.calculateDifference("abcd?e?f?g?i?", "aa?????????????"));
		Assert.assertEquals("2 8", CHEFSTLT.calculateDifference("???FaaRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		Assert.assertEquals("16 22", CHEFSTLT.calculateDifference("???FaaRDbIGCWlIRXf4NuHblfE4vx44neeeeeeeewpPXVIPOWliljPuf2w3VEhJveeW4bBeeeeee5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		Assert.assertEquals("70 76", CHEFSTLT.calculateDifference("???FaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		Assert.assertEquals("70 82", CHEFSTLT.calculateDifference("???FaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fab?????????"));
	}
}
