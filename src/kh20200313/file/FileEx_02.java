package kh20200313.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {

		File file1 = new File("D:/KHUIUXEngineering/src/kh20200313_file", "Hello");
		// ���� ���(��Ʈ ���丮���� ���ϱ���)
		
		System.out.println("File 1 : " + file1);			// ���� ���
		System.out.println("Length : " + file1.length());	// ���� ����
		System.out.println("Exists : " + file1.exists());	// ���� ���� ��/��
		
		System.out.println();
		
		File file2 = new File("./src/kh20200313_file", "Hello");
		// �����(Ŭ�����н�(ClassPath)�� ���� ���ϱ��� ���)
		// Ŭ�����н�(ClassPath) - ���α׷��� ���� �� ��ġ
		System.out.println("File 2 : " + file2);			// ���� ���
		System.out.println("Length : " + file2.length());	// ���� ����
		System.out.println("Exists : " + file2.exists());	// ���� ���� ��/��
		
	}
}