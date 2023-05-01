package org.muzir.interview.hackerrank.week1;

import java.util.List;
import java.util.stream.Collectors;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }


    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        List<Character> alphabet =
                List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                        'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        List<Character> cList = s.toUpperCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        String result = "pangram";
        for (Character c : alphabet) {
            if (!cList.contains(c)) {
                result = "not pangram";
                break;
            }
        }
        return result;
    }
}
