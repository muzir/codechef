package org.muzir.interview.transferwise;

/**
 * Created by erhun.baycelik on 30/04/2017.
 */
public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(50));
        String s=Integer.toBinaryString(50);
        String compement=convertBinaryToComplement(s);
        System.out.println(Integer.parseInt(compement,2));
    }

    public static String convertBinaryToComplement(String s){
        if(s==null || s.length()==0){
            return "";
        }
        StringBuilder result=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='1'){
                result.append('0');
            }else{
                result.append('1');
            }
        }
        return result.toString();
    }
}
