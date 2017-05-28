package org.muzir.interview.transferwise;

import java.util.Arrays;

/**
 * Created by erhun.baycelik on 30/04/2017.
 */
public class KDifference {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int k=2;
        //System.out.println(Arrays.binarySearch(a,5));
        Arrays.sort(a);
        int lenght=a.length;
        int kDifferenceCounter=0;
        for(int i=0;i<lenght;i++){
            int element=a[i];
            int pair=element+k;
            if(Arrays.binarySearch(a,pair)>=0){
                kDifferenceCounter=kDifferenceCounter+1;
            }
        }
        System.out.println(kDifferenceCounter);

    }
}
