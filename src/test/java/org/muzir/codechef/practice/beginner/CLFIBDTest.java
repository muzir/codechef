package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CLFIBDTest {
	@Test
	public void test1() {
		assertEquals(CLFIBD.solution("aaaabccc"), CLFIBD.DYNAMIC);
		assertEquals(CLFIBD.solution("aabbcc"), CLFIBD.NOT);
		assertEquals(CLFIBD.solution("ppppmmnnoooopp"), CLFIBD.DYNAMIC);
		assertEquals(CLFIBD.solution(""), CLFIBD.DYNAMIC);
		assertEquals(CLFIBD.solution("a"), CLFIBD.DYNAMIC);
		assertEquals(CLFIBD.solution("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxx"), CLFIBD.DYNAMIC);
		assertEquals(CLFIBD.solution("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxzxxxxxxxxxxxxxxc"), CLFIBD.NOT);
		assertEquals(CLFIBD.solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"), CLFIBD.DYNAMIC);
		assertEquals(CLFIBD.solution("ab"), CLFIBD.DYNAMIC);
		assertEquals(CLFIBD.solution("abbaabbaabbaaaaaaaaaaaa"), CLFIBD.DYNAMIC);
		assertEquals(CLFIBD.solution("abccddddddddddd"), CLFIBD.NOT);
	}

	@Test
	public void test2() {
		String a = generateString('a', 1);
		String b = generateString('b', 2);
		String c = generateString('c', 3);
		String d = generateString('d', 5);
		String e = generateString('e', 8);
		String f = generateString('f', 13);
		String g = generateString('g', 21);
		String h = generateString('h', 34);
		String i = generateString('i', 55);
		String j = generateString('j', 89);
		String k = generateString('k', 144);
		String l = generateString('l', 233);
		String m = generateString('m', 377);
		String n = generateString('n', 610);
		String o = generateString('o', 987);
		String p = generateString('p', 1597);
		String q = generateString('q', 2584);
		String r = generateString('r', 4181);
		String s = generateString('s', 6765);
		String t = generateString('t', 10946);
		String u = generateString('u', 17711);
		String v = generateString('v', 28657);
		String w = generateString('w', 46368);
		String x = generateString('x', 75025);
		String y = generateString('y', 121393);
		String z = generateString('z', 196418);
		String result = a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p + q + r + s + t + u + v + w + x + y + z;
		assertEquals(CLFIBD.solution(result), CLFIBD.DYNAMIC);
	}

	@Test
	public void test3() {
		String a = generateString('a', 5);
		String b = generateString('b', 4);
		String c = generateString('c', 9);
		String d = generateString('d', 13);
		String result = a + b + c + d;
		assertEquals(CLFIBD.solution(result), CLFIBD.DYNAMIC);
	}

	String generateString(char c, int count) {
		String s = "";
		for (int i = 0; i < count; i++) {
			s = s + c;
		}
		return s;
	}
}
