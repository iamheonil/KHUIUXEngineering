package kh20200205;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		// do - while Loop
		
//		int i = 0;
//		do {
			
			// do�� �ݺ� ���� �ڵ��ۼ���
			// do �� ������ 1�� �����ϰ� �� �������� ���ǰ˻縦 �ϰ� 
			// �ݺ� ������ ���� ���� �����Ѵ�.			
			// �ϴ� ������ ��Ű�� �� �� ���� �˻��� �� �� �ִ� ��Ȳ
			
		
//			System.out.println("�÷�?");
//			i++;
//		} while( i <= 5 );
				// while(����)�� ��ȣ ���� �ְ� �ǰ� ��ȣ�� �ް� �����ݷ��� ���ְ� �ȴ�.
		

//		�޴� ���� �ݺ���
		
//		do {
//			// �޴��� �����ְ�, �޴� ���� �� ���� ��ư�� �������� ������ ��� �ݺ� �ϰ� �ȴ�.
//			// 
//			
//		} while();
		// ���� ��ư�� �������� �ʾ��� ���
		
//		int i = 0; // �ʱ��
//		do {
//			System.out.println(i);
//			
//			i++;
//		} while(i < 5);
		
		Scanner sc = new Scanner(System.in);
		
		int input; // ����ڰ� �Է��� ���� �����ϴ� ����
		int sum = 0; // �� �հ�
//		
//		do {
//			System.out.print("���� �Է��ϼ���(0�� �Է��ϸ� ����˴ϴ�.) : ");
//			input = sc.nextInt();
//			
//			sum += input;	// ���� �հ�
//			
//			
//		} while(input != 0);
//		
//		System.out.println("���� : " + sum);
		
		do {
			System.out.print("���� �Է��ϼ���(0�� �Է��ϸ� ����˴ϴ�.) : ");
			input = sc.nextInt();
			
			sum += input;	// 
			
			if(input == 0) {
				break;
			}
		} while(true); // ���ѷ�
		System.out.println("���� : " + sum);
		
		
		
	}
}
