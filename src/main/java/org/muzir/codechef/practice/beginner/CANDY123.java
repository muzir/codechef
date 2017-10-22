package org.muzir.codechef.practice.beginner;

import java.io.*;

public class CANDY123 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String input = readLine(dis);
			String[] inputs = input.split(" ");
			int x = Integer.valueOf(inputs[0]);
			int y = Integer.valueOf(inputs[1]);
			System.out.println(getWinner(x, y));
		}
	}


	public static String getWinner(int x, int y) {
		Candy candy = new Candy(x, y);
		return candy.race();
	}


	static class Candy {
		private int a;
		private int b;
		private int limakCounter;
		private int bobCounter;
		private int candyCounter = 1;

		public Candy(int limakCandy, int bobCandy) {
			a = limakCandy;
			b = bobCandy;
		}

		private boolean isLimakAllowedToEat(int totalCandy) {
			if (a >= totalCandy) {
				return true;
			}
			return false;
		}

		private boolean isBobAllowedToEat(int totalCandy) {
			if (b >= totalCandy) {
				return true;
			}
			return false;
		}

		public String race() {
			while (true) {
				if (eatLimak()) {
					return "Bob";
				}
				if (eatBob()) {
					return "Limak";
				}
			}
		}

		private boolean eatLimak() {
			int totalCandy = limakCounter + candyCounter;
			if (isLimakAllowedToEat(totalCandy)) {
				limakCounter = totalCandy;
				candyCounter++;
				return false;
			}
			return true;
		}

		private boolean eatBob() {
			int totalCandy = bobCounter + candyCounter;
			if (isBobAllowedToEat(totalCandy)) {
				bobCounter = totalCandy;
				candyCounter++;
				return false;
			}
			return true;
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/CANDY123.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
