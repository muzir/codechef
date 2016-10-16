package org.muzir.interview.codility;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.aaa(1));
	}

	private int aaa(int x) {
		try {
			return ++x;
		} catch (Exception e) {

		} finally {
			return ++x;
		}
	}

}
