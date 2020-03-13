package kh20200313.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {

		File file1 = new File("D:/KHUIUXEngineering/src/kh20200313_file", "Hello");
		// 절대 경로(루트 디렉토리부터 파일까지)
		
		System.out.println("File 1 : " + file1);			// 파일 경로
		System.out.println("Length : " + file1.length());	// 파일 길이
		System.out.println("Exists : " + file1.exists());	// 파일 존재 유/무
		
		System.out.println();
		
		File file2 = new File("./src/kh20200313_file", "Hello");
		// 상대경로(클래스패스(ClassPath)로 부터 파일까지 경로)
		// 클래스패스(ClassPath) - 프로그램이 실행 된 위치
		System.out.println("File 2 : " + file2);			// 파일 경로
		System.out.println("Length : " + file2.length());	// 파일 길이
		System.out.println("Exists : " + file2.exists());	// 파일 존재 유/무
		
	}
}