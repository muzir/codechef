package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CHEFSTUD {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String line = readLine(dis);
			System.out.println(solution(line));
		}
		dis.close();
	}

	static int solution(String s) {
		int lenght = s.length();
		int counter=0;
		char[] chars=s.toCharArray();
		for(int i=0;i<lenght-1;i++){
			char c =chars[i];
			if(c=='<'){
				char cNext=chars[i+1];
				if(cNext=='>'){
					counter++;
				}//end of inner if			
			}//end of outer if
		}//end of for loop
		return counter;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/CHEFSTUD.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
