package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/FLOW010.txt");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int t = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < t; i++) {
			String shipId = br.readLine().trim();
			System.out.println(writeShip(shipId));
		}

	}

	static String writeShip(String shipId) {
		if (shipId.toUpperCase().equals("B")) {
			return "BattleShip";
		} else if (shipId.toUpperCase().equals("C")) {
			return "Cruiser";
		} else if (shipId.toUpperCase().equals("D")) {
			return "Destroyer";
		} else if (shipId.toUpperCase().equals("F")) {
			return "Frigate";
		}
		return null;
	}

}
