package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeMagic {

	public LeMagic() {

	}

	private int[][] magicBoard;

	public int[][] initMagicBoard(String fileName) throws IOException {
		InputStream is = this.getClass().getResourceAsStream("/magicBoard.txt");
		BufferedReader fileInput = new BufferedReader(new InputStreamReader(is));
		String rowAndColumn = fileInput.readLine();
		StringTokenizer tokenizer = new StringTokenizer(rowAndColumn, " ");
		// row
		int row = Integer.parseInt((String) tokenizer.nextElement());
		// column
		int column = Integer.parseInt((String) tokenizer.nextElement());
		magicBoard = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int value = fileInput.read();
				// for new line character
				if (value == 10) {
					value = fileInput.read();
				}
				value = value - 48;
				magicBoard[i][j] = value;
			}
		}
		fileInput.close();
		return magicBoard;
	}

	public int[][] getMagicBoard() {
		return magicBoard;
	}

	public void setMagicBoard(int[][] magicBoard) {
		this.magicBoard = magicBoard;
	}

}
