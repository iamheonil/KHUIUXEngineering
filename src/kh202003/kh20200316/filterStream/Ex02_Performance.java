package kh202003.kh20200316.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {

		// 성능 평가, Performance Evaluation
		// 알고리즘 시작 전 현재시간 체크 : Start 에 저장
		// 알고리즘 시작 후 현재시간 체크 : End 에 저장
		// 둘의 차이를 구한다 -> 알고리즘 수행시간 : end - start
		
		long start = System.currentTimeMillis();
		// 수행시간을 측정할 알고리즘을 작성한다.
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.out.println((end - start) / (double) 1000);
		
		
		File file = new File("src/kh202003/kh20200316/Source.txt");

//		System.out.println(file.exists());

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		// 파일 입력관련 보조 변수
		byte[] buf = new byte[1024];
		int len = 0;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(new FileInputStream(file));

			start = System.currentTimeMillis();
			while( (len = bis.read(buf)) != -1) { }
			end = System.currentTimeMillis();
			
			System.out.println( (end - start) / (double) 1000 );
			
			System.out.println();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(new FileInputStream(file));
			
			start = System.currentTimeMillis();
			while( (len = fis.read(buf)) != -1) { }
			end = System.currentTimeMillis();

			System.out.println( (end - start) / (double) 1000 );
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // Main End
} // Class End