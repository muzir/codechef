package org.muzir.codechef.practice.beginner;

import java.io.*;

public class ELEVSTRS {

	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String[] nv1v2 = br.readLine().split(" ");
			int n = Integer.parseInt(nv1v2[0]);
			int stairsSpeed = Integer.parseInt(nv1v2[1]);
			int elevatorSpeed = Integer.parseInt(nv1v2[2]);
			System.out.println(selectRoute(n, stairsSpeed, elevatorSpeed));
		}
		br.close();
	}

	static String selectRoute(int n, int stairsSpeed, int elevatorSpeed) {
		float ts = (float) (n * Math.sqrt(2)) / stairsSpeed;
		float te = (float) (2 * n) / elevatorSpeed;
		if (ts > te) {
			return "Elevator";
		}
		return "Stairs";
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ELEVSTRS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
