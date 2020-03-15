package kh202003.kh20200313.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class QuizEx_01 {
	public static void main(String[] args) {

		// 원본
		File sTxt = new File("./src/kh20200313/quiz/", "Source.txt");
		// 복사본
		File dTxt = new File("./src/kh20200313/quiz/", "Dest.txt");

//		System.out.println(sTxt.exists());
//		System.out.println(dTxt.exists());

		FileInputStream fis = null;
		FileOutputStream fos = null;

		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;
		int in = 0;
		StringBuilder sb = new StringBuilder();

		try {
//			fos = new FileOutputStream(sTxt);
			fis = new FileInputStream(sTxt);
			while ((len = fis.read(buf)) != -1) {
				sb.append(new String(buf, 0, len));

				total += len;
			}

			len = fis.read(buf);

//			fos.write(buf, 0, len);
//			fos.flush();
			System.out.println(total);
			fos = new FileOutputStream(dTxt, true);
			while ((in = fis.read(buf)) != -1) {
				fos.write(buf, 0, in);
			}
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("복사 완료! 총 : " + total + " Byte");
	}
}