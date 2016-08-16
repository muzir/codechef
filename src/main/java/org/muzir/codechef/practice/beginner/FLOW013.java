package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW013 {

	public static void main(String[] args) throws IOException {
		//FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/FLOW013.txt");
		InputStreamReader reader = new InputStreamReader(System.in);
		//InputStreamReader reader = new InputStreamReader(fs);
		BufferedReader br = new BufferedReader(reader);
		int lineCount = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < lineCount; i++) {
			String line = br.readLine();
			String[] angles = line.split(" ");
			System.out.println(isAnglesValid(Integer.parseInt(angles[0]), Integer.parseInt(angles[1]),
					Integer.parseInt(angles[2])));
		}
		br.close();
	}

	static String isAnglesValid(int parseInt, int parseInt2, int parseInt3) {
		if (parseInt <= 0 || parseInt2 <= 0 || parseInt3 <= 0) {
			return "NO";
		}
		int acc = parseInt + parseInt2 + parseInt3;
		if (acc == 180) {
			return "YES";
		}
		return "NO";
	}

}
