package kh202002.kh20200203;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		int under = 0;
//		int height = 0;
		

//	result = sc.nextDouble();
		System.out.print("�غ��� �Է��ϼ��� : ");
		int under = sc.nextInt();
		System.out.print("���̸� �Է��ϼ��� : ");
		int height = sc.nextInt();
	
//		�߰��߰� �׽�Ʈ �غ��� ������ ���̴°��� ����.
//		System.out.print("�߰����� : " + under + height);
		
//		����ȯ�� �ϰ� �Ǹ� �� �ڿ� �־��ִ°��� ����.
		double result = (under * height) / (double)2;
		System.out.println("���̴� : " + result);
	
	}
}