package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SNELECTTest {
	@Test
	public void initalCases() {
		assertEquals(SNELECT.snakes, SNELECT.selectWinner("s"));
		assertEquals(SNELECT.mongooses, SNELECT.selectWinner("m"));
		assertEquals(SNELECT.mongooses, SNELECT.selectWinner("sm"));
		assertEquals(SNELECT.mongooses, SNELECT.selectWinner("ms"));
		assertEquals(SNELECT.tie, SNELECT.selectWinner("ssm"));
		assertEquals(SNELECT.tie, SNELECT.selectWinner("sms"));
		assertEquals(SNELECT.snakes, SNELECT.selectWinner("ssmmmssss"));
		assertEquals(SNELECT.mongooses, SNELECT.selectWinner("smsmsmsmm"));
		assertEquals(SNELECT.mongooses, SNELECT.selectWinner("smsmsmsm"));
	}

	@Test
	public void cornerCases(){
		assertEquals(SNELECT.mongooses, SNELECT.selectWinner("smsmsmsms"));
		assertEquals(SNELECT.tie, SNELECT.selectWinner("smsmsmsmssss"));
		assertEquals(SNELECT.mongooses, SNELECT.selectWinner("smsmsmsmssssm"));
	}


}
