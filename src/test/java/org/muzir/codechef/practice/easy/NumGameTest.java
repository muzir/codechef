package org.muzir.codechef.practice.easy;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class NumGameTest {
	private NumGame game;

	@Before
	public void setUp() throws Exception {
		game = new NumGame();
	}

	@Test
	public void should_FindWinner_ReturnWinner() {
		String winnerName = game.findWinner("1");
		assertEquals("BOB", winnerName);
		winnerName = game.findWinner("2");
		assertEquals("ALICE", winnerName);
		winnerName = game.findWinner("3");
		assertEquals("BOB", winnerName);
		winnerName = game.findWinner("4");
		assertEquals("ALICE", winnerName);
	}

}
