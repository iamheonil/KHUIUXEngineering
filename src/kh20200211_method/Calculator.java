package kh20200211_method;

// ���踦 ����Ѵ�.

//  	+ package
//		java06_class.method.quiz
//
//		+ Ŭ���� �ۼ��ϱ�
//		1. ��� Ŭ���� ( class Calculator )
//		- ��� : ��Ģ���� ����
//		- �޼ҵ� 4��
//			sum, sub, mul, div
//		- �Ű����� : ���� 2��
//		- return : ���� (��, div�� double)
//
//		2. ���� Ŭ���� ( class CaculatorEx )
//		- ��� : ���� ���Ŭ������ �̿�
//
//		����2���� ������ 1���� �Է¹��� (Scanner �̿�)
//		switch�� �����Ͽ� ����Ŭ���� �̿��ϱ�
//
//		ex) switch( operator ) {
//		case '+':
// 	 	System.out.println(n1+"+"+n2+"="+calc.sum(n1,n2));
// 		break;


public class Calculator {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}

	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	public double div(int n1, int n2) {
		return n1 / (double) n2;
	}

	
}
