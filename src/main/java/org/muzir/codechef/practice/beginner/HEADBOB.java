package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HEADBOB {

	public static void main(String[] args) throws IOException {
		//String path = System.getProperty("user.dir");
		//InputStream in = new FileInputStream(path + "/HEADBOB.txt");
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(sr);
		int lineCount = Integer.parseInt(reader.readLine());
		for (int i = 0; i < lineCount; i++) {
			Integer.parseInt(reader.readLine());
			String signs = reader.readLine();
			boolean isIndian = signs.contains("I");
			boolean isForeigner = signs.contains("Y");
			if (isIndian) {
				System.out.println("INDIAN");
			} else if (isForeigner) {
				System.out.println("NOT INDIAN");
			} else {
				System.out.println("NOT SURE");
			}
		}
		reader.close();
	}
}
