package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class KOL16J {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			int n=Integer.parseInt(readLine(dis));
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			System.out.println(solution(a,n));
		}
		dis.close();
	}

	static String solution(int[] a,int n) {
        int length=a.length;
        if(length!=n){return "no";}
        int b[]=Arrays.copyOf(a, length);
        Arrays.sort(a);
        if(Arrays.equals(a,b)){
            return "no";
        }
        if(!isArrayIncreasedByOne(a)){
            return "no";
        }
        return "yes";
	}

	

private static boolean isArrayIncreasedByOne(int[]a){
    int lenght=a.length;
    if(a[0]!=1){return false;}
    for(int i=0;i<lenght-1;i++){
        int x=a[i];
        int y=a[i+1];
        int diff=y-x;
        if(diff!=1){return false;}       
    }
    return true;
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
		InputStream in = new FileInputStream(path + "/src/main/inputs/KOL16J.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
