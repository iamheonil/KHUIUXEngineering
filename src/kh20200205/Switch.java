package kh20200205;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		// Switch문, Switch - Case 문
		// 통 틀어 선택문.

//		switch( 비교대상 ) {
//		case 값1 : 
//		case 값2 : 
//		case 값3 : 
//		case 값4 :
//			
//		default :
		// case 의 값은 제한이 없다.
		// 비교대상은 변수를 이용한다.
//		}

//		int num = 10;
//		switch(num) {
//		
//		// num 의 값이 10 이라면, 20 이라면, 30 이라면 해당 Case 를 실행 후 그 아래의 Case, default 를 모두 실행한다.
//		// Case 마다 Break; 를 걸어 해당 Case만 실행되게 한다. 또한 default 는 생략 가능하다.
//		case 10 :
//			System.out.println("10");
//			break;
//			
//		case 20 :
//			System.out.println("20");
//			break;
//			
//		case 30 :
//			System.out.println("30");
//			break;
//			
//		case 40 :
//			System.out.println("40");
//			break;
//			
//		default :
//			System.out.println("디폴트 값");			
//		}

//		int num = 20;
//		// 스위치는 산술 연산(사칙연산까지)이 가능하다. 비교대상은 정수형으로 들어가야 하기때문에.
//		// 사칙연산이 가능하지만 실무에서는 많이 쓰지 않는다.
//		// boolean 형태로 비교대상을 설정하면 안된다.
//		
//		switch (num - 5) {
//
//		case 10:
//			System.out.println("1번 영역");
//			break;
//
//		case 15:
//			System.out.println("2번 영역");
//			break;
//
//		case 20:
//			System.out.println("3번 영역");
//			break;
//			
//		}

		// double, boolean 형 사용 불가능하다.
		// int, char 형 사용 가능하다. String 도 가능하나 사용하지 않는것이 좋다.

//		char c = 'C';
//		switch (c) {
//		case 'A':
//			System.out.println("A입니다.");
//			break;
//		case 'B':
//			System.out.println("B입니다.");
//		default:
//			System.out.println("A, B 둘 다 아닙니다.");
//			break;
//		}

//		int num = 30;
//		
//		if (num == 10) {
//			System.out.println("num 은 10입니다.");
//		} else if (num == 20) {
//			System.out.println("num 은 20입니다.");
//		} else if (num == 30) {
//			System.out.println("num 은 30입니다.");
//		} else {
//			System.out.println("Default");
//		}

		// Switch, else-if 문 둘 다 위와 같은 상황에는 switch, else if 둘 다 똑같이 동작하지만
		// 가독성을 고려하여 코딩할 수 있어야 한다.

		// 스위치는 한계점이 존재하는데.
		// if 문은 아래와 같이 범위 계산이 가능하지만
//		int score = 88;
//		
//		if(score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else {
//			System.out.println("C");
//		}

//		// 스위치는 아래와 같은 범위 계산이 불가능하다.
//		switch(score < 90) { 
//		case 1:
//			System.out.println();
//		}

//		switch (score / 10) {
//		case 10:
//			System.out.println("A");
//			break;
//		case 90:
//			System.out.println("B");
//			break;
//		case 80:
//			System.out.println("C");
//			break;
//		case 70:
//			System.out.println("D");
//			break;
//
//		default:
//			break;
//		}

		// Switch 쿠이즈
		Scanner sc = new Scanner(System.in);
		
		// 필요에 따라 메뉴번호를 상수로도 만들 수 있다.
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		int mKey = 0;

		do {
			System.out.println("============================================");
			System.out.println(" 		M E N U			 ");
			System.out.println("============================================");
			System.out.println("	1. Hello World 출력하기");
			System.out.println("	2. 이름 출력하기");
			System.out.println("	3. 성별 출력하기");
			System.out.println("	4. 종료");
			System.out.println("============================================");
			System.out.println("");
			System.out.print("번호를 입력해주세요. : ");
			mKey = sc.nextInt();
			
//			if (mKey == 1) {
//				System.out.println("Hello World!");
//			}
//			else if (mKey == 2) {
//				System.out.println("김헌일");
//			}
//			else if (mKey == 3) {
//				System.out.println("남자입니다.");
//			}
//			else if (mKey == 4) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			} else {
//				System.out.println("다른 값을 입력해주세요");
//			}
			
			switch (mKey) {
			case HELLO_MENU :
				System.out.println("Hello World!");
				break;
			case NAME_MENU :
				System.out.println("NAME");
				break;
			case GENDER_MENU :
				System.out.println("GENDER");
				break;
			case EXIT_MENU :
				System.out.println("BYE");
				break;
			default :
				System.out.println("다른 수 입력하세요.");
			}

		} while (mKey != 4);




//		
//		switch (mKey) {
//		case HELLO_MENU:
//			System.out.println("Hello World!");
//
//		case NAME_MENU:
//			System.out.println("김헌일");
//
//		case GENDER_MENU:
//			System.out.println("남자입니다.");
//
//		case EXIT_MENU:
//			System.out.println("프로그램을 종료합니다.");
//			break;
//		default:
//			System.out.println("다른 값을 입력하였습니다.");
//		}

	}
}
