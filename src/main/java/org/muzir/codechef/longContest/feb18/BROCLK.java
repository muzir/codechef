package org.muzir.codechef.longContest.feb18;

import java.io.*;
import java.util.Arrays;

public class BROCLK {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			String ldt = br.readLine();
			int[] arryaLdt = Arrays.stream(ldt.split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			int l = arryaLdt[0];
			int d = arryaLdt[1];
			int t = arryaLdt[2];
			System.out.println(calculateBrokenClockValue(l, d, t));
		}
		br.close();
	}

	static int calculateBrokenClockValue(int l, int d, int t) {
		double angle = calculateDegrees(l, d, t);
		if (0 < angle && angle <= 90) {
			double angleValue = (l * Math.cos(Math.toRadians(angle))) % 1000000007;
			return (int) angleValue;
		}
		if (90 < angle && angle <= 180) {
			double angleValue = (l * Math.cos(Math.toRadians((180.0 - angle)))) % 1000000007;
			angleValue = angleValue * (-1);
			return (int) (1000000007 + angleValue);
		}
		if (180 < angle && angle <= 270) {
			double angleValue = (l * Math.cos(Math.toRadians((270.0 - angle)))) % 1000000007;
			angleValue = angleValue * (-1);
			return (int) (1000000007 + angleValue);
		}
		if (270 < angle && angle <= 360) {
			double angleValue = (l * Math.cos(Math.toRadians((360 - angle)))) % 1000000007;
			return (int) angleValue;
		}
		return 0;
	}


	static double calculateDegrees(int l, int d, int t) {
		return (t * Math.round(Math.toDegrees((Math.acos((double) d / l))))) % 360;
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/BROCLK.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
