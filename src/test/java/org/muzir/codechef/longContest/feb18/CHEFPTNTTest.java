package org.muzir.codechef.longContest.feb18;

import org.junit.Assert;
import org.junit.Test;

public class CHEFPTNTTest {

	@Test
	public void calculateResultTests() {
		Assert.assertEquals(4, CHEFPTNT.calculateResult(2, 2, 4, 2));
		Assert.assertEquals(3, CHEFPTNT.calculateResult(2, 2, 3, 1));
		Assert.assertEquals(8, CHEFPTNT.calculateResult(7, 1, 4, 4));
		Assert.assertEquals(5, CHEFPTNT.calculateResult(7, 1, 3, 4));
		Assert.assertEquals(0, CHEFPTNT.calculateResult(7, 1, 0, 4));
		Assert.assertEquals(100, CHEFPTNT.calculateResult(50, 50, 2, 50));
		Assert.assertEquals(0, CHEFPTNT.calculateResult(50, 50, 2, 0));
		Assert.assertEquals(0, CHEFPTNT.calculateResult(50, 50, 12, 0));
		Assert.assertEquals(5, CHEFPTNT.calculateResult(50, 50, 5, 1));
		Assert.assertEquals(50, CHEFPTNT.calculateResult(50, 50, 5, 10));
		Assert.assertEquals(15, CHEFPTNT.calculateResult(5, 10, 6, 12));
		Assert.assertEquals(36, CHEFPTNT.calculateResult(50, 50, 12, 3));
	}

	@Test
	public void initialCases() {
		Assert.assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("4 4 2 4", "EEOO"));
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("4 3 1 4", "EEOO"));
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("4 0 1 4", "EEOO"));
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("4 1 1 4", "OOOO"));
		Assert.assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("1 1 1 4", "OOOO"));
		Assert.assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("1 1 1 1", "O"));
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("1 1 1 1", "E"));
		Assert.assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("1 1 1 2", "EO"));
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("2 1 1 2", "EO"));
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("3 3 1 3", "EOE"));
		Assert.assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("3 3 1 3", "OEO"));
		Assert.assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("3 12 1000000 3", "OEO"));
		Assert.assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("3 2 1000000 3", "OEO"));
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("3 1 1000000 3", "OEO"));
	}

	@Test
	public void problematicCases() {
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("12 1 2 3", "OOOOEEOO"));
		Assert.assertEquals(CHEFPTNT.NO, CHEFPTNT.finishPatentCases("12 1 10000 3", "OOOOEEOO"));
		Assert.assertEquals(CHEFPTNT.YES, CHEFPTNT.finishPatentCases("12 2 6 12", "OOOOEEEEEEOO"));
	}
}
