package org.muzir.codechef.practice.school;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LCH15JAB {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		String userDir = System.getProperty("user.dir");
		StringBuffer sb = new StringBuffer();
		sb.append(userDir);
		sb.append("/LCH15JAB.txt");
		try (BufferedReader reader = new BufferedReader(new FileReader(
				sb.toString()))) {
			int linesOfParamater = Integer.parseInt(reader.readLine());
			for (int i = 0; i < linesOfParamater; i++) {
				char[] charArray = reader.readLine().toCharArray();
				System.out.println(isCharCountEqualsOtherSum(charArray));
			}
		}			
	}

	private static String isCharCountEqualsOtherSum(char[] charArray) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (char c : charArray) {
			String key = Character.toString(c);
			if (map.containsKey(key)) {
				int count = map.get(key);
				count = count + 1;
				map.put(key, count);
			} else {
				map.put(key, 1);
			}
		}
		int maxCount = Collections.max(map.values());
		String result = ((charArray.length - maxCount) == maxCount) ? "YES"
				: "NO";
		return result;
	}
}
