package kh202002.kh20200211_method;

// 02�� ���� ����

public class Method_02 {

	// �Ű�����
	// ��ȯ������ (return �ڵ�)
			
	// method01 �� �Ű������� ���� ���ϵ����͵� ����.
	public void method01() {
		System.out.println("Hello!");
	}
	
	// method02 �� �Ű������� �ְ� ���ϵ����ʹ� ����.
	public void method02(int parameter) {		
		System.out.println("���޵� �� : " + parameter);
		
		// parameter(�Ű�����)
		// argument(��������, �����μ�)
	}
	
	public void printNum2(int num1, int num2) {
		System.out.println("num1 = " + num1 + ", num2 = " + num2);		
	}
	
	// �Ű����� ���� ��ȯ�����ʹ� �ֵ�.
	public int returnNum() { 
		
		return 777;

	}
	
	// �Ű������� �ְ� ��ȯ�����͵� �ִ� ����
	public int add(int n1, int n2) {
		
		return n1 + n2;
	}


}