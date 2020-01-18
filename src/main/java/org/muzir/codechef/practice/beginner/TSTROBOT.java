package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TSTROBOT {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int[] nx = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			String commandLine = br.readLine();
			Robot robot = new Robot(nx[1], commandLine);
			System.out.println(robot.calculateUniqueVisitedNodes());
		}
		br.close();
	}

	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/TSTROBOT.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static class Robot {

		private static final char LEFT = 'L';
		private static final char RIGHT = 'R';

		private int startingPoint;
		private String commands;
		private Set<Integer> visitedPoints;
		private int uniqueVisitedNodes;

		Robot(int x, String commands) {
			this.startingPoint = x;
			this.commands = commands;
			visitedPoints = new HashSet<>();
			visitedPoints.add(startingPoint);
			uniqueVisitedNodes = 1;
		}

		int calculateUniqueVisitedNodes() {
			char[] allCommands = commands.toCharArray();
			for (char c : allCommands) {
				if (c == LEFT) {
					startingPoint = startingPoint - 1;
				} else if (c == RIGHT) {
					startingPoint = startingPoint + 1;
				}
				if (isNewPointCoordinate()) {
					uniqueVisitedNodes++;
					visitedPoints.add(startingPoint);
				}
			}
			return uniqueVisitedNodes;
		}

		private boolean isNewPointCoordinate() {
			return !visitedPoints.contains(startingPoint);
		}
	}
}
