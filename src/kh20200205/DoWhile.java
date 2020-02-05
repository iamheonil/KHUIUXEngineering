package kh20200205;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		// do - while Loop
		
//		int i = 0;
//		do {
			
			// do의 반복 수행 코드작성란
			// do 는 무조건 1번 실행하고 그 다음부터 조건검사를 하고 
			// 반복 수행을 할지 말지 결정한다.			
			// 일단 실행을 시키고 난 뒤 조건 검색을 할 수 있는 상황
			
		
//			System.out.println("시랭?");
//			i++;
//		} while( i <= 5 );
				// while(조건)을 괄호 옆에 넣게 되고 괄호를 받고 세미콜론을 써주게 된다.
		

//		메뉴 선택 반복문
		
//		do {
//			// 메뉴를 보여주고, 메뉴 선택 후 종료 버튼을 선택하지 않으면 계속 반복 하게 된다.
//			// 
//			
//		} while();
		// 종료 버튼을 선택하지 않았을 경우
		
//		int i = 0; // 초기식
//		do {
//			System.out.println(i);
//			
//			i++;
//		} while(i < 5);
		
		Scanner sc = new Scanner(System.in);
		
		int input; // 사용자가 입력한 값을 저장하는 변수
		int sum = 0; // 총 합계
//		
//		do {
//			System.out.print("값을 입력하세요(0을 입력하면 종료됩니다.) : ");
//			input = sc.nextInt();
//			
//			sum += input;	// 누적 합계
//			
//			
//		} while(input != 0);
//		
//		System.out.println("누적 : " + sum);
		
		do {
			System.out.print("값을 입력하세요(0을 입력하면 종료됩니다.) : ");
			input = sc.nextInt();
			
			sum += input;	// 
			
			if(input == 0) {
				break;
			}
		} while(true); // 무한룹
		System.out.println("누적 : " + sum);
		
		
		
	}
}
