package kh202003.kh20200313.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_03 {
	public static void main(String[] args) {

		InputStream is = System.in; // �Է� ��ü

		int in = -1; // �Է¹��� ������

		byte[] b = new byte[1024]; // �Է��� ������ �ӽ������

		int len = -1; // �Է��� �������� ����
		
		int total = 0;
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("�Է� �����..");
		
		try {
			
			while ( (len = is.read(b)) != -1 ) { 
				
				System.out.println("���ڱ��� : " + len); // �Է¹��� ���� ���
				
				total += len;
				
				String str = new String(b, 0, len);
				
				System.out.println("�Է��� ���ڿ� : " + str);
				
//				System.out.println("�Է��� ���ڿ� : " + b[0]);	// �Է¹��� ���ڿ�
				// new String(b)�� ��ȯ�ϸ� byte[]�� ��� ��Ҹ� ��ȯ�Ѵ�.
				// �̶� ������ �Է��ߴ� �����͵� ���� ��ȯ�ع�����.
				// new String(b, 0, len)�� �̿��Ͽ� �Է��� ���̸�ŭ�� ��ȯ�Ͽ� ����Ѵ�.
				
				sb.append(str);
			}
			
		} catch (IOException e) {

			e.printStackTrace();
			
		} 
		System.out.println(total + "��ŭ �Է� �߽��ϴ�.");
		System.out.println("�Է��� ���ڵ�");
		System.out.println(sb);

	} // Main End
} // Class End