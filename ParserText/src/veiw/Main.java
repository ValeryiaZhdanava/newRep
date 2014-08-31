package veiw;

import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.InputStream;
import java.io.Writer;
//import java.util.Properties;

public class Main {
	public static void main(String[] args) throws IOException {
		//InputStream is = Object.class.getResourceAsStream("/regexp.properties");
       // Properties props = new Properties();
		//File file = new File("E/test.txt");
		String path = "Text.txt";
		Writer output = new BufferedWriter(new FileWriter(path));
		output.write("text");
		output.close();
		System.out.println("Записан файл");
		
	}
}
