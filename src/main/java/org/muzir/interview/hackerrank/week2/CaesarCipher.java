package org.muzir.interview.hackerrank.week2;

public class CaesarCipher {
    public static void main(String[] args) {
       /* char a = 'a';
        char A = 'A';
        char z = 'z';
        char Z = 'Z';
        System.out.println((int) a);
        System.out.println((int) z);

        System.out.println((int) A);
        System.out.println((int) Z);*/

        //System.out.println(caesarCipher("middle-Outz", 2));
        System.out.println(caesarCipher("www.abc.xy", 87));
    }

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        k = k % 26;
        char[] charArr = s.toCharArray();
        String result = "";
        for (char c : charArr) {
            int cInt = c;
            if (cInt >= 65 && cInt <= 90) {
                // Uppercase
                cInt = cInt + k;
                if (cInt > 90) {
                    cInt = cInt - 26;
                    result = result + (char) cInt;
                } else {
                    result = result + (char) cInt;
                }
            } else if (cInt >= 97 && cInt <= 122) {
                // Lowercase
                cInt = cInt + k;
                if (cInt > 122) {
                    cInt = cInt - 26;
                    result = result + (char) cInt;
                } else {
                    result = result + (char) cInt;
                }
            } else {
                result = result + (char) cInt;
            }
        }
        return result;
    }
}
