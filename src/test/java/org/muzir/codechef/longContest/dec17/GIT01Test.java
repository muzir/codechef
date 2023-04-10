package org.muzir.codechef.longContest.dec17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GIT01Test {
	@Test
	public void initialTestCase() {
		String[] arg = {"RRG",
				        "GGR"};
		assertEquals(8, GIT01.calculateMinCost(arg));
	}



	@Test
	public void initialTestCase_1() {
		String[] arg = {"RGRGR",
				        "GRGRG",
				        "RGRGR",
				        "GRGRG",
				        "RGRGR"};
		assertEquals(0, GIT01.calculateMinCost(arg));
	}

	@Test
	public void initialTestCase_2() {
		String[] arg = {"RRR",
				"GGG"};
		assertEquals(8, GIT01.calculateMinCost(arg));
	}

	@Test
	public void initialTestCase_3() {
		String[] arg = {"RGRGR",
				        "GRGRR"
				};
		assertEquals(5, GIT01.calculateMinCost(arg));
	}
	@Test
	public void initialTestCase_4() {
		String[] arg = {"RGRGR",
				        "GRGGG"
		};
		assertEquals(3, GIT01.calculateMinCost(arg));
	}
	@Test
	public void initialTestCase_5() {
		String[] arg = {"RGRGR",
				        "GGGGG"
		};
		assertEquals(6, GIT01.calculateMinCost(arg));
	}

	@Test
	public void initialTestCase_6() {
		String[] arg = {"RGRRGRGRGRG",
				        "GRGRGRGRGRG"
		};
		assertEquals(32, GIT01.calculateMinCost(arg));
	}
}
