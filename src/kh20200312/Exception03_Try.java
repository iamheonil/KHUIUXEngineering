package kh20200312;

public class Exception03_Try {
	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 0;
		
		
		// �������� ����ó�� ���
		if( num2 != 0 ) {	// num2 �� 0�� �ƴ϶��!
			System.out.println(num1 / num2);
		} else {	// num2 �� 0�̶�� ����
			System.out.println("�������� 0�̹Ƿ� ����");
		}
		
		// try - catch ��
		try {
			System.out.println(num1 / num2);	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); // �������� Ȯ��.
			System.out.println("�������� 0�̹Ƿ� ����");
		}
		
		System.out.println("�ý��� ���� ����");
		
	}
}