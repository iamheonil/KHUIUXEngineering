package kh202003.kh20200313.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class QuizEx_02_Second {
	public static void main(String[] args) {

		// 원본
		File sTxt = new File("./src/kh202003/kh20200313/quiz/", "Lower.txt");
		// 복사본
		File dTxt = new File("./src/kh202003/kh20200313/quiz/", "Dest2.txt");

//		System.out.println(sTxt.exists());
//		System.out.println(dTxt.exists());

		byte[] buf = new byte[1024];
		int total = 0;
		int in = 0;

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(sTxt);
			fos = new FileOutputStream(dTxt);

			while ((in = fis.read()) != -1) {

				// 방법1
				int upper = Character.toUpperCase(in);

				// 방법2
//				int upper = in;
//				if( in >= 'a' && in <= 'z' ) {
//					upper -= 32;
//				}

				// 파일 출력
				fos.write(upper);
				fos.flush();

				// 파일카피 총 길이
				total++;
			}

		} catch (Exception e) {
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
				if (fis != null) {
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