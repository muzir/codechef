package org.muzir.interview.klarna;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DiskSpaceTest {

    @Test
    public void throwIllegalArgumentException_IfOccupiedSectorIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DiskSpace.isWritable(1, 1, null);
        });
    }

    @Test
    public void returnTrue_IfBlockSizeEqualToFileSizeAndOccupiedSectorIsEmpty() {
        assertTrue(DiskSpace.isWritable(1, 1, new HashSet<>()));
    }

    @Test
    public void returnFalse_IfBlockSizeEqualToFileSizeAndOccupiedSectorIsFull() {
        assertFalse(DiskSpace.isWritable(1, 1, new HashSet<>(Arrays.asList(1))));
    }

    @Test
    public void returnFalse_IfDontHaveEnoughSpaceInOccupiedSectors() {
        assertFalse(DiskSpace.isWritable(1, 1, new HashSet<>(Arrays.asList(1))));
        assertFalse(DiskSpace.isWritable(4, 4, new HashSet<>(Arrays.asList(4))));
        assertFalse(DiskSpace.isWritable(6, 4, new HashSet<>(Arrays.asList(1, 3, 5))));
        assertFalse(DiskSpace.isWritable(6, 2, new HashSet<>(Arrays.asList(1, 3, 5))));
        assertFalse(DiskSpace.isWritable(4, 3, new HashSet<>(Arrays.asList(3))));
        assertFalse(DiskSpace.isWritable(10, 7, new HashSet<>(Arrays.asList(2, 9))));
        assertFalse(DiskSpace.isWritable(6, 6, new HashSet<>(Arrays.asList(6))));
    }

    @Test
    public void returnTrue_IfEnoughSpaceInOccupiedSectors() {
        assertTrue(DiskSpace.isWritable(4, 2, new HashSet<>(Arrays.asList(1, 4))));
        assertTrue(DiskSpace.isWritable(4, 2, new HashSet<>(Arrays.asList(4))));
        assertTrue(DiskSpace.isWritable(4, 3, new HashSet<>(Arrays.asList(4))));
        assertTrue(DiskSpace.isWritable(6, 6, new HashSet<>(Arrays.asList())));
        assertTrue(DiskSpace.isWritable(6, 5, new HashSet<>(Arrays.asList())));
        assertTrue(DiskSpace.isWritable(6, 5, new HashSet<>(Arrays.asList(6))));
        assertTrue(DiskSpace.isWritable(6, 1, new HashSet<>(Arrays.asList(1, 3, 5))));
        assertTrue(DiskSpace.isWritable(10, 6, new HashSet<>(Arrays.asList(2, 9))));
        assertTrue(DiskSpace.isWritable(10, 5, new HashSet<>(Arrays.asList(5))));
        assertTrue(DiskSpace.isWritable(6, 5, new HashSet<>(Arrays.asList(6))));
        assertTrue(DiskSpace.isWritable(6, 2, new HashSet<>(Arrays.asList(4, 2, 1, 3))));
    }

    @Test
    public void stressTestReturnTrue_IfEnoughSpaceInOccupiedSectors() {
        int blockSize = 2000000;
        int fileSize = 2;
        List l = new ArrayList<>();
        for (int i = 1; i < blockSize; i++) {
            if (i % 2 == 0) {
                l.add(i);
            }
        }
        assertTrue(DiskSpace.isWritable(blockSize, fileSize, new HashSet<>(l)));
    }

    @Test
    public void stressTestReturnFalse_IfDontHaveEnoughSpaceInOccupiedSectors() {
        int blockSize = 2000000;
        int fileSize = 2;
        List l = new ArrayList<>();
        for (int i = 1; i <= blockSize; i++) {
            if (i % 2 == 0) {
                l.add(i);
            }
        }
        assertFalse(DiskSpace.isWritable(blockSize, fileSize, new HashSet<>(l)));
    }
}
