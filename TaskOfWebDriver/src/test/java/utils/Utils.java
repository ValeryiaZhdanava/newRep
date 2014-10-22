package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	public static String getFile(int fileSize) {

		FileWriter fileWriter = null;
		File file = null;
		try {
			file = new File("file.txt");
			fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			while (file.length() < fileSize) {
				bufferedWriter.write(AB);
			}
			System.out.println(file.length());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return file.getAbsolutePath();
	}

	// public static void getAbsolutePath() {
	//
	// }
}
