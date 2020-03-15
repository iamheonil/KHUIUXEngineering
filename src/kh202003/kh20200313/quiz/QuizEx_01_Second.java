package kh202003.kh20200313.quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class QuizEx_01_Second {
	public static void main(String[] args) {

		// 원본
		File sTxt = new File("./src/kh202003/kh20200313/quiz/", "Source.txt");
		// 복사본
		File dTxt = new File("./src/kh202003/kh20200313/quiz/", "Dest.txt");

		System.out.println(sTxt.exists());
		System.out.println(dTxt.exists());

		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(sTxt);
			fos = new FileOutputStream(dTxt);

			while ((len = fis.read(buf)) != -1) {

				// 파일 출력
				fos.write(buf, 0, len);
				fos.flush();

				// 파일카피 총 길이
				total += len;
			}

		} catch (FileNotFoundException e) {
			System.err.println("File Not Found Exception!");
			System.err.println("경로가 아닌거 같은데요?!");
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
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("복사 완료! 총 " + total + "만큼 복사 완료");
		System.out.println("복사 완료 된 파일의 길이는 " + dTxt.length() + " 입니다.");
	}
}