package org.muzir.interview.mobilab;

public class ReverseName {
	String name;

	public char[] reverseName(char[] charName) {
		if (charName == null) {
			char[] empty = {};
			return empty;
		}
		int lenght = charName.length;
		if (lenght == 1) {
			return charName;
		}
		for (int i = 0, j = lenght - 1; i < j; i++, j--) {
			char head = charName[i];
			char tail = charName[j];
			charName[i] = tail;
			charName[j] = head;
		}
		return charName;
	}
}
