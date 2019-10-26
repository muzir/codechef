package org.muzir.codechef.longContest.oct19b;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.RecursiveTask;

public class SAKTAN {
	static HashMap<Key, Integer> cache;
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		cache = new HashMap<>(testCaseCount);
		for (int i = 0; i < testCaseCount; i++) {
			int[] params = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			int rowNum = params[0];
			int colNum = params[1];
			int stepNum = params[2];

			String[] stepParams = new String[stepNum];
			for (int j = 0; j < stepNum; j++) {
				stepParams[j] = br.readLine();
			}
			System.out.println(solution(rowNum, colNum, stepParams));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/SAKTAN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static int solution(int rowCount, int colCount, String[] paramArray) {

		int oddCounter = 0;
		Key k = Key.createKey(rowCount, colCount, paramArray);
		if (cache.get(k) != null) {
			return cache.get(k);
		}

		int[] rows = new int[rowCount];
		int[] columns = new int[colCount];

		Arrays.stream(paramArray).forEach(s -> {
			String[] params = s.split(" ");
			int row = Integer.parseInt(params[0]) - 1;
			int col = Integer.parseInt(params[1]) - 1;

			int rowSum = rows[row] == 0 ? 1 : 0;
			rows[row] = rowSum;

			int colSum = columns[col] == 0 ? 1 : 0;
			columns[col] = colSum;
		});

		for (int i = 0; i < rowCount; i++) {
			int row = rows[i];
			for (int j = 0; j < colCount; j++) {
				int col = columns[j];
				int cellValue = row + col;
				if (cellValue == 1) {
					oddCounter = oddCounter + 1;
				}
			}
		}

		cache.put(k, oddCounter);
		return oddCounter;
	}

	public static int paralelSolution(int rowCount, int colCount, String[] paramArray) {

		int oddCounter = 0;
		Key k = Key.createKey(rowCount, colCount, paramArray);
		if (cache.get(k) != null) {
			return cache.get(k);
		}

		int[] rows = new int[rowCount];
		int[] columns = new int[colCount];

		Arrays.stream(paramArray)
				.forEach(s -> {
					String[] params = s.split(" ");
					int row = Integer.parseInt(params[0]) - 1;
					int col = Integer.parseInt(params[1]) - 1;

					int rowSum = rows[row] == 0 ? 1 : 0;
					rows[row] = rowSum;

					int colSum = columns[col] == 0 ? 1 : 0;
					columns[col] = colSum;
				});


		OddCalculator calculator = new OddCalculator(0, rows.length - 1, columns, rows);
		oddCounter = calculator.compute();


		cache.put(k, oddCounter);
		return oddCounter;
	}


	static class OddCalculator extends RecursiveTask<Integer> {
		private int startIndex;
		private int endIndex;
		private int[] columns;
		private int[] rows;

		public OddCalculator(int startIndex, int endIndex, int[] columns, int[] rows) {
			this.startIndex = startIndex;
			this.endIndex = endIndex;
			this.columns = columns;
			this.rows = rows;
		}

		@Override
		protected Integer compute() {

			int colCount = columns.length;

			if (startIndex == endIndex) {
				int oddCounter = 0;
				int row = rows[startIndex];
				for (int j = 0; j < colCount; j++) {
					int col = columns[j];
					int cellValue = row + col;
					if (cellValue == 1) {
						oddCounter = oddCounter + 1;
					}
				}
				return oddCounter;
			} else if (startIndex > endIndex) {
				return 0;
			} else {
				int mid = startIndex + endIndex / 2;
				OddCalculator left = new OddCalculator(startIndex, mid, columns, rows);
				OddCalculator right = new OddCalculator(mid + 1, endIndex, columns, rows);
				right.fork();
				return left.compute() + right.join();
			}
		}
	}

	static class Key {
		int n;
		int m;
		String[] paramArray;

		private Key(int n, int m, String[] paramArray) {
			this.n = n;
			this.m = m;
			this.paramArray = paramArray;
		}

		static Key createKey(int n, int m, String[] paramArray) {
			return new Key(n, m, paramArray);
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Key key = (Key) o;
			return n == key.n &&
					m == key.m &&
					Arrays.equals(paramArray, key.paramArray);
		}

		@Override
		public int hashCode() {
			int result = Objects.hash(n, m);
			result = 31 * result + Arrays.hashCode(paramArray);
			return result;
		}
	}
}
