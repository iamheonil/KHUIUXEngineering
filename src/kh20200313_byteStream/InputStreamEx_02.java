package kh20200313_byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02 {
	public static void main(String[] args) {

		InputStream is = System.in; // �Է� ��ü

		int in = -1; // �Է¹��� ������

		StringBuilder sb = new StringBuilder(); // �Է¹��� ������ �����
		// StringBuilder �� �߰�, ����, ������ ���� �۾��� �����ϴ�.
		
		try {

			while ((in = is.read()) != -1) {
				
				sb.append((char) in); // �Էµ� �ƽ�Ű�ڵ带 ���ڷ� �����Ͽ� StringBuilder�� ����

			}

		} catch (Exception e) {

		} finally {
			try {
				if (is != null) {
					is.close(); // ��Ʈ�� �ݱ�
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // �ڿ� �ݳ��� ���� �ڵ���� finally�� �����ִ°��� �����ϴ�
		}
		System.out.print("�Է� ��� : ");
		System.out.print(sb);
		
		// Ű���忡�� EOF �� Ctrl + Z (^Z)
		
	} // Main End
} // Class End