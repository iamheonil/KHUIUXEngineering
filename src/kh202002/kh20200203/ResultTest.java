package kh202002.kh20200203;

public class ResultTest {
	public static void main(String[] args) {

// ScannerQuiz2�� Result Test�� �ϱ� ���� ���� Class
// Result�� ���� �Ҽ��� ��°�ڸ������� ����Ѵ�.
		
		int a = 100, b = 99,c = 97;
		
		double result = (a + b + c) / (double)3;
		
//		System.out.println(result);
// 		-> 98.66666666666667
		
//		1. String.format() �̿��ϱ�
		String Cresult = String.format("%.2f", result);	// %.2f -> 2f �ι�°�ڸ� ������
		System.out.println(Cresult);
		
//		2. System.out.printf() �̿��ϱ�
		System.out.printf("%.2f", result);
		System.out.println("");
		
//		3. double ������Ÿ���� �����ϸ� ��ȯ�ϱ�
		double formatted = Math.round(result * 100) / (double)100;
		System.out.println(formatted);
		
		
// 1�� �ƴϸ� 2���� ��� ������ ��.
	}
}
