package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ENCMSG {

    private static boolean isCodechefModeOn = false;

    private static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = createInputStream();
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            int charCount = Integer.parseInt(br.readLine());
            String message = br.readLine();
            System.out.println(encodeMessage(message));
        }
        br.close();
    }

    static String encodeMessage(String message) {
        char[] messageArray = swap(message);
        int l = message.length();
        for (int i = 0; i < l; i++) {
            char c = messageArray[i];
            messageArray[i] = findEncodedChar(c);
        }
        String s = new String(messageArray);
        return s;
    }

    static char[] swap(String message) {
        char[] messageArray = message.toCharArray();
        int charCount = message.length();
        int i = 0;
        while (i < charCount - 1) {
            char temp = messageArray[i];
            messageArray[i] = messageArray[i + 1];
            messageArray[i + 1] = temp;
            i = i + 2;
        }
        return messageArray;
    }

    static char findEncodedChar(char c) {
        int l = alphabet.length;
        for (int i = 0; i < l; i++) {
            if (alphabet[i] == c) {
                return alphabet[(l - 1) - i];
            }
        }
        return 1;
    }

    private static BufferedReader createInputStream() throws FileNotFoundException {
        InputStreamReader isr = null;
        if (isCodechefModeOn) {
            isr = new InputStreamReader(System.in);
        } else {
            String path = System.getProperty("user.dir");
            String filePath = path + "/src/main/ENCMSG.txt";
            FileInputStream fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
        }
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

}
