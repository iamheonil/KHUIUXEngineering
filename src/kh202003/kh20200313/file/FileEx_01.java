package kh202003.kh20200313.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {

//		File file = new File("파일의 경로", "파일의 이름");
		
		File file1 = new File("D:/file/", "test.txt");
		
		System.out.println("File 1 : " + file1);			// 파일 경로
			
		System.out.println("Length : " + file1.length());	// 파일 길이
		
		System.out.println("Exists : " + file1.exists());	// 파일 존재 유/무

		System.out.println();

		File file2 = new File("D:/file/", "file.txt");
		
		System.out.println("File 1 : " + file2);			// 파일 경로
		
		System.out.println("Length : " + file2.length());	// 파일 길이
		
		System.out.println("Exists : " + file2.exists());	// 파일 존재 유/무
		
	}
}