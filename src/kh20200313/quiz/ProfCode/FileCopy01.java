package java13_io.fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy01 {
	public static void main(String[] args) {
		
		// ���� ��ü
		File src = new File("./src/java13_io/Source.txt");
		File dest = new File("./src/java13_io/fileCopy/Dest.txt");
		
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
				
				//���� ���
				fos.write(buf, 0, len);
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















