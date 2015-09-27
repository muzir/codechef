package org.muzir.interview.codility;

/**
 * @author erhun.baycelik
 *
 */
public class TapeEquilibrium {

	private int leftIndex = 0;
	private int rightIndex = 0;
	private int leftCumulative = 0;
	private int rightCumulative = 0;

	public int solution(int[] a) {
		if (a.length == 1) {
			return a[0];
		}
		if (a.length == 2) {
			return Math.abs(a[0] - a[1]);
		}
		rightIndex = 0;
		leftIndex = a.length - 1;
		do {
			forwardDirection(a);
		} while (rightIndex <= leftIndex);
		return returnMinDifference();
	}

	private void forwardDirection(int[] a) {
		int rightElement = a[rightIndex];
		int leftElement = a[leftIndex];
		int tempLeftCum = leftCumulative + leftElement;
		int tempLeftDiff = Math.abs(rightCumulative - tempLeftCum);
		int tempRightCum = rightCumulative + rightElement;
		int tempRightDiff = Math.abs(tempRightCum - leftCumulative);

		if (tempRightDiff <= tempLeftDiff) {
			rightCumulative = rightCumulative + rightElement;
			rightIndex = rightIndex + 1;
		} else {
			leftCumulative = leftCumulative + leftElement;
			leftIndex = leftIndex - 1;
		}
	}

	private int returnMinDifference() {
		return Math.abs(rightCumulative - leftCumulative);
	}

}
