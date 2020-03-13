package java13_io.fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy02_2 {
	public static void main(String[] args) {
		
		// ���� ��ü
		File src = new File("./src/java13_io/fileCopy/Lower.txt");
		File dest = new File("./src/java13_io/fileCopy/Upper.txt");
		
		// ����� ��Ʈ�� ��ü ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// ���� ����� ���� ����
		int in = 0; // ����� ����(1ȸ)
		int tot = 0; // �� ����� ����
		
		try {
			// ���� ����� ��Ʈ�� ����
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			
			// ���� �Է�
			while( (in=fis.read()) != -1 ) {
				
				//���1
				int upper = Character.toUpperCase(in);
				
				//���2
//				int upper = in;
//				if( in >= 'a' && in <= 'z' ) {
//					upper -= 32;
//				}
				
				//���� ���
				fos.write(upper);
				fos.flush();
				
				// ����ī�� �� ����
				tot++;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���Ͻ�Ʈ�� ���� ����");
			System.out.println("\t>> ���� ����");
			System.out.println("\t>> �� �� ���� ���");
			
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ����� ����");
			
		} finally {
			try {
				// ��Ʈ�� �ݱ�
				if(fis!=null)	fis.close();
				if(fos!=null)	fos.close();
				
			} catch (IOException e) {
				System.out.println("[ERROR] ���ϴݱ� ����");
				
			}
		}
		
		System.out.println(tot+" ����Ʈ ���� �Ϸ�");
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
	}
}















