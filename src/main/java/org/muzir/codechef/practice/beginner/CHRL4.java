package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CHRL4 {
	private static boolean isCodechefModeOn = false;
	private static final int M=1_000_000_007;
	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String[] nk = readLine(dis).split(" ");
		int k=Integer.parseInt(nk[1]);
		String line = readLine(dis);
		int[] a = getArrayOfString(line);
		System.out.println(solution(a,k));
		dis.close();
	}

	static int solution(int[] a,int k) {
		int lenght = a.length;
		int i=lenght-1;
		int minimalProduct=a[i];
		while(0<i){
			i=findMinIndex(i,i-1,a,k);
			minimalProduct=(minimalProduct*a[i])%M;
			System.out.println("i:"+i+",minimalProduct: "+minimalProduct);
		}
		return minimalProduct;	
	}

	static int findMinIndex(int sourceIndex,int destIndex,int[] a,int k){
		if(destIndex==-1){return 0;}
		int source=a[sourceIndex];
		int dest=a[destIndex];
		int diff=source-dest;
		if(1<=diff&&diff<=k){
			return findMinIndex(sourceIndex,destIndex-1,a,k);		
		}	
		return destIndex+1;
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
		InputStream in = new FileInputStream(path + "/CHRL4.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
