package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MDL {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			br.readLine();
			String sequence = br.readLine();
			System.out.println(solution(sequence));
		}
		br.close();
	}

	static String solution(String sequence) {
		List<Integer> ls = Arrays.stream(sequence.split(" ")).map(Integer::parseInt).collect(toList());
		while (ls.size() > 2) {
			Integer firstThreeElementsMedian = findMedian(new ArrayList<>(ls.subList(0, 3)));
			ls.remove(firstThreeElementsMedian);
		}
		String s = ls.stream().map(String::valueOf).collect(Collectors.joining(" "));
		return s;
	}

	private static Integer findMedian(List<Integer> subList) {
		subList.sort(Comparator.naturalOrder());
		return subList.get(1);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/MDL.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
