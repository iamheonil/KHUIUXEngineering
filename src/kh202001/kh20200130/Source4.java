package kh202001.kh20200130;

public class Source4 {
	public static void main(String[] args) {
		
//		���׿����� - ���
//		+ - * / % 
//		% �� �����������ڶ�� �θ���. (modular Ȥ�� mod) 
		
//		�� ������ ����� ����
		int num1 = 17, num2 = 4;
		
//		���� ��� �����ϴ� ����
		int result;
		
//		���� ���
		result = num1 + num2;
//		result = 17 + 4;
//		result = 21;
//		result ������ 21�� ����ȴ�.
		
		// ������ ������
		int mod = num1 % num2;
		
		System.out.println(result);
		System.out.println("");
		System.out.println("������ ������ �κ�");
		System.out.println(mod);
		System.out.println("");
		System.out.println("��� ������ �κ�");
		System.out.println(num1 + num2);
		System.out.println("");
		System.out.println("��Ģ���� ������");
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("");
//		����ȯ
		System.out.println("����ȯ");
		System.out.println(num1 / num2);
//		(double) �� ����ȯ�� �ϰԵǸ� num1 �� 17.0 num2�� 4.0 �� �Ǿ� ���ȴ�.
		System.out.println((double)num1 / (double)num2);
		System.out.println(num1 / (double)num2);
//		int �� int �� ������ �ʹٸ� ���ʸ� ����ȯ ���ָ� �����ϴ�. 		
	}
}
		
// System.out.println("num1 / num2 : " + num1 - num2);
// -----> ������ �������� �Ǳ� ������ ���ڿ� + num 1 - num2 �� �Ǿ� �������� �Ұ����ϴ�.
// �׷��� num1 - num2 �� () �ȿ� �־� ���� ������ְ� ���ڿ��� �� �ϴ� ������� �ۼ��ؾ��Ѵ�.
				
// ������ ����ȯ(Data Type Casting)
// Casting, TypeCasting	
// ������ �ݵ�� �ǿ����ڵ��� ���� ������Ÿ���� ���� �����ϴ�.
// ���� �ٸ� �����ڶ�� ����ȯ�� �ϰ� ������ ����� �Ѵ�.
// ���� ������ ����� �ǿ������� ������Ÿ�԰� ����.		

// �ڵ�����ȯ(������, �Ϲ���, �Ͻ���)
// ǥ�������� ���� �����͸� ū ������Ÿ������ ����� ��
//						int / double
// ��������ȯ(�����)
// ǥ�������� ū �����͸� ���� ������Ÿ������ ����� ��
//						double / int

// �ڹ� �ڷ����� ǥ������ ��
// byte < short < int < long < float < double
// char < int
// boolean �� �ƿ� ����ȯ�� ���������� ���� ���⶧���� ������ ��/������ �����ϱ� ���� ��������

// ����, Operate
// ���α׷��� �����͸� �����ϴ� �� (��ǻ���� ��� ������ �����̶�� ǥ���� �� �ִ�.)
//
// ������, Operator
// ������ ��ȣ�� ��Ÿ�� ���� �����ڶ�� �Ѵ�.
// +, -, *, /
//
// �����ڸ� �����ϴ� ����
// 1) �ǿ������� ������ ���� �з�
// ���׿�����, ���׿�����, ���׿�����
//
// 2) ��ɿ� ���� �з�
// ���������, ����, ��, ����, ��Ʈ, ��Ÿ
//
// �ǿ�����, Operand
// ������ ���(��, ���, ���� ��)