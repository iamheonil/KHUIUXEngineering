package kh20200313_byteStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Echo {
	public static void main(String[] args) {

		// Ű����� �Է� -> ����� ���

		InputStream is = System.in;
		OutputStream os = System.out;

		byte[] buf = new byte[1024]; // ����� �ӽ� �����
		int len = 0; // �Է� �������� ����

		try {
			// EOF�� ���� ������ Ű������ �Է��� �޾� �Է¹��� �����͸�ŭ ����ͷ� ���
			while ((len = is.read(buf)) != -1)
				os.write(buf, 0, len);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}