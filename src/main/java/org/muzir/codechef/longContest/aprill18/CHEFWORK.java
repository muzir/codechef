package org.muzir.codechef.longContest.aprill18;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CHEFWORK {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int numberOfWorkers = Integer.parseInt(br.readLine());
		int[] coins = Arrays.stream(br.readLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		int[] workerTypes = Arrays.stream(br.readLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		System.out.println(calculateMinCoins(coins, workerTypes, numberOfWorkers));
		br.close();
	}

	private static int calculateMinCoins(int[] coins, int[] workerTypes, int numberOfWorkers) {
		List<Integer> translators = new ArrayList();
		List<Integer> authors = new ArrayList();
		List<Integer> authorTranslators = new ArrayList();

		for (int i = 0; i < numberOfWorkers; i++) {
			int workerType = workerTypes[i];
			if (workerType == 1) {
				translators.add(coins[i]);
			} else if (workerType == 2) {
				authors.add(coins[i]);
			} else if (workerType == 3) {
				authorTranslators.add(coins[i]);
			}
		}
		int traslatorMin = 0;
		int authorMin = 0;
		int authorTranslatorsMin = 0;
		if (!translators.isEmpty()) {
			traslatorMin = Collections.min(translators);
		}
		if (!authors.isEmpty()) {
			authorMin = Collections.min(authors);
		}
		if (!authorTranslators.isEmpty()) {
			authorTranslatorsMin = Collections.min(authorTranslators);
		}

		int sumOfTranslatorMinAuthorMin = traslatorMin + authorMin;

		if (traslatorMin == 0 || authorMin == 0) {
			return authorTranslatorsMin;
		}

		if (authorTranslatorsMin == 0) {
			return sumOfTranslatorMinAuthorMin;
		}

		return Math.min(authorTranslatorsMin, sumOfTranslatorMinAuthorMin);
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/CHEFWORK.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
