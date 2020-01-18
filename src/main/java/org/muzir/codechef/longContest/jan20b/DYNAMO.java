package org.muzir.codechef.longContest.jan20b;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DYNAMO {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int returnCode = solution(br);
			if (returnCode == -1) {
				System.exit(returnCode);
			}
		}
		br.close();
	}


	static int solution(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());

		DynamoEngine dynamoEngine = new DynamoEngine(n);

		dynamoEngine.a = Long.parseLong(br.readLine());
		dynamoEngine.s = 2 * dynamoEngine.upperLimit + dynamoEngine.a;
		System.out.println(dynamoEngine.s);
		dynamoEngine.b = Long.parseLong(br.readLine());
		dynamoEngine.c = dynamoEngine.upperLimit - dynamoEngine.b;
		System.out.println(dynamoEngine.c);
		dynamoEngine.d = Long.parseLong(br.readLine());
		dynamoEngine.e = dynamoEngine.upperLimit - dynamoEngine.d;
		System.out.println(dynamoEngine.e);
		//System.out.println(dynamoEngine.toString());
		return Integer.parseInt(br.readLine());
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/DYNAMO.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static class DynamoEngine {

		private int n;
		private long s;
		private long a;
		private long b;
		private long c;
		private long d;
		private long e;
		private long upperLimit;

		public DynamoEngine(int n) {
			this.n = n;
			this.upperLimit = (long) Math.pow(10, n);
		}

		@Override
		public String toString() {
			return "DynamoEngine{" +
					"n=" + n +
					", s=" + s +
					", a=" + a +
					", b=" + b +
					", c=" + c +
					", d=" + d +
					", e=" + e +
					'}';
		}
	}
}
