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
		System.out.print("A�� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("B�� ���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		if(a > b) {
			System.out.println("A�� �� ū ���Դϴ�.");
		} else if (a == b){ 
			System.out.println("�� ���� �����ϴ�.");
		} else
			System.out.println("B�� �� ū ���Դϴ�.");			
		
		
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
		
	}
}