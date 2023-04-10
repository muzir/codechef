package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CHEFSTLTTest {

	@Test
	public void testIsAllowedCharacter() {
		assertEquals("1 3", CHEFSTLT.calculateDifference("a?c", "??b"));
		assertEquals("0 3", CHEFSTLT.calculateDifference("???a", "???a"));
		assertEquals("3 5", CHEFSTLT.calculateDifference("?abac", "aba?w"));
	}

	@Test
	public void testCornerCases() {
		assertEquals("1 1", CHEFSTLT.calculateDifference("0", "1"));
		assertEquals("0 0", CHEFSTLT.calculateDifference("0", "0"));
		assertEquals("0 1", CHEFSTLT.calculateDifference("a", "?"));
		assertEquals("0 1", CHEFSTLT.calculateDifference("?", "a"));
		assertEquals("0 1", CHEFSTLT.calculateDifference("?", "?"));
		assertEquals("0 2", CHEFSTLT.calculateDifference("??", "??"));
		assertEquals("0 3", CHEFSTLT.calculateDifference("???", "???"));
	}

	@Test
	public void testLargeInputs() {
		assertEquals("1 12", CHEFSTLT.calculateDifference("abcd?e?f?g?i?", "aa?????????????"));
		assertEquals("2 8", CHEFSTLT.calculateDifference("???FaaRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		assertEquals("16 22", CHEFSTLT.calculateDifference("???FaaRDbIGCWlIRXf4NuHblfE4vx44neeeeeeeewpPXVIPOWliljPuf2w3VEhJveeW4bBeeeeee5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		assertEquals("70 76", CHEFSTLT.calculateDifference("???FaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fabk0aZmX???"));
		assertEquals("70 82", CHEFSTLT.calculateDifference("???FaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCa5HiUrga2ngt6LexZG9Fabk0aZmX???", "???FuJRDbIGCWlIRXf4NuHblfE4vx44nsljVg7xMwpPXVIPOWliljPuf2w3VEhJveeW4bBNmLtCa5HiUrga2ngt6LexZG9Fab?????????"));
	}
}
