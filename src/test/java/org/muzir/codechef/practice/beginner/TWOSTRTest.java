package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TWOSTRTest {
    private static String YES = "Yes";
    private static String NO = "No";

    @Test
    public void testIsMatch() {
        assertEquals(YES, TWOSTR.isMatch("s?or?", "sco??"));
        assertEquals(YES, TWOSTR.isMatch("s????????", "sormane??"));
        assertEquals(YES, TWOSTR.isMatch("????", "????"));
        assertEquals(YES, TWOSTR.isMatch("eşit", "eşit"));
        assertEquals(YES, TWOSTR.isMatch("e?i?", "?ş?t"));
        assertEquals(NO, TWOSTR.isMatch("stor?", "sco??"));
        assertEquals(NO, TWOSTR.isMatch("stor?", "sco???"));
        assertEquals(NO, TWOSTR.isMatch("asd", "dasdas"));
        assertEquals(NO, TWOSTR.isMatch("S?or?", "sco??"));
        assertEquals(YES, TWOSTR.isMatch("s?or?", "sco??"));
        assertEquals(NO, TWOSTR.isMatch("s?or?", "Sco??"));
        assertEquals(YES, TWOSTR.isMatch("s", "s"));
        assertEquals(YES, TWOSTR.isMatch("ssssssssss", "ssssssssss"));
        assertEquals(YES, TWOSTR.isMatch("ssssssss??", "ssssssss??"));
    }

    @Test
    public void testIsEqualOrWildChar() {
        assertTrue(TWOSTR.isEqualOrWildChar('p', 'p'));
        assertTrue(TWOSTR.isEqualOrWildChar('p', '?'));
        assertTrue(TWOSTR.isEqualOrWildChar('?', 'p'));
        assertTrue(TWOSTR.isEqualOrWildChar('?', '?'));
        assertFalse(TWOSTR.isEqualOrWildChar('a', 't'));
    }
}
