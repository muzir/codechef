package org.muzir.codechef.practice.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FLOW015Test {

	int startingYear = 2001;

	@Test
	public void shouldSolutionPass1900() {
		assertEquals("monday", FLOW015.solution(1900));
	}

	@Test
	public void shouldSolutionPass1901() {
		assertEquals("tuesday", FLOW015.solution(1901));
	}

	@Test
	public void shouldSolutionPass2001() {
		assertEquals("monday", FLOW015.solution(2001));
	}

	@Test
	public void shouldSolutionPass1994() {
		assertEquals("saturday", FLOW015.solution(1994));
	}

	@Test
	public void shouldSolutionPass1995() {
		assertEquals("sunday", FLOW015.solution(1995));
	}

	@Test
	public void shouldSolutionPass1996() {
		assertEquals("monday", FLOW015.solution(1996));
	}

	@Test
	public void shouldSolutionPass1997() {
		assertEquals("wednesday", FLOW015.solution(1997));
	}

	@Test
	public void shouldSolutionPass1991() {
		assertEquals("tuesday", FLOW015.solution(1991));
	}

	@Test
	public void shouldSolutionPass2014() {
		assertEquals("wednesday", FLOW015.solution(2014));
	}

	@Test
	public void shouldSolutionPass2000() {
		assertEquals("saturday", FLOW015.solution(2000));
	}

	@Test
	public void shouldSolutionPass2500() {
		assertEquals("friday", FLOW015.solution(2500));
	}
	
	@Test
	public void shouldSolutionPass2250() {
		assertEquals("tuesday", FLOW015.solution(2250));
	}
	
	@Test
	public void shouldSolutionPass2125() {
		assertEquals("monday", FLOW015.solution(2125));
	}
	
	@Test
	public void shouldSolutionPass2063() {
		assertEquals("monday", FLOW015.solution(2063));
	}
	
	@Test
	public void shouldSolutionPass2099() {
		assertEquals("thursday", FLOW015.solution(2099));
	}
	
	@Test
	public void shouldSolutionPass2100() {
		assertEquals("friday", FLOW015.solution(2100));
	}
	
	@Test
	public void shouldSolutionPass2101() {
		assertEquals("saturday", FLOW015.solution(2101));
	}
	
	@Test
	public void shouldSolutionPass2103() {
		assertEquals("monday", FLOW015.solution(2103));
	}
	
	@Test
	public void shouldSolutionPass2106() {
		assertEquals("friday", FLOW015.solution(2106));
	}
	
	@Test
	public void shouldSolutionPass2112() {
		assertEquals("friday", FLOW015.solution(2112));
	}

	@Test
	public void shouldSolutionPass() {
		assertEquals("friday", FLOW015.solution(2016));
		assertEquals("sunday", FLOW015.solution(2017));
		assertEquals("monday", FLOW015.solution(2018));
		assertEquals("tuesday", FLOW015.solution(2019));
		assertEquals("wednesday", FLOW015.solution(2020));
		assertEquals("friday", FLOW015.solution(2021));
	}

	@Test
	public void shouldCalculateExtraDays() {
		assertEquals(25, FLOW015.calculateLeapYearCount(1901, startingYear));
		assertEquals(2, FLOW015.calculateLeapYearCount(1994, startingYear));
		assertEquals(1, FLOW015.calculateLeapYearCount(2000, startingYear));
		assertEquals(1, FLOW015.calculateLeapYearCount(1998, startingYear));
		assertEquals(2, FLOW015.calculateLeapYearCount(1996, startingYear));
		assertEquals(5, FLOW015.calculateLeapYearCount(2021, startingYear));
		assertEquals(4, FLOW015.calculateLeapYearCount(2020, startingYear));
		assertEquals(121, FLOW015.calculateLeapYearCount(2500, startingYear));
	}

}
