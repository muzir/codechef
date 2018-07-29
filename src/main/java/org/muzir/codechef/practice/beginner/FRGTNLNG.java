package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author erhun.baycelik
 *
 */
public class FRGTNLNG {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		int testCaseCount = Integer.parseInt(readLine(dis));
		for (int i = 0; i < testCaseCount; i++) {
			String[] nk = readLine(dis).split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			String[] words = readLine(dis).split(" ");
			Set<String> phrases = new HashSet<>();
			for (int j = 0; j < k; j++) {
				String[] temp = readLine(dis).split(" ");
				phrases.addAll(Arrays.stream(temp).collect(Collectors.toSet()));
			}
			StringBuilder result = new StringBuilder();
			for (int a = 0; a < n; a++) {
				String s = words[a];
				if (phrases.contains(s)) {
					result.append("YES").append(" ");
				} else {
					result.append("NO").append(" ");
				}
			}
			result.setLength(result.length() - 1);
			System.out.println(result.toString());
		}
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/src/main/inputs/FRGTNLNG.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

}
