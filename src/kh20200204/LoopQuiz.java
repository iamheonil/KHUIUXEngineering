package kh20200204;

import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 구구단 중 입력받은 수의 단수를 출력하여라
//		System.out.print("첫번째 수를 입력해주세요 : ");
//		int a = sc.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			int result = a * i;
//			
//			System.out.println(a + " * " + i + " = " + result);
//		}

		// 어떤 수의 약수를 구하는 프로그램을 작성하여라
		// 약수 = 어떤 수를 정수로 나눌 수 있는 수
		

		// 1에서 1000까지의 정수중에서 4로 나누어도
		// 6으로 나누어도 나머지가 1인 수의 합을 출력하라.
		// > 41916

		// int loopsu;
		// loopsu = sc.nextInt();
		// for (int i = 0; i < 1000; i++) {
		//
		// }

		// 입력받은 두수의 최소 공배수와 최대 공약수를 구하는
		// 프로그램을 작성하라.
		// 최소공배수 = 공배수 중에서 가장 작은 정수
		// 최대공약수 = 공약수 중에서 절대치가 가장 큰 수

		// 1에서부터 입력된 어떤 수까지 내에 있는 소수를
		// 찾는 프로그램을 작성하라.
		// * 소수 = 1 과 자신의 숫자로만 나누어 떨어지는 수
		// * ex) 2,3,5,7,11,13, ...
		
//		System.out.print("수를 입력해보세요 : ");
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

		// Q7. 역순으로다가 56789 ~ 12345
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

		// Q8. 별 찍기
//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
////
//		// Q9. 별 역으로 찍기
//		for (int i = 6; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//		// Q10. 별 5 4 3 2 1 순으로 찍기
//		for (int j = 5; j > 0; j--) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print("*");
//				
//			} j--; System.out.println();
//		}

	}
}
