package kh20200207;

public class Swap {
	public static void main(String[] args) {

		// ����, Swap (�ڸ� �ٲٱ�)

		//		i	>	j
		//
		//		-> temp ->
		//
		//	i �� �� ũ��
		//	temp�� i
		//	i�� j
		//	j�� ����

		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("���� �ϱ� �� " + num1 + " : " + num2);
		
		System.out.println();
		int tmp = num2;
		num2 = num1;
		num1 = tmp;
		// temp �� �� 3 ������ �����ϰ� �ϳ��� ������ ���� ����Ѵ�.
		// �������� temp �� ���� �������ָ� ���۸� �ϴ� �� ó�� ����
		
		System.out.println("���� �ϰ� �� �� " + num1 + " : " + num2);
		
	} // Main End
} // Class End