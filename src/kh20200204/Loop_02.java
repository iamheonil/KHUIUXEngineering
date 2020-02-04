package kh20200204;

public class Loop_02 {
	public static void main(String[] args) {

		// 제어문 중첩 시키기.
		// if 안의 if 또 쓰는식?

//		int num = 11;
//		if (num >= 1) {
//			System.out.println("1보다 크거나 같다.");
//			
//			if (num <= 100) {
//				System.out.println("1보다 크거나 같다.");
//				System.out.println("100보다 작거나 같다.");
//			
//				System.out.println("1~100 사으이 정수");
//			}
//			
//			System.out.println("1보다 크거나 같다.");
//
//		}
//		// for문 안의 if문
//		// 
//		for (int i=0; i<10; i++) {
//			if (i % 2== 0) { // 짝수
//				System.out.println("쫙수 : " + i);
//			}
//		}
//		

//		// for 중첩, 반복안의 반복
//		// 안쪽부터 차례대로 실행된다.
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				for (int n = 0; n < 3; n++) {
//					System.out.println("i : " + i + " " + "j : " + j + " " + "n : " + n);
//				}
//
//				System.out.println("====");
//			}
//		}
//		// 반복문 중첩 시 고려사항
//		// 바깥쪽 Loop 반복자(변수)의 진행에 맞춰서
//		// 안쪽 Loop의 반복자(변수)가 진행되는 과정을 생각해야한다.
//		// 바깥쪽, 안쪽 두 반복문이 받는 영향을 고려 해야한다.

//		중첩 for loop 
//		2~9단까지 구구단

//		// 구구단 출력해보기 2단 ~ 9단
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println("");
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
//		for (int j = 1; j < 6; j++) {
//			System.out.print(i);
//		}
//		System.out.println(i);
//	}

		// Q5.
//		int j = 0;
//		for (int i = 1; i < 6; i++) {
//			for (j = 1; j < 5; j++) {
//				System.out.print(j);
//			}
//			System.out.println(j);
//		}

		// Q6.
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			for (int j = 1; j <= 5; j++) {
//				j = i;
//				System.out.print(j);
//				
//			}
//		}
		
//		// Q8.
//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

	}
}