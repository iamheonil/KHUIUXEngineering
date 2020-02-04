package kh20200204;

public class Loop {
	public static void main(String[] args) {

		// Loop 반복문.
		// for, while, do-while 
		
		
		// for ( ; ; )
		// for (초기식; 조건식; 증감식) 순으로 작성하여야 하고
		// { } 안에는 반복해서 수행할 코드를 작성하는 영역이다.
		// 조건식이 참일 때 수행한다.
		
		// for 문의 수행순서
		// 1. 초기식 수행
		// 2. 조건식 판별
		// 	2-1. true일 때 3번 수행
		//	2-2. false일 때 for문 종료
		// 3. 조건식이 true 라면 반복코드를 1회 수행한다.
		// 4. 수행하고 난 뒤 증감식(++, --) 를 수행한다.
		// 5. 2번으로 가서 다시 내리막 시작.
		// 6. 조건식을 만족할 때까지 반복.
		
		// int i = 0으로 선언, i가 5보다 커질때까지 반복문을 실행한다.
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		
		// i가 0부터 10보다 작은 동안 1씩 증가하며 반복
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// for (int i = 10; i >= 1; i--)
		// i 변수가 10인데 1과 같거나 클 때 까지 1씩 감소하면서 진행.
		// 반복 횟수 : 10번 
		// 반복 구간 : 10 ~ 1까지
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
}
