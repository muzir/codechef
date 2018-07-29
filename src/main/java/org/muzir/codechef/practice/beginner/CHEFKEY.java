package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class CHEFKEY {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String line = readLine(dis);
			int[] a = getArrayOfString(line);
			System.out.println(solution(a));
		}
		dis.close();
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

	static int solution(int[] a) {
		int n=a[0];
		int m=a[1];
		int c=a[2];
		int counter=0;
		int tempN,tempM=0;
		BigInteger product=BigInteger.valueOf(n).multiply(BigInteger.valueOf(m));
		BigInteger bigC=BigInteger.valueOf(c);
		if(product.compareTo(bigC)==-1){return 0;}
		int maxLenght=Math.max(n,m);
		for(int i=1;i<=maxLenght;i++){
			if(c%i==0){
				tempM=c/i;
				tempN=i;									
				if(tempM<=m && tempN <= n){
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
		InputStream in = new FileInputStream(path + "/src/main/inputs/CHEFKEY.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}
}
