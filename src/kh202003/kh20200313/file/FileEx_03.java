package kh202003.kh20200313.file;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {

		File file1 = new File("./src/kh20200313_file/", "Hello");
		
		System.out.println("File 1 : " + file1);			// ���� ���
		System.out.println("Length : " + file1.length());	// ���� ����
		System.out.println("Exists : " + file1.exists());	// ���� ���� ��/��
		
		System.out.println();
		
		File file2 = new File("./src/kh20200313_file/Hello");
		System.out.println("���丮�ΰ�? " + file2.isDirectory());
		
	}
}