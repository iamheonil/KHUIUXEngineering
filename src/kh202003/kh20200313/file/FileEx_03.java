package kh202003.kh20200313.file;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {

		File file1 = new File("./src/kh20200313_file/", "Hello");
		
		System.out.println("File 1 : " + file1);			// 파일 경로
		System.out.println("Length : " + file1.length());	// 파일 길이
		System.out.println("Exists : " + file1.exists());	// 파일 존재 유/무
		
		System.out.println();
		
		File file2 = new File("./src/kh20200313_file/Hello");
		System.out.println("디렉토리인가? " + file2.isDirectory());
		
	}
}