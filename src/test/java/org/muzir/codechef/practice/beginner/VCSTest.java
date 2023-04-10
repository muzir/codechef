package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VCSTest {

    @Test
    public void shouldUnionCount() {
        int[] ignored = {1, 4, 6, 7};
        int[] tracked = {1, 2, 3, 4, 6, 7};
        assertEquals(6, VCS.getUnionCount(ignored, tracked));
    }

    @Test
    public void shouldTotalCount() {
        int[] ignored = {1, 4, 6, 7};
        int[] tracked = {1, 2, 3, 4, 6, 7};
        assertEquals(10, VCS.getTotalCount(ignored, tracked));
    }

    @Test
    public void shouldPrintIgnoredAndTracked() {
        int[] ignored = {1, 4, 6, 7};
        int[] tracked = {1, 2, 3, 4, 6, 7};
        assertEquals(4, VCS.countIgnoredAndTracked(ignored, tracked));
    }

    @Test
    public void shouldPrintUntrackedAndIgnored() {
        int sourceFileCount = 7;
        int[] ignored = {1, 4, 6, 7};
        int[] tracked = {1, 2, 3, 4, 6, 7};
        assertEquals(1, VCS.getUntrackedAndUnignored(sourceFileCount, ignored, tracked));
    }

    /****/

    @Test
    public void shouldUnionCount1() {
        int[] ignored = {1, 4};
        int[] tracked = {3, 4};
        assertEquals(3, VCS.getUnionCount(ignored, tracked));
    }

    @Test
    public void shouldTotalCount1() {
        int[] ignored = {1, 4};
        int[] tracked = {3, 4};
        assertEquals(4, VCS.getTotalCount(ignored, tracked));
    }

    @Test
    public void shouldPrintIgnoredAndTracked1() {
        int[] ignored = {1, 4};
        int[] tracked = {3, 4};
        assertEquals(1, VCS.countIgnoredAndTracked(ignored, tracked));
    }

    @Test
    public void shouldPrintUntrackedAndIgnored1() {
        int sourceFileCount = 4;
        int[] ignored = {1, 4};
        int[] tracked = {3, 4};
        assertEquals(1, VCS.getUntrackedAndUnignored(sourceFileCount, ignored, tracked));
    }

}
