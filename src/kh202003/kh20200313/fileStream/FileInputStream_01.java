package kh202003.kh20200313.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_01 {
	public static void main(String[] args) {

		// 입력 대상 파일
		File file = new File("./src/kh20200313/file", "Hello");

		System.out.println("exists : " + file.exists());

		FileInputStream fis = null;

		int in = -1;
		int len = 0;

		StringBuilder sb = new StringBuilder();

		try {

			fis = new FileInputStream(file);

			while ((in = fis.read()) != -1) {
				sb.append((char) in);
				len++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(len);
		System.out.println(sb);
		
	}
}