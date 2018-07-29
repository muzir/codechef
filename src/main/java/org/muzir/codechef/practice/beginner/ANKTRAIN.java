package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ANKTRAIN {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String line = readLine(dis);
			int param=Integer.parseInt(line);
			System.out.println(solution(param));
		}
		dis.close();
	}

	static String solution(int a) {
		int remainder=a%8;
		switch(remainder){
			case 0: return (a-1)+"SL";
			case 1: return (a+3)+"LB";
			case 2: return (a+3)+"MB";
			case 3: return (a+3)+"UB";
			case 4: return (a-3)+"LB";
			case 5: return (a-3)+"MB";
			case 6: return (a-3)+"UB";
			case 7:	return (a+1)+"SU";	
		}
		return "-1";
	}


	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/ANKTRAIN.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
