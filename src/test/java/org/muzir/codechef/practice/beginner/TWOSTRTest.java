package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class TWOSTRTest {
	private static String YES = "Yes";
	private static String NO = "No";

	@Test
	public void testIsMatch() {
		Assert.assertEquals(YES, TWOSTR.isMatch("s?or?", "sco??"));
		Assert.assertEquals(YES, TWOSTR.isMatch("s????????", "sormane??"));
		Assert.assertEquals(YES, TWOSTR.isMatch("????", "????"));
		Assert.assertEquals(YES, TWOSTR.isMatch("eşit", "eşit"));
		Assert.assertEquals(YES, TWOSTR.isMatch("e?i?", "?ş?t"));
		Assert.assertEquals(NO, TWOSTR.isMatch("stor?", "sco??"));
		Assert.assertEquals(NO, TWOSTR.isMatch("stor?", "sco???"));
		Assert.assertEquals(NO, TWOSTR.isMatch("asd", "dasdas"));
		Assert.assertEquals(NO, TWOSTR.isMatch("S?or?", "sco??"));
		Assert.assertEquals(YES, TWOSTR.isMatch("s?or?", "sco??"));
		Assert.assertEquals(NO, TWOSTR.isMatch("s?or?", "Sco??"));
		Assert.assertEquals(YES, TWOSTR.isMatch("s", "s"));
		Assert.assertEquals(YES, TWOSTR.isMatch("ssssssssss", "ssssssssss"));
		Assert.assertEquals(YES, TWOSTR.isMatch("ssssssss??", "ssssssss??"));
	}

	@Test
	public void testIsEqualOrWildChar() {
		Assert.assertTrue(TWOSTR.isEqualOrWildChar('p', 'p'));
		Assert.assertTrue(TWOSTR.isEqualOrWildChar('p', '?'));
		Assert.assertTrue(TWOSTR.isEqualOrWildChar('?', 'p'));
		Assert.assertTrue(TWOSTR.isEqualOrWildChar('?', '?'));
		Assert.assertFalse(TWOSTR.isEqualOrWildChar('a', 't'));
	}
}
