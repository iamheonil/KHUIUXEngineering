package kh20200313_file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {

//		File file = new File("������ ���", "������ �̸�");
		
		File file1 = new File("D:/file/", "test.txt");
		
		System.out.println("File 1 : " + file1);			// ���� ���
			
		System.out.println("Length : " + file1.length());	// ���� ����
		
		System.out.println("Exists : " + file1.exists());	// ���� ���� ��/��
		
	}
}