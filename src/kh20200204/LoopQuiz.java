package kh20200204;

import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// ������ �� �Է¹��� ���� �ܼ��� ����Ͽ���
//		System.out.print("ù��° ���� �Է����ּ��� : ");
//		int a = sc.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			int result = a * i;
//			
//			System.out.println(a + " * " + i + " = " + result);
//		}

		// � ���� ����� ���ϴ� ���α׷��� �ۼ��Ͽ���
		// ��� = � ���� ������ ���� �� �ִ� ��

//		System.out.print("��� ���� ���� �Է��ϼ���. : ");
//		int yak = sc.nextInt();
//		
//		for (int i = 1; i <= yak; i++) {
//			if(yak % i == 0) {
//				System.out.print(i + " ");	
//			} 
//		}

		// 1���� 1000������ �����߿��� 4�� �����
		// 6���� ����� �������� 1�� ���� ���� ����϶�.
		// > 41916

//		int LoopSu = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 4 == 1 && i % 6 == 1) {
//				LoopSu += i;
//			}
//		}System.out.println(LoopSu);

		// �Է¹��� �μ��� �ּ� ������� �ִ� ������� ���ϴ�
		// ���α׷��� �ۼ��϶�.
		// �ּҰ���� = ����� �߿��� ���� ���� ����
		// �ִ����� = ����� �߿��� ����ġ�� ���� ū ��

//		int val1, val2;
//		int r = 1;
//		int LCM;
//
//		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
//		val1 = sc.nextInt();
//		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
//		val2 = sc.nextInt();
//
//		int tmp1 = val1, tmp2 = val2; 	// �ּҰ������ ���ϱ� ���� �Է¹��� �� ����
//		if (val1 < val2) {				// 2��° �Է¼��� Ŭ ��� ū���� val1���� ����
//			val1 = tmp2;
//			val2 = tmp1;
//		}
//
//		while (r > 0) {					// GCD ���ϱ�
//			r = val1 % val2;
//			val1 = val2;
//			val2 = r;
//		}
//		
//		LCM = tmp1 * tmp2 / val1;		// LCM ���ϱ�
//		System.out.println("GCD(�ִ�����) : " + val1);
//		System.out.println("LCM(�ּҰ����) : " + LCM);

		// 1�������� �Էµ� � ������ ���� �ִ� �Ҽ���
		// ã�� ���α׷��� �ۼ��϶�.
		// * �Ҽ� = 1 �� �ڽ��� ���ڷθ� ������ �������� ��
		// * ex) 2,3,5,7,11,13, ...

		int x = 0;
		System.out.print("�Ҽ��� ���� � ���� �Է����ּ���. : ");
		x = sc.nextInt();
		int result = 0;

		for (int i = 2; i <= x; i++) {
			boolean isPrime = true; // �ʱ� ��
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
				}
				// �Ҽ��� �ƴϴ�.
				isPrime = false;
				break;
			}
			if (isPrime) { // �Ҽ� �϶��� ���� ���
				System.out.print(i + " ");
			}
		}
		sc.close();

//		System.out.print("���� �Է��غ����� : ");
//		int scInt = sc.nextInt();
//		
//		int count = 0;
//		for (int i = 1; i <= scInt; i++)
//		{
//			for (int j = 2; j <= scInt; j++) {
//				if (i % j == 0) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				System.out.print(i + ", ");
//			}
//				count = 0;
//		}
		// i = 1���� ����, scInt(��ĵ��)�� ������ �� ���� 1�� ����
		// ���� ���� 1�� �ƹ����� �ƴϱ⿡ 2���� ����, ���������� scInt(��ĵ��)�� ������ ������ �����Ѵ�.
		// i, j �� �� �Է� ���̱⶧���� �ٱ� ������ ���� ������ ���ʴ�� �����ϸ鼭 �����Ѵ�.
		// �Ҽ��� 1�� ������ ���� ���ڷθ� ���������ϱ⶧���� ������ �� �������� 0�̶�� count�� ���Ѵ�.
		// count�� 1�� �ȴٸ� �ٱ��������� i�� ���ڿ� �޸��� print ���ְ� �ٽ� 0���� �ʱ�ȭ ���ش�.
		// �� ������ �Է��� scInt ���� ���ѹݺ� ����� ��µȴ�.

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

//		// Q10. �� 5 4 3 2 1 ������ ���
		// *****
		// ****
		// *** .. 2�� 1������
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 5; j >= 1; j--) {
//				if (j > i) {
//				System.out.print(" ");
//				} else {
//					System.out.print("*");	
//				}
//			} System.out.println();
//		} 
//		
		// Q11. �� ������
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= 5; j++) {
//				if (i > j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}

		// Q12. �� ��Ʈ1
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// Q13. �� ��Ʈ2
//		for (int i = 5; i > 1; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

	} // Main End
} // Class End
