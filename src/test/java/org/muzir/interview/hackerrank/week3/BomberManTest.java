package org.muzir.interview.hackerrank.week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BomberManTest {
    @Test
    void test2x2() {
        List<String> grid2x2 = List.of("O.", "..");
        List<String> reverseGrid2x2 = List.of("..", ".O");
        List<String> fullBomb = List.of("OO", "OO");

        Assertions.assertEquals(grid2x2, BomberMan.bomberMan(5, grid2x2));
        Assertions.assertEquals(fullBomb, BomberMan.bomberMan(4, grid2x2));
        Assertions.assertEquals(reverseGrid2x2, BomberMan.bomberMan(3, grid2x2));
    }

    @Test
    void test3x3() {
        List<String> grid3x3 = List.of("...", "...", ".OO");
        BomberMan.bomberMan(3, grid3x3);
    }
}