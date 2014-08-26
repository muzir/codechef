package org.muzir.codechef.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.muzir.codechef.practice.easy.LeMagic;

/**
 * Little Elephant and Magic http://www.codechef.com/problems/LEMAGIC
 * 
 * @author muzir
 *
 */

public class LeMagicTest {

	@Test
	public void initMagicBoard() throws FileNotFoundException, IOException {
		LeMagic leMagic = new LeMagic();
		leMagic.setMagicBoard(leMagic.initMagicBoard("/magicBoard.txt"));
		Assert.assertTrue(leMagic.getMagicBoard() != null);

	}
}
