package org.muzir.codechef.practice.beginner;

import java.lang.*;
import java.io.*;

/**
 * Created by erhun.baycelik on 25/02/2017.
 */
class KOL16B
{

    private static boolean isCodechefModeOn = false;

    public static void main (String[] args) throws java.lang.Exception
    {
        InputStream in = createInputStream();
        BufferedInputStream reader = new BufferedInputStream(in);
        DataInputStream dis = new DataInputStream(reader);
        int testCaseCount = Integer.parseInt(readLine(dis));
        for (int i = 0; i < testCaseCount; i++) {
            int arrayCapacity=Integer.parseInt(readLine(dis));
            int[] a = getArrayOfString(arrayCapacity,dis);
            StringBuilder caseStm=new StringBuilder("Case ");
            caseStm.append(i+1).append(":");
            System.out.println(caseStm.toString());
            solution(a);
        }
        dis.close();
    }

    static void solution(int[] paramArray) {
        int length = paramArray.length;
        int[] a = new int[length];
        int[] b = new int[length];
        for (int i = 0; i < length; i++) {
            int x = paramArray[i];
            int bValue=x/65536;
            int aValue=x%65536;
            a[i]=aValue;
            b[i]=bValue;
        } // end of for loop
        System.out.println(convertToString(a));
        System.out.println(convertToString(b));
    }

    private static String convertToString(int[] output) {
        StringBuilder sb = new StringBuilder();
        int lenght = output.length;
        for (int i = 0; i < lenght; i++) {
            sb.append(output[i]);
            if (i != lenght - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    static int[] getArrayOfString(int arrayCapacity,DataInputStream dis) throws IOException{
        int[] returnArray = new int[arrayCapacity];
        for (int i = 0; i < arrayCapacity; i++) {
            String line = readLine(dis);
            returnArray[i] = Integer.parseInt(line.trim());
        }
        return returnArray;
    }

    private static InputStream createInputStream() throws FileNotFoundException {
        if (isCodechefModeOn) {
            return System.in;
        }
        String path = System.getProperty("user.dir");
        InputStream in = new FileInputStream(path + "/src/main/inputs/KOL16B.txt");
        return in;

    }

    @SuppressWarnings("deprecation")
    private static String readLine(DataInputStream reader) throws IOException {
        return reader.readLine();
    }
}

