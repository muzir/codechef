package org.muzir.codechef.longContest.feb18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CHEFPTNTTest {

	@Test
	public void calculateResultTests() {
		assertEquals(4, CHEFPTNT.calculateResult(2, 2, 4, 2));
		assertEquals(3, CHEFPTNT.calculateResult(2, 2, 3, 1));
		assertEquals(8, CHEFPTNT.calculateResult(7, 1, 4, 4));
		assertEquals(5, CHEFPTNT.calculateResult(7, 1, 3, 4));
		assertEquals(0, CHEFPTNT.calculateResult(7, 1, 0, 4));
		assertEquals(100, CHEFPTNT.calculateResult(50, 50, 2, 50));
		assertEquals(0, CHEFPTNT.calculateResult(50, 50, 2, 0));
		assertEquals(0, CHEFPTNT.calculateResult(50, 50, 12, 0));
		assertEquals(5, CHEFPTNT.calculateResult(50, 50, 5, 1));
		assertEquals(50, CHEFPTNT.calculateResult(50, 50, 5, 10));
		assertEquals(15, CHEFPTNT.calculateResult(5, 10, 6, 12));
		assertEquals(36, CHEFPTNT.calculateResult(50, 50, 12, 3));
	}

	@Test
	public void initialCases() {
		assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("4 4 2 4", "EEOO"));
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("4 3 1 4", "EEOO"));
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("4 0 1 4", "EEOO"));
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("4 1 1 4", "OOOO"));
		assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("1 1 1 4", "OOOO"));
		assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("1 1 1 1", "O"));
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("1 1 1 1", "E"));
		assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("1 1 1 2", "EO"));
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("2 1 1 2", "EO"));
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("3 3 1 3", "EOE"));
		assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("3 3 1 3", "OEO"));
		assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("3 12 1000000 3", "OEO"));
		assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("3 2 1000000 3", "OEO"));
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("3 1 1000000 3", "OEO"));
	}

	@Test
	public void problematicCases() {
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("12 1 2 3", "OOOOEEOO"));
		assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("12 1 10000 3", "OOOOEEOO"));
		assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("12 2 6 12", "OOOOEEEEEEOO"));
	}
}
