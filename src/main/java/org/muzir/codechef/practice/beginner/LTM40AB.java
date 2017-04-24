package org.muzir.codechef.practice.beginner;

/**
 * Created by erhun.baycelik on 24/04/2017.
 */
public class LTM40AB {

    public static int solution(int a, int b, int c, int d) {
        int accumulator=0;
        for(int y=c;y<=d;y++){
            for(int x=a;x<=b;x++){
                if(y>x){
                    accumulator=(d-y)+1+accumulator;
                }
            }
        }
        return accumulator;
    }
}
