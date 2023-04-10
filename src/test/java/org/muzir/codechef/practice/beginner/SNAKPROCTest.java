package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SNAKPROCTest {

	@Test
	public void initialCases() {
		assertEquals(SNAKPROC.VALID, SNAKPROC.checkReport("..H..T...HTH....T."));
		assertEquals(SNAKPROC.VALID, SNAKPROC.checkReport("..."));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport("H..H..T..T"));
		assertEquals(SNAKPROC.VALID, SNAKPROC.checkReport("HT"));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport(".T...H..H.T"));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport("H..T..H"));
	}

	@Test
	public void cornerCases(){
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport("TT"));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport("HH"));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport("HTH"));
		assertEquals(SNAKPROC.VALID, SNAKPROC.checkReport("HTHT"));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport("H"));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport("T"));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport(".T."));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport(".H."));
		assertEquals(SNAKPROC.VALID, SNAKPROC.checkReport(".H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T.H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T..."));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport(".H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T.H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T..H"));
		assertEquals(SNAKPROC.INVALID, SNAKPROC.checkReport(".H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T.H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T....H.....T..T"));
	}
}
