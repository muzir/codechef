package org.muzir.codechef.practice.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NITIKATest {
	@Test
	public void initialCases() {
		assertEquals("Gandhi", NITIKA.formatName("gandhi"));
		assertEquals("Gandhi", NITIKA.formatName("gandhI"));
		assertEquals("M. Gandhi", NITIKA.formatName("mahatma gandhI"));
		assertEquals("M. K. Gandhi", NITIKA.formatName("Mohndas KaramChand gandhi"));
		assertEquals("M. K. Karamchand", NITIKA.formatName("Mohndas KaramChand KaramChand"));
	}
}
