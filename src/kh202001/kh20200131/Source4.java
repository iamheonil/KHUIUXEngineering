package kh202001.kh20200131;

import java.util.Scanner;

public class Source4 {
	public static void main(String[] args) {

// 스캐너
// 키보드의 입력을 받아서 변수에 저장할 수 있도록 기능을 제공하는 클래스

		// 변수 선언
		int num;

		// 입력 기능이 들어간 객체 선언
		Scanner input;

		// 생성자
		input = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		// 입력한 문자열을 처리하는 메소드
		String result = input.nextLine();
//		String result2 = input.nextLine();
							// "\n" +  + result2
		System.out.println(result + "\n");
		
		System.out.println("아래는 nextInt()");
		System.out.println("");
		
		System.out.print("숫자를 입력하세요. : ");
		int resultInt = input.nextInt();
		System.out.println(resultInt);
		
// Scanner의 주요 기능(메소드)
// nextLine() : 문자열 한 줄을 입력받아 String 타입으로 반환한다.
// next() : 문자열 한 개를 입력받아 String 타입로 반환한다. 
// netxInt() : 입력한 내용 중 int타입을 찾아 int타입으로 반환한다
// nextBoolean() 
// nextByte() 
// nextShort()
// nextLong()
// nextFloat()
// 
// char 형 입력 전용 기능(메소드)은 없다.
// nextLine() 을 이용하여 문자열을 입력받아 char 형으로 변환하여 사용.
// 		
// 		
// 		
// 		
// 		

	}
}