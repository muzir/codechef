package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class COOMILKTest {

	@Test
	public void initialCases() {
		assertEquals(COOMILK.YES, COOMILK.checkFollowInstruction("cookie milk milk cookie milk cookie milk"));
		assertEquals(COOMILK.NO, COOMILK.checkFollowInstruction("cookie cookie milk milk milk"));
		assertEquals(COOMILK.YES, COOMILK.checkFollowInstruction("milk milk milk milk"));
		assertEquals(COOMILK.NO, COOMILK.checkFollowInstruction("cookie"));
		assertEquals(COOMILK.YES, COOMILK.checkFollowInstruction("milk"));
		assertEquals(COOMILK.NO, COOMILK.checkFollowInstruction("milk cookie"));
		assertEquals(COOMILK.NO, COOMILK.checkFollowInstruction("milk milk milk milk milk milk cookie"));
		assertEquals(COOMILK.YES, COOMILK.checkFollowInstruction("milk milk milk milk milk milk cookie milk"));
	}
}
