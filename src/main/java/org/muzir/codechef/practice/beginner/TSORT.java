package org.muzir.codechef.practice.beginner;

import java.io.*;
import java.util.Arrays;


public class TSORT {

	private final static byte NL = 10;// new line
	private final static byte EOF = -1;// end of file
	private final static byte EOL = 0;// end of line
	private final static int SIZE = 1;

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir");
		InputStream fileInput = new FileInputStream(filePath + "/src/main/inputs/TSORT.txt");
		BufferedInputStream reader = new BufferedInputStream(fileInput);
		int linesOfParamaters = Integer.parseInt(readByte(reader, ""));
		int[] numbers = new int[linesOfParamaters];
		for (int i = 0; i < linesOfParamaters; i++) {
			numbers[i] = Integer.parseInt(readByte(reader, ""));
		}
		reader.close();
		Arrays.sort(numbers);
		String lineSeperator = System.getProperty("line.separator");
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		for (int i = 0; i < numbers.length; i++) {
			out.write(numbers[i] + lineSeperator);
		}
		out.flush();
		out.close();
	}

	private static String readByte(BufferedInputStream reader,
								   String accumulator) throws IOException {
		byte[] container = new byte[SIZE];
		reader.read(container);
		byte byteRead = container[0];
		if (byteRead == NL || byteRead == EOL || byteRead == EOF) {
			return accumulator;
		}
		String input = "";
		input = new String(container, 0, SIZE);
		accumulator = accumulator + input;
		return readByte(reader, accumulator);
	}
}
