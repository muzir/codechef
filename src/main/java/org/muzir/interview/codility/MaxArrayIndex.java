package org.muzir.interview.codility;

public class MaxArrayIndex {
	// http://www.careercup.com/question?id=5185822661804032
	public static void main(String[] args) {
		int A[] = { 10, 1, 12, 3, 4, 28, 1 };
		//System.out.println(solution(A));
		System.out.println(polution(A));
	}

	public static int solution(int A[]) {
		int min = A[0];
		int maxDiff = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
			}
			if (A[i] - min > maxDiff) {
				maxDiff = A[i] - min;
			}
		}
		System.out.println(maxDiff);
		return maxDiff;
	}

	public static int polution(int[] A) {
	    int l = A.length;
	    if (l < 1) return 0;
	    int max = Integer.MIN_VALUE;
	    int result = 0;
	    for(int i = l-1; i >= 0; --i)
	    {
	        if(A[i] > max)
	            max = A[i];
	        int tmpResult = max - A[i];        
	        if(tmpResult > result)
	            result = tmpResult;
	    }
	    return result;
	}
}
