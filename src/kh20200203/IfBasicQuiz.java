package kh20200203;

import java.util.Scanner;

public class IfBasicQuiz {
	public static void main(String[] args) {

//		 + ���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��Ͻÿ�
//			>> Input Number : -3
//			>> �����Դϴ�
//
//		 + �Է��� �����Ͱ� 3�� ������� �Ǻ��Ͻÿ�
//		  (% ������ ���)
//			>> Input Number : 7
//			>> 3�� ����� �ƴմϴ�
//
//		 + �� ���� �Է� �޾� ū ���� ����Ͻÿ�
//			>> Input Number1 : 44
//			>> Input Number2 : 88
//			>> 88 �� �� ū ��
//
// =============================================================================
		
		
		Scanner sc = new Scanner(System.in);
		
//		1�� 
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		int result = sc.nextInt();
//		
//		if (result < 0) {
//			System.out.println("�����Դϴ�.");
//		} else
//			System.out.println("����Դϴ�.");
//		System.out.println("");
		
		
		
//		2��
//		System.out.print("�Ǻ��� ���� �Է��ϼ��� : ");
//		int result = sc.nextInt();
//		// % (������ ����) �����ڸ� ����� ��.
//		if (result % 3 == 0 && result != 0) {
//			System.out.println("3�� ����� �½��ϴ�.");
//		} else 
//		System.out.println("3�� ����� �ƴմϴ�.");
//	}

		
//		3��
//		System.out.print("A�� ���� �Է��ϼ��� : ");
//		int a = sc.nextInt();
//		System.out.print("B�� ���� �Է��ϼ��� : ");
//		int b = sc.nextInt();
//		if(a > b) {
//			System.out.println("A�� �� ū ���Դϴ�.");
//		} else if (a == b){ 
//			System.out.println("�� ���� �����ϴ�.");
//		} else
//			System.out.println("B�� �� ū ���Դϴ�.");			
//		
		
//		0���� ����غ���
//		System.out.println("�Ǻ��� ���� �Է� : ");
//		int result = sc.nextInt();
//		if (result < 0) {
//			System.out.println("�����Դϴ�.");
//		} else if (result == 0) {
//			System.out.println("0�Դϴ� �̰�");
//		} else {
//			System.out.println("����Դϴ�.");
//		}
		
		
		//if ~ else if ~ else �����ؼ� Ǯ���
	      
		
//      +�� ���� �Է� �޾� ���� ū ���� �Է��Ͻÿ�
//		int num1, num2, num3;
//		System.out.print("1��° �� �Է� : ");
//		num1 = sc.nextInt();
//		System.out.print("2��° �� �Է� : ");
//		num2 = sc.nextInt();
//		System.out.print("3��° �� �Է� : ");
//		num3 = sc.nextInt();
//		if (num1 > num2 && num1 > num3) {
//			System.out.println(num1);
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println(num2);
//		} else {
//			System.out.println(num3);
//		}

//		1���� 1000���� 4��, 6���� ����� �������� 1�μ��� ��
//		int div;
//		div = sc.nextInt();
//		
//		int sum = (div % 4);
//		System.out.println(sum);
		
		int div;
		for(int i = 0; i <= 1000; i++) {
			
			System.out.println(i);
		}
		
	      
//     +�� ������ ������ �Է¹޾� �հ�� ����� ���ϰ� 
//     ����� 90�̻�ƹ� "A", 80�̻��̸� "B"
//     70�̻��̸� "C", 60�̻��̸� "D", 60�̸��̸�  "F"�� ����Ͻÿ�
//		int num1, num2, num3;
//		System.out.println("1��° ���� �Է� : ");
//		num1 = sc.nextInt();
//		System.out.println("2��° ���� �Է� : ");
//		num2 = sc.nextInt();
//		System.out.println("3��° ���� �Է� : ");
//		num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		double div = sum / (double) 3;
//		
//		if (div >= 90) {
//			System.out.println("A�Դϴ�.");
//		} else if (div < 90) {
//			System.out.println("B�Դϴ�.");
//		} else if (div < 80) {
//			System.out.println("C�Դϴ�.");
//		} else {
//			System.out.println("F�Դϴ�.");
//		}
		
     
	}
}