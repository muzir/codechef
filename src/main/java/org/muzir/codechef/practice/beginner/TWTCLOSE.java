package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TWTCLOSE {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int[] params = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		solution(params[0], params[1], br);
		br.close();
	}

	static void solution(int n, int k, BufferedReader br) throws IOException {
		int[] tweets = new int[n];
		int openCounter = 0;
		for (int i = 0; i < k; i++) {
			String[] commands = br.readLine().split(" ");
			String command = commands[0];
			if (command.equals("CLOSEALL")) {
				tweets = new int[n];
				openCounter = 0;
			} else {
				int index = Integer.parseInt(commands[1]);
				int temp = tweets[index - 1];
				temp = (temp + 1) % 2;
				if (temp == 1) {
					openCounter = openCounter + 1;
				} else {
					openCounter = openCounter - 1;
				}
				tweets[index - 1] = temp;
			}
			System.out.println(openCounter);
		}
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/TWTCLOSE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
