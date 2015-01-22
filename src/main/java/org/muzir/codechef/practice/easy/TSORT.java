package org.muzir.codechef.practice.easy;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author muzir
 *
 */
public class TSORT {

	private final static byte NL = 10;// new line
	private final static byte EOF = -1;// end of file
	private final static byte EOL = 0;// end of line
	private final static int SIZE = 1;

	public static void main(String[] args) throws IOException {
		long beforeRead = System.currentTimeMillis();
		String filePath = System.getProperty("user.dir");
		InputStream fileInput = new FileInputStream(filePath + "/TSORT.txt");
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
		long afterSort = System.currentTimeMillis();
		printTimeDiff(afterSort - beforeRead);
	}

	private static void printTimeDiff(long timeDiff) {
		Date date = new Date(timeDiff);
		DateFormat formatter = new SimpleDateFormat("mm:ss:SSS");
		String dateFormatted = formatter.format(date);
		System.err.println(dateFormatted);
	}

	//
	// private static void writeSortedArray(String filePath, int[] numbers)
	// throws FileNotFoundException, UnsupportedEncodingException {
	// PrintWriter writer = new PrintWriter(filePath + "/TSORTED.txt", "UTF-8");
	// for (int i : numbers) {
	// writer.println(i + 0);
	// }
	// writer.close();
	// }

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
