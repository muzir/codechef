package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EID2 {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(solution(br.readLine()));
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/EID2.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public static String solution(String s) {
		int[] agesAndCoins = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		List<Child> children = createChildrenList(agesAndCoins);
		children.sort(Comparator.comparingInt(c -> c.age));
		for (int i = 0; i < children.size() - 1; i++) {
			Child youngerChild = children.get(i);
			Child olderChild = children.get(i + 1);
			if (!isFair(youngerChild, olderChild)) {
				return "NOT FAIR";
			}
		}
		return "FAIR";
	}

	private static boolean isFair(Child youngerChild, Child olderChild) {
		if (hasSameAge(youngerChild, olderChild)) {
			if (youngerChild.coinAmount == olderChild.coinAmount) {
				return true;
			}
			return false;
		}
		if (isYoungerChildHasMoreOrEqualsCoinsThanOlderChild(youngerChild, olderChild)) {
			return false;
		}
		return true;
	}

	private static boolean hasSameAge(Child youngerChild, Child olderChild) {
		return youngerChild.age == olderChild.age;
	}

	private static boolean isYoungerChildHasMoreOrEqualsCoinsThanOlderChild(Child currentChild, Child nextChild) {
		return currentChild.coinAmount >= nextChild.coinAmount;
	}

	private static List<Child> createChildrenList(int[] agesAndCoins) {
		List<Child> children = new ArrayList<>();
		for (int i = 0; i < agesAndCoins.length / 2; i++) {
			int age = agesAndCoins[i];
			int coinAmount = agesAndCoins[i + 3];
			Child child = new Child(age, coinAmount);
			children.add(child);
		}
		return children;
	}

	private static class Child {
		private final int age;
		private final int coinAmount;

		private Child(int age, int coinAmount) {
			this.age = age;
			this.coinAmount = coinAmount;
		}

		@Override
		public String toString() {
			return "Child{" +
					"age=" + age +
					", coinAmount=" + coinAmount +
					'}';
		}
	}
}
