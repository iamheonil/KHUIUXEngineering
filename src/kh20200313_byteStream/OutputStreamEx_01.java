package kh20200313_byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_01 {
	public static void main(String[] args) {

		OutputStream os = null;
		os = System.out;

		try {
			os.write(97); // ' a '

			os.write('b');
			os.write('c');
			os.write('\n');
			
			os.write('1');
			os.write('2');
			os.write('3');
			os.write('\n');
			
			os.flush(); // ���� ����, ��½� �� ������ϴ� �۾�
			
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (os != null) {
					os.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();

			}
		}

	}
}