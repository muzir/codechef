package org.muzir.interview.hackerrank.week3;

import java.util.ArrayList;
import java.util.List;

public class BomberMan {

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
        if (n % 2 == 0) {
            return fullBomb(grid);
        } else if (n % 4 == 1) {
            return grid;
        }
        return reverseInitialState(grid);
    }

    private static List<String> reverseInitialState(List<String> grid) {
        // apply bomb detonate algorithm
        int column = grid.get(0).length();
        int size = grid.size();
        char[][] matrix = new char[size][column];

        for (int i = 0; i < size; i++) {
            matrix[i] = grid.get(i).toCharArray();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < column; j++) {
                char c = matrix[i][j];
                if (c == 'O') {
                    matrix[i][j] = '*';
                    setCharNeighbour(matrix, i - 1, j, '*');
                    setCharNeighbour(matrix, i + 1, j, '*');
                    setCharNeighbour(matrix, i, j - 1, '*');
                    setCharNeighbour(matrix, i, j + 1, '*');
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < column; j++) {
                char c = matrix[i][j];
                if (c == '*') {
                    matrix[i][j] = '.';
                } else {
                    matrix[i][j] = 'O';
                }
            }
        }
        List<String> newGrid = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            newGrid.add(new String(matrix[i]));
        }
        return newGrid;
    }

    private static void setCharNeighbour(char[][] grid, int i, int j, char newChar) {
        int row = grid.length;
        int column = grid[0].length;
        if ((0 <= i && i < row) && (0 <= j && j < column)) {
            if (grid[i][j] != 'O') {
                grid[i][j] = newChar;
            }
        }
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
