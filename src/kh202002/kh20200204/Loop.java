package kh202002.kh20200204;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Loop 반복문.
		// for, while, do-while

		// for ( ; ; )
		// for (초기식; 조건식; 증감식) 순으로 작성하여야 하고
		// { } 안에는 반복해서 수행할 코드를 작성하는 영역이다.
		// 조건식이 참일 때 수행한다.

		// for 문의 수행순서
		// 1. 초기식 수행
		// 2. 조건식 판별
		// 2-1. true일 때 3번 수행
		// 2-2. false일 때 for문 종료
		// 3. 조건식이 true 라면 반복코드를 1회 수행한다.
		// 4. 수행하고 난 뒤 증감식(++, --) 를 수행한다.
		// 5. 2번으로 가서 다시 내리막 시작.
		// 6. 조건식을 만족할 때까지 반복.

		// int i = 0으로 선언, i가 5보다 커질때까지 반복문을 실행한다.
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}

		// i가 0부터 10보다 작은 동안 1씩 증가하며 반복
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}

		// for (int i = 10; i >= 1; i--)
		// i 변수가 10인데 1과 같거나 클 때 까지 1씩 감소하면서 진행.
		// 반복 횟수 : 10번
		// 반복 구간 : 10 ~ 1까지
//		for (int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}

		// for (int i = 0; i < 10; i+=)
		// i 변수가 0부터 시작하여 2씩 증가하며 10보다 커질 때까지 증가하면서 진행.
		// 반복 횟수 5번
		// 반복 구간 0부터 10까지(0 2 4 6 8)
//		for (int i = 0; i < 10; i+=2) {
//			System.out.println(i);
//		}

		// "Hello" 를 7번 출력하시오.
		// i가 0부터 7보다 작은동안에 1씩 증가하면서 반복,
		// i가 0부터 6보다 작거나 같은 동안 1씩 증가하면서 반복,
		// 위의 방법이 좀 더 보기가 좋고 추천하는 방법.
//		for (int i = 0; i < 7; i++) {
//			System.out.println("Hello");
//		}

		// 1부터 10까지 총합 구하기
		// - > 55
//		int sum = 0; // 쓰레기 값 조심해야한다.
//
//		for (int i = 1; i <= 10; i++) {
//
//			// 안쪽에다가 sum 을 정의하고 대입하는 경우도 있는데
//			// 절대로 그러면 안된다.
//
//			sum += i;
//		}
//		System.out.println(sum);

		// 구구단 출력해보기 2단
//		int gugudan = 2;
//		for (int i = 1; i <= 9; i++) {
//			
//			int sum = gugudan * i;
//			System.out.println("2 x"+ " "+ i + " = " + sum);
//		}
//		
//		// 구구단 입력받아서 하는거는 스캐너?
//		System.out.print("첫번째 수를 입력해주세요 : ");
//		int a = sc.nextInt();
////		System.out.println("두번째 수를 입력해주세요 : ");
////		int b = sc.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			int result = a * i;
//			
//			System.out.println(result);
//		}
				
		// 첫날에 10원을 다음날엔 2배를 예금하는 방식으로 보름동안 저축한 금액은?
		// 답은 327670이 출력되어야 한다.
		
//		// 초기 입금 10원
//		int first = 10; // 쓰레기 값 조심해야한다.
//		int sum = 0;		
//		for (int i=1; i<=15; i++) {
//			
//			sum += first;
//			first *= 2;
//					
////			System.out.println(sum);
//		}
//		System.out.println("저축한 총 금액 : " + sum + "원");
//	
		

		
		
	}
}