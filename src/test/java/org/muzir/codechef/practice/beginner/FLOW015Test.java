package org.muzir.codechef.practice.beginner;

import org.junit.Assert;
import org.junit.Test;

public class FLOW015Test {

	int startingYear = 2001;

	@Test
	public void shouldSolutionPass1900() {
		Assert.assertEquals("monday", FLOW015.solution(1900));
	}

	@Test
	public void shouldSolutionPass1901() {
		Assert.assertEquals("tuesday", FLOW015.solution(1901));
	}

	@Test
	public void shouldSolutionPass2001() {
		Assert.assertEquals("monday", FLOW015.solution(2001));
	}

	@Test
	public void shouldSolutionPass1994() {
		Assert.assertEquals("saturday", FLOW015.solution(1994));
	}

	@Test
	public void shouldSolutionPass1995() {
		Assert.assertEquals("sunday", FLOW015.solution(1995));
	}

	@Test
	public void shouldSolutionPass1996() {
		Assert.assertEquals("monday", FLOW015.solution(1996));
	}

	@Test
	public void shouldSolutionPass1997() {
		Assert.assertEquals("wednesday", FLOW015.solution(1997));
	}

	@Test
	public void shouldSolutionPass1991() {
		Assert.assertEquals("tuesday", FLOW015.solution(1991));
	}

	@Test
	public void shouldSolutionPass2014() {
		Assert.assertEquals("wednesday", FLOW015.solution(2014));
	}

	@Test
	public void shouldSolutionPass2000() {
		Assert.assertEquals("saturday", FLOW015.solution(2000));
	}

	@Test
	public void shouldSolutionPass2500() {
		Assert.assertEquals("friday", FLOW015.solution(2500));
	}
	
	@Test
	public void shouldSolutionPass2250() {
		Assert.assertEquals("tuesday", FLOW015.solution(2250));
	}
	
	@Test
	public void shouldSolutionPass2125() {
		Assert.assertEquals("monday", FLOW015.solution(2125));
	}
	
	@Test
	public void shouldSolutionPass2063() {
		Assert.assertEquals("monday", FLOW015.solution(2063));
	}
	
	@Test
	public void shouldSolutionPass2099() {
		Assert.assertEquals("thursday", FLOW015.solution(2099));
	}
	
	@Test
	public void shouldSolutionPass2100() {
		Assert.assertEquals("friday", FLOW015.solution(2100));
	}
	
	@Test
	public void shouldSolutionPass2101() {
		Assert.assertEquals("saturday", FLOW015.solution(2101));
	}
	
	@Test
	public void shouldSolutionPass2103() {
		Assert.assertEquals("monday", FLOW015.solution(2103));
	}
	
	@Test
	public void shouldSolutionPass2106() {
		Assert.assertEquals("friday", FLOW015.solution(2106));
	}
	
	@Test
	public void shouldSolutionPass2112() {
		Assert.assertEquals("friday", FLOW015.solution(2112));
	}

	@Test
	public void shouldSolutionPass() {
		Assert.assertEquals("friday", FLOW015.solution(2016));
		Assert.assertEquals("sunday", FLOW015.solution(2017));
		Assert.assertEquals("monday", FLOW015.solution(2018));
		Assert.assertEquals("tuesday", FLOW015.solution(2019));
		Assert.assertEquals("wednesday", FLOW015.solution(2020));
		Assert.assertEquals("friday", FLOW015.solution(2021));
	}

	@Test
	public void shouldCalculateExtraDays() {
		Assert.assertEquals(25, FLOW015.calculateLeapYearCount(1901, startingYear));
		Assert.assertEquals(2, FLOW015.calculateLeapYearCount(1994, startingYear));
		Assert.assertEquals(1, FLOW015.calculateLeapYearCount(2000, startingYear));
		Assert.assertEquals(1, FLOW015.calculateLeapYearCount(1998, startingYear));
		Assert.assertEquals(2, FLOW015.calculateLeapYearCount(1996, startingYear));
		Assert.assertEquals(5, FLOW015.calculateLeapYearCount(2021, startingYear));
		Assert.assertEquals(4, FLOW015.calculateLeapYearCount(2020, startingYear));
		Assert.assertEquals(121, FLOW015.calculateLeapYearCount(2500, startingYear));
	}

}
