package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ALPHABETTest {

	@Test
	public void test() {
		String knowWord = "act";
		String bookWord = "cat";
		assertEquals("Yes", ALPHABET.solution(knowWord, bookWord));
	}

	@Test
	public void test1() {
		String knowWord = "act";
		String bookWord = "dog";
		assertEquals("No", ALPHABET.solution(knowWord, bookWord));
	}

	@Test
	public void test2() {
		String knowWord = "cta";
		String bookWord = "catcat";
		assertEquals("Yes", ALPHABET.solution(knowWord, bookWord));
	}
	
	@Test
	public void test3() {
		String knowWord = "a";
		String bookWord = "a";
		assertEquals("Yes", ALPHABET.solution(knowWord, bookWord));
	}
	
	@Test
	public void test4() {
		String knowWord = "ab";
		String bookWord = "a";
		assertEquals("Yes", ALPHABET.solution(knowWord, bookWord));
	}

}
