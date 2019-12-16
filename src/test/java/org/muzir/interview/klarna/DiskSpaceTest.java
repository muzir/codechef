package org.muzir.interview.klarna;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DiskSpaceTest {

	@Test
	public void test1() {
		assertTrue(DiskSpace.isWritable(1, 1, new HashSet<>()));
	}

	@Test
	public void test2() {
		assertFalse(DiskSpace.isWritable(1, 1, new HashSet<>(Arrays.asList(1))));
	}

	@Test
	public void test3() {
		assertTrue(DiskSpace.isWritable(4, 2, new HashSet<>(Arrays.asList(1, 4))));
	}

	@Test
	public void test4() {
		int blockSize = 2000000;
		int fileSize = 2;
		List l = new ArrayList<>();
		for (int i = 0; i < blockSize; i++) {
			if (i % 2 == 0) {
				l.add(i);
			}
		}
		assertFalse(DiskSpace.isWritable(blockSize, fileSize, new HashSet<>(l)));
	}
}
