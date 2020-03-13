package kh20200313.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_02 {
	public static void main(String[] args) {

		// 입력 대상 파일
		File file = new File("./src/kh20200313/fileStream", "dummy.txt");
		System.out.println("exists : " + file.exists());

		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;

		StringBuilder sb = new StringBuilder();

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			while ((len = fis.read(buf)) != -1) {
				sb.append(new String(buf, 0, len));

				total += len;
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

		
		System.out.println(total + " Byte");
//		System.out.println(sb);
		
	}
}