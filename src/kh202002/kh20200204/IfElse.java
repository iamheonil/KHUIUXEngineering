package kh202002.kh20200204;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 제어문 if, else 시작!
		
//		3의 배수를 구해보자.
		
//		System.out.print("판별할 수를 입력하세요 : ");
//		int result = sc.nextInt();
//		// % (나머지 연산) 연산자를 사용할 것.
//		if (result % 3 == 0 && result != 0) {
//			System.out.println("3의 배수가 맞습니다.");
//		} else 
//		System.out.println("3의 배수가 아닙니다.");
		
		
//		홀수, 짝수인지 구해보자.
		
//		System.out.print("판별할 수를 입력하세요. : ");
//		int result = sc.nextInt();
//		if (result % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		
		int num = 5;
		if ( num > 0 ) {	// 양수
			System.out.println("양수");
		} else {	// 음수라고 생각하기 쉽지만, num 이 작거나 같다기 때문에 0 이나 음수이다.
			System.out.println("음수 or 0");
			System.out.println("양수가 아닙니다.");
		}
		
	}
}