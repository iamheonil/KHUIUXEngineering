package kh202003.kh20200316.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {

		// ���� ��, Performance Evaluation
		// �˰��� ���� �� ����ð� üũ : Start �� ����
		// �˰��� ���� �� ����ð� üũ : End �� ����
		// ���� ���̸� ���Ѵ� -> �˰��� ����ð� : end - start
		
		long start = System.currentTimeMillis();
		// ����ð��� ������ �˰����� �ۼ��Ѵ�.
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.out.println((end - start) / (double) 1000);
		
		
		File file = new File("src/kh202003/kh20200316/Source.txt");

//		System.out.println(file.exists());

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		// ���� �Է°��� ���� ����
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