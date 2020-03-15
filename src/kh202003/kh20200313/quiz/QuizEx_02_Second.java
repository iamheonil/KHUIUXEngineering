package kh202003.kh20200313.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class QuizEx_02_Second {
	public static void main(String[] args) {

		// ����
		File sTxt = new File("./src/kh202003/kh20200313/quiz/", "Lower.txt");
		// ���纻
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

				// ���1
				int upper = Character.toUpperCase(in);

				// ���2
//				int upper = in;
//				if( in >= 'a' && in <= 'z' ) {
//					upper -= 32;
//				}

				// ���� ���
				fos.write(upper);
				fos.flush();

				// ����ī�� �� ����
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
		System.out.println("���� �Ϸ�! �� " + total + "��ŭ ���� �Ϸ�");
		System.out.println("���� �Ϸ� �� ������ ���̴� " + dTxt.length() + " �Դϴ�.");
	}
}