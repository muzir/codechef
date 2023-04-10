package org.muzir.codechef.practice.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumGameTest {

	@Test
	public void should_FindWinner_ReturnWinner() {
		String winnerName = NumGame.findWinner("1");
		assertEquals("BOB", winnerName);
		winnerName = NumGame.findWinner("2");
		assertEquals("ALICE", winnerName);
		winnerName = NumGame.findWinner("3");
		assertEquals("BOB", winnerName);
		winnerName = NumGame.findWinner("4");
		assertEquals("ALICE", winnerName);
	}

}
