package kh20200203;

import java.util.Scanner;

public class IfBasicQuiz {
	public static void main(String[] args) {

//		 + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//			>> Input Number : -3
//			>> 음수입니다
//
//		 + 입력한 데이터가 3의 배수인지 판별하시오
//		  (% 연산자 사용)
//			>> Input Number : 7
//			>> 3의 배수가 아닙니다
//
//		 + 두 수를 입력 받아 큰 수를 출력하시오
//			>> Input Number1 : 44
//			>> Input Number2 : 88
//			>> 88 이 더 큰 수
//
// =============================================================================
		
		
		Scanner sc = new Scanner(System.in);
		
//		1번 
//		System.out.print("숫자를 입력하세요 : ");
//		int result = sc.nextInt();
//		
//		if (result < 0) {
//			System.out.println("음수입니다.");
//		} else
//			System.out.println("양수입니다.");
//		System.out.println("");
		
		
		
//		2번
//		System.out.print("판별할 수를 입력하세요 : ");
//		int result = sc.nextInt();
//		// % (나머지 연산) 연산자를 사용할 것.
//		if (result % 3 == 0 && result != 0) {
//			System.out.println("3의 배수가 맞습니다.");
//		} else 
//		System.out.println("3의 배수가 아닙니다.");
//	}

		
//		3번
		System.out.print("A의 값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("B의 값을 입력하세요 : ");
		int b = sc.nextInt();
		if(a > b) {
			System.out.println("A가 더 큰 값입니다.");
		} else if (a == b){ 
			System.out.println("두 수가 같습니다.");
		} else
			System.out.println("B가 더 큰 값입니다.");			
		
		
//		0까지 출력해보기
//		System.out.println("판별할 수를 입력 : ");
//		int result = sc.nextInt();
//		if (result < 0) {
//			System.out.println("음수입니다.");
//		} else if (result == 0) {
//			System.out.println("0입니다 이건");
//		} else {
//			System.out.println("양수입니다.");
//		}
		
	}
}