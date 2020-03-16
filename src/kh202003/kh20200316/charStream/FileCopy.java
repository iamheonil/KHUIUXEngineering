package kh202003.kh20200316.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {
	public static void main(String[] args) {
		File src = new File("./src/kh202003/kh20200316/charStream", "Source.txt");
		File cFile = new File("./src/kh202003/kh20200316/charStream", "Source2.txt");

		BufferedReader reader = null;
		PrintWriter writer = null;

		int total = 0;
		
		try {
			reader = new BufferedReader(new FileReader(src));
			writer = new PrintWriter(new BufferedWriter(new FileWriter(cFile)), true); // AutoFlush true

			String str = null;
			while ((str = reader.readLine()) != null) {
				writer.println(str);
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("복사 완료! 파일의 크기는 > " + cFile.length());
	}
}