package kh20200131;

public class LogicalTest {
	public static void main(String[] args) {

		// ���� �����ڵ�
		int a = 5, b = 6, c = 10, d;

		// d�� ����� �����ϴ� �ڵ�
		// a�� ���� b�� ����
		d = ++a * b--;

		System.out.println("a : " + a + "\nb : " + b + "\nd : " + d);
		// ���� ���� 30������ b-- �� ���������ڱ� ������ ������ ���¿��� d�� ���Ǿ� ��µȴ�.
		// �׷��� a�� b ���� ����, ���� ���Ǿ� ��µ����� ���� 36

		System.out.println("");
		d = a++ + ++c - b--;
//			6	 11		5
//			7	 11		4
//		���� ����, ���� ������ �Ȱ���.
		System.out.println("a : " + a + "\nb : " + b + "\nc : " + c + "\nd : " + d);

	}
}
