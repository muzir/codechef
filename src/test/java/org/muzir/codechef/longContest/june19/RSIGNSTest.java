package org.muzir.codechef.longContest.june19;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

import static org.muzir.codechef.longContest.june19.RSIGNS.MODULO_CONSTANT;

public class RSIGNSTest {

	@Test
	public void test3() {
		Assert.assertEquals(10l, RSIGNS.computeViaFormula(1));
		Assert.assertEquals(20l, RSIGNS.computeViaFormula(2));
		Assert.assertEquals(40l, RSIGNS.computeViaFormula(3));
		Assert.assertEquals(80l, RSIGNS.computeViaFormula(4));
		Assert.assertEquals(160l, RSIGNS.computeViaFormula(5));
		Assert.assertEquals(320l, RSIGNS.computeViaFormula(6));
		Assert.assertEquals(640l, RSIGNS.computeViaFormula(7));
		Assert.assertEquals(1280l, RSIGNS.computeViaFormula(8));
		Assert.assertEquals(2560l, RSIGNS.computeViaFormula(9));
		Assert.assertEquals(5120l, RSIGNS.computeViaFormula(10));
	}

	@Test
	public void test2() {
		//https://stackoverflow.com/a/4102123/1577363
		int k = 1_000_000_000;
		/*BigDecimal param = BigDecimal.valueOf(2);
		BigDecimal result = param.pow(k - 1).multiply(BigDecimal.TEN);
		System.out.println(result.toString());*/

		//BigInteger bi = new BigInteger("1").shiftLeft(k - 1).mod(BigInteger.valueOf(MODULO_CONSTANT));
		//BigInteger b2 = new BigInteger("1").shiftLeft(k - 1);
		//b2.mod(BigInteger.valueOf(MODULO_CONSTANT));
		//BigInteger bi1 = new BigInteger("2").modPow(BigInteger.valueOf(k - 1), BigInteger.valueOf(MODULO_CONSTANT)).multiply(BigInteger.TEN).mod(BigInteger.valueOf(MODULO_CONSTANT));
		BigInteger bi2 = new BigInteger("2").pow(k - 1).multiply(BigInteger.TEN).mod(BigInteger.valueOf(MODULO_CONSTANT));
		System.out.println(bi2);
		//System.out.println(bi);
	}

	@Test
	public void test4() {
		Assert.assertEquals(703125005, RSIGNS.computeViaFormula(1_000_000_000));
	}

	@Test
	public void test5() {
		Assert.assertEquals(881856397, RSIGNS.computeViaFormula(100));
		Assert.assertEquals(848700849, RSIGNS.computeViaFormula(150));
		Assert.assertEquals(442116029, RSIGNS.computeViaFormula(1000));
		Assert.assertEquals(175210288, RSIGNS.computeViaFormula(1000_000));
		Assert.assertEquals(703125005, RSIGNS.computeViaFormula(1000_000_000));
	}
}
