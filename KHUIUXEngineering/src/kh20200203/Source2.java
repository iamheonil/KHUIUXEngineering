package kh20200203;

import java.util.Scanner;

public class Source2 {
	public static void main(String[] args) {

//		문자열 입력 처리 메소드
//		nextLine(), next();
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
//		문자열 입력 받아 Str1 출력하기
		System.out.print("문자를 입력하세요 : ");
		str1 = sc.nextLine();
		System.out.print("입력하신 Str1 은 : " + str1 + "\n");
//		문자열 입력 받아 Str2 출력하기
		System.out.print("문자를 입력하세요 : ");
		str2 = sc.next();
		System.out.print("입력하신 Str2 는 : " + str2 + "\r");
		System.out.println("띵");
		
//		nextLine() 과 next() 의 차이점은 띄어쓰기 차이인데
//		nextLine() : 엔터키를 기준으로 문자열을 구분한다. (가나 다라 마바사 는 "가나 다라 마바사"로 출력) 
//		next() : 공백문자를 기준으로 문자열을 구분한다. (가나 다라 마바사를 "가나" "다라" "마바사"로 출력한다.
//		띄어쓰기를 포함한 한줄을 입력 받으려면 nextLine()이 좋다. 통상적으로 nextLine()을 많이 쓴다.

//		띄어쓰기(공백문자)란? // White Space Character
//		띄어쓰기, 줄바꿈, 탭, 엔터키
//		띄어쓰기 : ' ', (ASCII 32번 - 공백)
//		개행(줄바꿈 - 엔터키) : '\n', (ASCII 10번)
//		탭, 수평탭 : '\t', (ASCII 9번)
		
//		개행은 운영체제에 따라서 \r, \n 을 사용하고 조합 방법이 달라진다
//		\r : CR, carraige Return  	 / 엔터키를 누르면 처음부분(<-) 으로 땅겨주는거
//		\n : LF, Line Feed, New line / 타자기와 같은 방식 처음부분으로 당기지 않고 한 줄 아래로 줄을 내려준다.
//		윈도우는 CR, LF 같이 사용 한다.
//		리눅스는 \n 만 사용한다.
//		Mac OS는 \n 만 사용한다.

		
	}
}
