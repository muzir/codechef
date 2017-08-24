package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SEBIHWY {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			int s=a[0];
			int sg=a[1];
			int fg=a[2];
			int d=a[3];
			int t=a[4];
			solution(s,sg,fg,d,t);
		}
		dis.close();
	}

	static void solution(int s,int sg,int fg,int d,int t) {
		double otherCarSpeed=findOtherCarSpeed(s,d,t);
		double sebiDiff=Math.abs(otherCarSpeed-sg);
		double fatherDiff=Math.abs(otherCarSpeed-fg);
		if(sebiDiff==fatherDiff){
			System.out.println("DRAW");
		}else if (sebiDiff < fatherDiff){
			System.out.println("SEBI");
		}else{
			System.out.println("FATHER");
		}
		
	}

	static double findOtherCarSpeed(int s, int d, int t){
		double otherCarSpeed= (double)s + ((double)180 * (double)d)/(double)t;
		System.out.println("otherCarSpeed:"+otherCarSpeed);
		return otherCarSpeed;
	}

	static int[] getArrayOfString(String input) {
		String[] arrayStr = input.split(" ");
		int lenght = arrayStr.length;
		int[] returnArray = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			returnArray[i] = Integer.parseInt(arrayStr[i]);
		}
		return returnArray;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/SEBIHWY.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
