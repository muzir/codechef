package org.muzir.codechef.longContest.aprill18;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class WGHTNUMTest {


	@Test
	public void test() {
		BigInteger modulo = new BigInteger("1000000007");
		BigInteger exponent = new BigInteger("998");
		BigInteger bg= BigInteger.TEN;
		System.out.println("Modulo:" + bg.modPow(exponent,modulo));
	}

}
