package kh20200210;

// �ǹ��� ��üȭ�ϴ� �κ�



public class Main_02 {
	public static void main(String[] args) {

		Class_02 cl = null;		// ������ ��ü ���� ����
								// �������� �迭���� ���Դ� �������
								// �ּҸ� �������ִ� �׷� �����̴�.
		
		cl = new Class_02();	// ��ü ����, ��üȭ(�ν��Ͻ�ȭ)
		
		System.out.println(cl.num4);		// public
		System.out.println(cl.num3);		// protected
		System.out.println(cl.num2);		// default
//		System.out.println(cl.num1);		// private
		
	}
}