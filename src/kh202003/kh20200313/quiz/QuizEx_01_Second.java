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

		// ����
		File sTxt = new File("./src/kh202003/kh20200313/quiz/", "Source.txt");
		// ���纻
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

				// ���� ���
				fos.write(buf, 0, len);
				fos.flush();

				// ����ī�� �� ����
				total += len;
			}

		} catch (FileNotFoundException e) {
			System.err.println("File Not Found Exception!");
			System.err.println("��ΰ� �ƴѰ� ��������?!");
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
		System.out.println("���� �Ϸ�! �� " + total + "��ŭ ���� �Ϸ�");
		System.out.println("���� �Ϸ� �� ������ ���̴� " + dTxt.length() + " �Դϴ�.");
	}
}