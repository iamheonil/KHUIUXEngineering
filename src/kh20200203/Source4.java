package kh20200203;

import java.util.Scanner;

public class Source4 {
	public static void main(String[] args) {

// 제어문 시작.
// Control Statement
// 프로그램의 정상적인 흐름을 제어하는 구문
// ? 정삭적인 흐름 : main() 메소드에서 시작하여 코드 한 줄씩 끝까지 수행되는 것 		
// 프로그램의 흐름을 개발자가 원하는 방향으로 제어할 수 있다.

// 제어문의 종류
// 조건문(Condition Statement)
// if, else if, else

// 반복문(Loop)
// for, while, do while		

// 선택문(Select)
// switch

// 조건문(if)

//		if (10 > 10) {
//		 조건식이 true 라면 실행, 아니라면 넘어간다
//		}
// 		조건문은 결과가 true, false(boolean)으로 판별가능한 연산식
//		Ex) num < 10
		
//		if (false) {
//			System.out.println("출력?");
//		}
//		System.out.println("여기는 바깥 if");
//		조건문은 true 일 경우만 안쪽의 코드를 실행하고 아니라면 바깥 부분의 코드를 실행한다.
		
		int num = 10;
		
		if (num == 10) {
			System.out.println("Hi");
		}
		System.out.println("Hello");
		
		System.out.println("");
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		
		System.out.println("");
		
		// 제어문 전부 다 제어문 다음에 오는 한개의 요소(코드)에만 영향을 준다!
		if(false)
			System.out.println("if문");
			System.out.println("if문 밖");
		
			System.out.println("");
		
		if(true) { 
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		System.out.println("if문 밖");
		
		System.out.println("");
		
		
		// 제어문에 실수로 ; 붙이는건 유의해야한다.
		if(false); { 
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
		}
		
		// 제어문은 {} 없이 코드 한 개를 제어하기도 하고 {} 있는 코드 그룹 한 개를 제어하기도 하는데
		// 개발자는 반드시 코드가 한 줄이어도 {} 를 사용해야한다. 이게 국룰
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input == 10) { 
			System.out.println("입력값은 10 이 맞습니다.");
		}
		if(input != 10) {
			System.out.println("입력값은 10이 아닙니다.");
		}
		
				
	}
}