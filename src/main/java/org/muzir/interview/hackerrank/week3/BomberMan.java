package org.muzir.interview.hackerrank.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BomberMan {

    private static Map<Integer, List<String>> map = new HashMap<>();

    /*
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        List<String> initialState = List.copyOf(grid);
        map.put(0, initialState);
        map.put(1, fullBomb(grid));
        map.put(2, reverseInitialState(grid));
        return Collections.emptyList();
    }

    private static List<String> reverseInitialState(List<String> grid) {
        // apply bomb detonate algorithm
        return null;
    }

    private static List<String> fullBomb(List<String> grid) {
        int c = grid.get(0).length();
        List<String> fullBomb = new ArrayList<>();
        String bomb = "";
        for (int i = 0; i < c; i++) {
            bomb = bomb + "O";
        }
        for (int i = 0; i < grid.size(); i++) {
            fullBomb.add(bomb);
        }
        return fullBomb;
    }
}
