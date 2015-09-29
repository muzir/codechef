package org.muzir.interview.raiseOnline;

import java.util.ArrayList;
import java.util.List;

/**
 * This next question is the REAL question, this will be the question that you
 * WILL CODE FOR. (1) I want to create an integer array. (it can have any size
 * between 3 to 100) (2) Your task is to divide this array in sub arrays based
 * on their sequence and output the first digit of largest sized subarray.
 * Example is : Lets say array[]={3,5,7,3,8,4,7,5,2,7,9,5,3}; we will divide it
 * in subparts based on their Lower to higher sequence. like First part will be
 * {3,5,7}, part breaks here because next digit 3 is smaller than 7 Second part
 * will be {3,8} Third {4,7} Fourth {5} Fifth {2,7,9} Sixth {5} Seventh {3}
 * 
 * So here largest sub arrays are {3,5,7} and {2,7,9} , You can show output
 * either 3 or 2. That can be 3 or 2 we have to show first digit on any of these
 * two subparts. user input is not required. You can fix user input (array).
 * 
 * [1,2,5,8,2,5,6,9,1,5]
 * 
 * {1,2,5,8}
 * 
 * {2,5,6,9}
 * 
 * {1,5}
 * 
 * @author erhun.baycelik
 *
 */
public class LargestSubArray {

	@SuppressWarnings("rawtypes")
	static List<List> subArrayList = new ArrayList<List>();
	static List<Integer> subList = new ArrayList<Integer>();

	public static void seperateSubArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			subList.add(current);
			if (i + 1 == array.length) {
				subArrayList.add(subList);
				subList = new ArrayList<Integer>();
				break;
			}
			int next = array[i + 1];
			if (current > next) {
				subArrayList.add(subList);
				subList = new ArrayList<Integer>();
			}
		}

	}

	public static void main(String[] args) {
		int arr3[] = { 1, 2, 5, 8, 2, 5, 6, 9, 1, 5 };
		seperateSubArr(arr3);
		int maxIndex = 0;
		int maxSize = 0;
		for (int i = 0; i < subArrayList.size(); i++) {
			int tempSize = ((ArrayList<?>) subArrayList.get(i)).size();
			if (tempSize > maxSize) {
				maxIndex = i;
				maxSize = tempSize;
			}
		}
		System.out.println(((ArrayList<?>) subArrayList.get(maxIndex)));
	}
}
