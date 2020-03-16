package kh202003.kh20200316.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedInputStream {
	public static void main(String[] args) {

		File file = new File("src/kh202003/kh20200316/Source.txt");

//		System.out.println(file.exists());

//		FileInputStream fis = null;
		BufferedInputStream bis = null;

		// 파일 입력관련 보조 변수
		byte[] buf = new byte[1024];
		int len = 0;

		try {
			bis = new BufferedInputStream(new FileInputStream(file));

			while( (len = bis.read(buf)) != -1) {
				System.out.println(new String(buf, 0, len));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}