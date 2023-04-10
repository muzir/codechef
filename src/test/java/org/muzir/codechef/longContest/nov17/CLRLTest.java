package org.muzir.codechef.longContest.nov17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CLRLTest {

	@Test
	public void test_sequenceIsPossible_NO() {
		assertEquals("NO", CLRL.sequenceIsPossible("600 300 100 350 200", 5, 200));
		assertEquals("NO", CLRL.sequenceIsPossible("20 10 30", 3, 30));
		assertEquals("NO", CLRL.sequenceIsPossible("1000 10 2000", 3, 2000));
		assertEquals("NO", CLRL.sequenceIsPossible("3000 4000 2000", 3, 2000));
		assertEquals("NO", CLRL.sequenceIsPossible("3000 4000 1000", 3, 2000));
		assertEquals("NO", CLRL.sequenceIsPossible("1000", 1, 2));
		assertEquals("NO", CLRL.sequenceIsPossible("5123 3300 783 1111 950 900 895 894 889 888 893 892 891 890", 14, 890));
	}

	@Test
	public void test_sequenceIsPossible_YES() {
		assertEquals("YES", CLRL.sequenceIsPossible("5123 3300 783 1111 950 900 895 894 889 893 892 891 890", 13, 890));
		assertEquals("YES", CLRL.sequenceIsPossible("200", 1, 200));
		assertEquals("YES", CLRL.sequenceIsPossible("1 200", 2, 200));
		assertEquals("YES", CLRL.sequenceIsPossible("1000 200", 2, 200));
		assertEquals("YES", CLRL.sequenceIsPossible("1000 1 200", 3, 200));
		assertEquals("YES", CLRL.sequenceIsPossible("10 20 30", 3, 30));
	}


	@Test
	public void test_Corner_Cases() {
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		for (int i = 1; i < 500_001; i++) {
			counter++;
			sb.append(i).append(" ");
		}

		for (int i = 1_000_001; i > 500_001; i--) {
			counter++;
			sb.append(i).append(" ");
		}
		sb.append(500_001);
		System.out.println(sb.toString());
		System.out.println("counter:" + counter);
		long start = System.currentTimeMillis();
		assertEquals("YES", CLRL.sequenceIsPossible(sb.toString(), 1_000_001, 500_001));
		long end = System.currentTimeMillis();
		System.out.println("It takes " + (end - start) + " miliseconds");
	}
}
