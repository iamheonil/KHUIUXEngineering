package kh202003.kh20200313.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		// ��´�� ����
		File file = new File("./src/kh20200313/fileStream", "Result");

		System.out.println("test : " + file.exists());

		FileOutputStream fos = null;
		
		try {
//			fos = new FileOutputStream(file); // ���� ��� ��Ʈ�� ����
//			fos = new FileOutputStream(file, false); // ������
			fos = new FileOutputStream(file, true); // �߰����

			String str = "Hello FileStream\n";

			fos.write(str.getBytes(), 0, str.length());
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();

			}
		} // Finally


	} // Main End
}// Class End