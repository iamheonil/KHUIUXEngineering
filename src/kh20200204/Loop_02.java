package kh20200204;

import java.util.Scanner;

public class Loop_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ��� ��ø ��Ű��.
		// if ���� if �� ���½�?

//		int num = 11;
//		if (num >= 1) {
//			System.out.println("1���� ũ�ų� ����.");
//			
//			if (num <= 100) {
//				System.out.println("1���� ũ�ų� ����.");
//				System.out.println("100���� �۰ų� ����.");
//			
//				System.out.println("1~100 ������ ����");
//			}
//			
//			System.out.println("1���� ũ�ų� ����.");
//
//		}
//		// for�� ���� if��
//		// 
//		for (int i=0; i<10; i++) {
//			if (i % 2== 0) { // ¦��
//				System.out.println("�Ӽ� : " + i);
//			}
//		}
//		

//		// for ��ø, �ݺ����� �ݺ�
//		// ���ʺ��� ���ʴ�� ����ȴ�.
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				for (int n = 0; n < 3; n++) {
//					System.out.println("i : " + i + " " + "j : " + j + " " + "n : " + n);
//				}
//
//				System.out.println("====");
//			}
//		}
//		// �ݺ��� ��ø �� �������
//		// �ٱ��� Loop �ݺ���(����)�� ���࿡ ���缭
//		// ���� Loop�� �ݺ���(����)�� ����Ǵ� ������ �����ؾ��Ѵ�.
//		// �ٱ���, ���� �� �ݺ����� �޴� ������ ��� �ؾ��Ѵ�.

//		��ø for loop 
//		2~9�ܱ��� ������

//		// ������ ����غ��� 2�� ~ 9��
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println("");
//		}

// <===========================================================================>

		// Q1.
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//		}

		// Q2.
//		for (int i=0; i < 5; i++) {
//			System.out.println("*");
//		}

		// Q3.
//		for (int i = 1; i < 5; i++) {
//		for (int j = 1; j < 5; j++) {
//			System.out.print("*");
//		}
//		System.out.println("*");
//	}

		// Q4.
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j < 6; j++) {
//				System.out.print(i);
//			}
//			System.out.println("");
//		}
//		
//		System.out.println("");
//
//		for (int i = 0; i < 5; i++) {
//			
//			for (int j = 0; j < 5; j++) {
//				System.out.print(i + 1);
//			}
//			
//			System.out.println("");
//		}

		// Q5.
//		for(int j = 0; j < 5; j++) {
//			for(int i = 0; i < 5; i++) {
//			System.out.print(i + 1);
//			} System.out.println();
//		}

		// Q6. - 12345 23456 34567 45678 56789

//		for(int i = 0; i < 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//			System.out.print(i + j);
//			} System.out.println("");
//		}

		// Q7. �������δٰ� 56789 ~ 12345
//		for (int i = 5; i > 0; i--) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(i + j);
//			}System.out.println("");
//		}

//		for (int i = 5; i > 0; i--) {
//			for (int j = i; j <= i+4; j++) {
//				System.out.print(j);
//			}System.out.println();
//		}

//		for (int i = 1; i < 6; i++) {
//			System.out.print("*");
////			for(int j = 1; j < 2; j++) {
////				System.out.println("");
////			}
//		}

//			for(int j = 0; j <= 4; j++) {
//				System.out.print(i + j);
//			}System.out.println("");
//		}

		// Q8. �� ���
//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
////
//		// Q9. �� ������ ���
//		for (int i = 6; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// Q10. �� 5 4 3 2 1 ������ ���
		for (int j = 5; j > 0; j--) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
				
			} j--; System.out.println();
		}

//		for (int i = 1; i <= 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(i + j);
//			} System.out.println("");
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		int N = 0;
//		System.out.print("N�� �Է��ϼ��� : ");
//		N = sc.nextInt();
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(N + " * " + i + " = " + N * i);
//		}

//		for (int i = 1; i <= 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(i + j);
//			} System.out.println("");
//		}

//		int N = 0;
//		System.out.print("N�� �Է��ϼ��� : ");
//		N = sc.nextInt();
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(N + " * " + i + " = " + N * i);
//		}
	}
}