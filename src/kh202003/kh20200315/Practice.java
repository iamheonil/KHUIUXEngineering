package kh202003.kh20200315;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
	public static void main(String[] args) {

		File file = new File("./src/kh202003/kh20200313/quiz/", "Source.txt");
		File cFile = new File("./src/kh202003/kh20200315/", "CFSource.txt");

		FileInputStream fis = null;
		FileOutputStream fos = null;

//		System.out.println(file.exists());

		byte[] buf = new byte[1024];
		int len = -1;

		try {
			
			fis = new FileInputStream(file);
			fos = new FileOutputStream(cFile);

			while ((len = fis.read(buf)) != -1) {
				fos.write(buf, 0, len);
				
				int str = 123123123;
				fos.write(str);
				fos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		System.out.println(fos);
	}
}