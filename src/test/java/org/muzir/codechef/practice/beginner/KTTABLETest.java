package org.muzir.codechef.practice.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KTTABLETest {

	@Test
	public void test() {
		String strA = "1 10 15";
		String strB = "1 10 3";
		int[] a = KTTABLE.getArrayOfString(strA);
		int[] b = KTTABLE.getArrayOfString(strB);
		assertEquals(2, KTTABLE.findMaxSceduleTime(a, b));
	}

	@Test
	public void test2() {
		String strA = "10 20 30";
		String strB = "15 5 20";
		int[] a = KTTABLE.getArrayOfString(strA);
		int[] b = KTTABLE.getArrayOfString(strB);
		assertEquals(1, KTTABLE.findMaxSceduleTime(a, b));
	}

}
