package kh20200130;

public class Source2 {
	public static void main (String[] args) {
		
//		System.out.println(777); // ���
		
//		int num = 500 + 600;
		
		
		final int MAX = 100000000;
//		max = 100;
//		max = 200;
//		���� ���� �������൵ ��������� final ���� ���� ����� ���ÿ� �ʱ�ȭ ���ִ°͵� �����غ����Ѵ�.
//		final �� ������ �������� ��κ� �빮�ڷ� �ۼ��Ѵ�.
		System.out.println("MAX�� ���� : " + MAX);
		System.out.println("");
		

		final int STUDENT_NUM = 10;	// �л��� ��
		
		int sum = 808;	// ����
		double avg;	// ���
		avg = sum / (double) STUDENT_NUM;
//			���⼭	(double) ���� ��쿣 ������(/) �۾��� ������ �� STUDENT_NUM �� ����ȯ�� ���־ �Ҽ������� ����Ͽ� ����Ѵ�. **
		
		System.out.println("�� �ο� : " + STUDENT_NUM);
		System.out.println(avg);
	}
}
