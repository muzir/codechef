package org.muzir.interview.hackerrank.week3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BomberManTest {
    @Test
    void test2x2() {
        List<String> grid2x2 = List.of("O.", "..");
        List<String> initialState = List.copyOf(grid2x2);
        List<String> expectedReverseGrid = List.of("..", ".O");
        List<String> expectedFullBomb = List.of("OO", "OO");

        assertEquals(initialState, BomberMan.bomberMan(5, grid2x2));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(4, grid2x2));
        assertEquals(expectedReverseGrid, BomberMan.bomberMan(3, grid2x2));
    }

    @Test
    void test3x3() {
        List<String> grid3x3 = new ArrayList<>();
        grid3x3.add("...");
        grid3x3.add("...");
        grid3x3.add(".OO");
        List<String> initialState = List.copyOf(grid3x3);

        List<String> reverseGrid = new ArrayList<>();
        reverseGrid.add("OOO");
        reverseGrid.add("O..");
        reverseGrid.add("...");
        List<String> expectedReverse = List.copyOf(reverseGrid);

        List<String> expectedFullBomb = new ArrayList<>();
        expectedFullBomb.add("OOO");
        expectedFullBomb.add("OOO");
        expectedFullBomb.add("OOO");

        assertEquals(initialState, BomberMan.bomberMan(1, grid3x3));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(2, grid3x3));
        assertEquals(expectedReverse, BomberMan.bomberMan(3, grid3x3));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(4, grid3x3));
        assertEquals(initialState, BomberMan.bomberMan(5, grid3x3));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(6, grid3x3));
        assertEquals(reverseGrid, BomberMan.bomberMan(7, grid3x3));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(8, grid3x3));
        assertEquals(initialState, BomberMan.bomberMan(9, grid3x3));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(10, grid3x3));
        assertEquals(reverseGrid, BomberMan.bomberMan(11, grid3x3));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(1000_000, grid3x3));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(1000_000_000, grid3x3));
    }

    @Test
    void test6x7() {
        List<String> grid6x7 = List.of(".......",
                "...O.O.",
                "....O..",
                "..O....",
                "OO...OO",
                "OO.O...");
        List<String> initialState = List.copyOf(grid6x7);
        List<String> expectedReverseGrid = List.of("..", ".O");
        List<String> expectedFullBomb = List.of("OO", "OO");

        assertEquals(initialState, BomberMan.bomberMan(5, grid6x7));
        assertEquals(expectedFullBomb, BomberMan.bomberMan(4, grid2x2));
        assertEquals(expectedReverseGrid, BomberMan.bomberMan(3, grid2x2));
    }
}