package org.muzir.codechef.practice.beginner;

import java.io.*;

public class ZUBTRCNT {
	private static boolean isCodechefModeOn = false;

		public static void main(String[] args) throws IOException {
			BufferedReader br = createInputStream();
			int testCaseCount = Integer.parseInt(br.readLine());
			for (int i = 0; i < testCaseCount; i++) {
				System.out.println();
			}
			br.close();
		}

		private static BufferedReader createInputStream() throws FileNotFoundException {
			InputStreamReader isr = null;
			if (isCodechefModeOn) {
				isr = new InputStreamReader(System.in);
			} else {
				String path = System.getProperty("user.dir");
				String filePath = path + "/src/main/inputs/ZUBTRCNT.txt";
				FileInputStream fis = new FileInputStream(filePath);
				isr = new InputStreamReader(fis);
			}
			BufferedReader br = new BufferedReader(isr);
			return br;
		}
}
