package utils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Utils {
	private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static Random rand = new Random();

	public static String getRandomString(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			sb.append(AB.charAt(rand.nextInt(AB.length())));
		}
		return sb.toString();
	}

	@SuppressWarnings("resource")
	public static String getFile(long fileSize) throws IOException {

		File file = new File("file.txt");
		RandomAccessFile rf = new RandomAccessFile(file, "rw");
		rf.setLength(fileSize);
		return file.getAbsolutePath();

	}

	public static void deleteFile(File file) {
		file.delete();

	}

}
