package kh202003.kh20200316.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {

		File file = new File("src/kh202003/kh20200316/", "BufferedOut.txt");

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		System.out.println(file.exists());

		try {

			fos = new FileOutputStream(file, true);
			bos = new BufferedOutputStream(fos);
			
			// Write
			bos.write("Orange".getBytes());
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // Main End
} // Class End