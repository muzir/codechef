package org.muzir.codechef.longContest.feb18;

import java.io.*;
import java.util.Arrays;

public class CARPTUN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int tunnelCount = Integer.parseInt(br.readLine());
			String tollsTimes = br.readLine();
			String cds = br.readLine();
			int c = Integer.parseInt(cds.split(" ")[0]);
			System.out.println(calculateDelay(c, tunnelCount, tollsTimes));
		}
		br.close();
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/CARPTUN.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static String calculateDelay(int carsCount, int tunnelsCount, String tolls) {
		double[] tollsTimes = Arrays.stream(tolls.split(" "))
				.mapToDouble(Double::parseDouble)
				.toArray();

		double acc = tollsTimes[0];
		int untilLastTunelsCount = tunnelsCount - 1;
		for (int i = 0; i < untilLastTunelsCount; i++) {
			double diff = tollsTimes[i + 1] - acc;
			if (diff > 0.0000000) {
				acc = acc + diff;
			}
		}
		acc = acc * (carsCount - 1);
		return String.valueOf(acc);
	}
}
