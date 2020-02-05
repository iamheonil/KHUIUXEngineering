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
//		System.out.print("A의 값을 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.print("B의 값을 입력하세요 : ");
//		int b = sc.nextInt();
//		if(a > b) {
//			System.out.println("A가 더 큰 값입니다.");
//		} else if (a == b){ 
//			System.out.println("두 수가 같습니다.");
//		} else
//			System.out.println("B가 더 큰 값입니다.");			
//		
		
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
		
		
		//if ~ else if ~ else 응용해서 풀어보기
	      
		
//      +세 수를 입력 받아 가장 큰 수를 입력하시오
//		int num1, num2, num3;
//		System.out.print("1번째 수 입력 : ");
//		num1 = sc.nextInt();
//		System.out.print("2번째 수 입력 : ");
//		num2 = sc.nextInt();
//		System.out.print("3번째 수 입력 : ");
//		num3 = sc.nextInt();
//		if (num1 > num2 && num1 > num3) {
//			System.out.println(num1);
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println(num2);
//		} else {
//			System.out.println(num3);
//		}

//		1에서 1000까지 4로, 6으로 나누어도 나머지가 1인수의 합
//		int div;
//		div = sc.nextInt();
//		
//		int sum = (div % 4);
//		System.out.println(sum);
		
		int div;
		for(int i = 0; i <= 1000; i++) {
			
			System.out.println(i);
		}
		
	      
//     +세 과목의 성적을 입력받아 합계와 평균을 구하고 
//     평균이 90이상아묜 "A", 80이상이면 "B"
//     70이상이면 "C", 60이상이면 "D", 60미만이면  "F"를 출력하시오
//		int num1, num2, num3;
//		System.out.println("1번째 성적 입력 : ");
//		num1 = sc.nextInt();
//		System.out.println("2번째 성적 입력 : ");
//		num2 = sc.nextInt();
//		System.out.println("3번째 성적 입력 : ");
//		num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		double div = sum / (double) 3;
//		
//		if (div >= 90) {
//			System.out.println("A입니다.");
//		} else if (div < 90) {
//			System.out.println("B입니다.");
//		} else if (div < 80) {
//			System.out.println("C입니다.");
//		} else {
//			System.out.println("F입니다.");
//		}
		
     
	}
}