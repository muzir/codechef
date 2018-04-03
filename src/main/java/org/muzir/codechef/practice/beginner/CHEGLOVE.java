package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class CHEGLOVE {
	private static boolean isCodechefModeOn = false;
	private static final String FRONT = "front";
	private static final String BACK = "back";
	private static final String BOTH = "both";
	private static final String NONE = "none";


	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			int[] chefFingers = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			int[] gloveLenghts = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			Matcher matcher = new Matcher(chefFingers, gloveLenghts);
			System.out.println(matcher.solution());
		}
		br.close();
	}


	static class Matcher {
		private boolean isFront = true;
		private boolean isBack = true;
		private int[] chefFingers;
		private int[] gloveLenghts;

		public Matcher(int[] chefFingers, int[] gloveLenghts) {
			this.chefFingers = chefFingers;
			this.gloveLenghts = gloveLenghts;
		}

		public String solution() {
			if (chefFingers.length != gloveLenghts.length) return NONE;
			int lenght = chefFingers.length;
			for (int i = 0; i < lenght; i++) {
				int chefFingerLenght = chefFingers[i];
				int gloveLenght = gloveLenghts[i];

				if (gloveLenght < chefFingerLenght) {
					isFront = false;
				}

				int backGloveLenght = gloveLenghts[lenght - 1 - i];
				if (chefFingerLenght > backGloveLenght) {
					isBack = false;
				}
				if (!isBack && !isFront) {
					return NONE;
				}
			}
			if (isFront && !isBack) {
				return FRONT;
			}
			if (isBack && !isFront) {
				return BACK;
			}
			return BOTH;
		}

	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/CHEGLOVE.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
