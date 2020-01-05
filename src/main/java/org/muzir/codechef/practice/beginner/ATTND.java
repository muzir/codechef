package org.muzir.codechef.practice.beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ATTND {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = createInputStream();
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			int namesCount = Integer.parseInt(br.readLine());
			String[] names = new String[namesCount];
			for (int j = 0; j < namesCount; j++) {
				String name = br.readLine();
				names[j] = name;
			}
			solution(names);
		}
		br.close();
	}

	static void solution(String[] names) {
		List<Student> students = Arrays.stream(names).map(s -> {
			String[] studentNames = s.split(" ");
			return new Student(studentNames[0], studentNames[1]);
		}).collect(Collectors.toList());

		int size = students.size();
		for (int i = 0; i < size; i++) {
			Student currentStudent = students.get(i);
			String name = currentStudent.getName();
			for (int j = i + 1; j < size; j++) {
				Student nextStudent = students.get(j);
				String nextName = nextStudent.getName();
				if (name.equals(nextName)) {
					students.set(i, new Student(currentStudent, true));
					students.set(j, new Student(nextStudent, true));
					break;
				}
			}
		}
		students.forEach(s -> {
			if (s.isFullNameNeeded) {
				System.out.println(s.fullName);
			} else {
				System.out.println(s.name);
			}
		});
	}


	private static BufferedReader createInputStream() throws FileNotFoundException {
		InputStreamReader isr = null;
		if (isCodechefModeOn) {
			isr = new InputStreamReader(System.in);
		} else {
			String path = System.getProperty("user.dir");
			String filePath = path + "/src/main/inputs/ATTND.txt";
			FileInputStream fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
		}
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	static class Student {
		private final String name;
		private final String surname;
		private final boolean isFullNameNeeded;
		private final String fullName;

		public Student(String name, String surname) {
			this.name = name;
			this.surname = surname;
			this.isFullNameNeeded = false;
			this.fullName = name + " " + surname;
		}

		public Student(Student student, boolean isFullNameNeeded) {
			this.name = student.name;
			this.surname = student.surname;
			this.isFullNameNeeded = isFullNameNeeded;
			this.fullName = name + " " + surname;
		}

		public String getName() {
			return name;
		}

		public boolean isFullNameNeeded() {
			return isFullNameNeeded;
		}

		public String getFullName() {
			return fullName;
		}
	}
}
