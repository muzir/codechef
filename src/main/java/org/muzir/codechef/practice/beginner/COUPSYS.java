package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;

public class COUPSYS {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int couponCount = Integer.parseInt(br.readLine());
			Coupon[] coupons = new Coupon[couponCount];
			for (int j = 0; j < couponCount; j++) {
				int[] clx = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				Coupon coupon = new Coupon(clx[0], clx[1], clx[2]);
				coupons[j] = coupon;
			}
			Coupon[] results = findMaxCouponCities(coupons);
			Arrays.stream(results).forEach(System.out::println);
		}
		br.close();
	}

	private static Coupon[] findMaxCouponCities(Coupon[] coupons) {
		Coupon[] results = new Coupon[3];
		int length = coupons.length;
		for (int i = 0; i < length; i++) {
			Coupon coupon = coupons[i];
			setCoupon(results, coupon, coupon.level - 1);
		}
		return results;
	}

	private static void setCoupon(Coupon[] results, Coupon coupon, int level) {
		if (results[level] == null) {
			results[level] = coupon;
		} else {
			if (results[level].discount < coupon.discount
					|| (results[level].discount == coupon.discount
					&& results[level].city > coupon.city)) {
				results[level] = coupon;
			}
		}
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/COUPSYS.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	private static class Coupon {

		public Coupon(int city, int level, int discount) {
			this.level = level;
			this.city = city;
			this.discount = discount;
		}

		@Override
		public String toString() {
			return discount + " " + city;
		}

		private int level;
		private int city;
		private int discount;
	}
}
