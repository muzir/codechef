package org.muzir.codechef.cooks.cook89;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class MINSUBAR {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String line = br.readLine();
			int d = Integer.parseInt(line.split(" ")[1]);
			String array = br.readLine();
			System.out.println(calculateArrayMinSum(array, d));
		}
		br.close();
	}

	static int calculateArrayMinSum(String array, int d) {
		String[] sArray = array.split(" ");
		Deque<Integer> deque = new ArrayDeque<Integer>();
		int length = sArray.length;
		int counter = 0;
		int minCounter = 0;
		int acc = 0;
		for (int i = 0; i < length; i++) {
			int temp = Integer.parseInt(sArray[i]);
			if (temp == d) {
				return 1;
			}
			deque.add(temp);
			acc = acc + temp;
			counter++;
			if (acc >= d) {
				if (minCounter == 0) {
					minCounter = counter;
				}
				while (acc > d) {
					acc = acc - deque.peek();
					counter = counter - 1;
				}
				if (minCounter > counter) {
					minCounter = counter;
				}
			}
		}
		if (minCounter == 0) {
			return -1;
		}
		return minCounter;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/MINSUBAR.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
