package java13_io.fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FileCopy02 {
	public static void main(String[] args) {

		// ���� ��ü
		File src = new File("./src/java13_io/fileCopy/Lower.txt");
		File dest = new File("./src/java13_io/fileCopy/Upper.txt");
		
		// ����� ��Ʈ�� ��ü ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// ���� ����� ���� ����
		byte[] buf = new byte[1024]; // ����
		int len = -1; // ����� ����(1ȸ)
		int tot = 0; // �� ����� ����
		
		try {
			// ���� ����� ��Ʈ�� ����
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			
			// ���� �Է�
			while( (len=fis.read(buf)) != -1 ) {
				
				String str = new String(buf, 0, len);
				String upper = str.toUpperCase();
				
				//���� ���
				fos.write(upper.getBytes(), 0, len);
				fos.flush();
				
				// ����ī�� �� ����
				tot += len;
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















