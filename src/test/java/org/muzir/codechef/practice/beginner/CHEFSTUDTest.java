package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CHEFSTUDTest {

	

	@Test
	public void shouldUnionCount() {
		int[] ignored = { 1, 4, 6, 7 };
		int[] tracked = { 1, 2, 3, 4, 6, 7 };
		assertEquals(6, VCS.getUnionCount(ignored, tracked));
	}

	
}
