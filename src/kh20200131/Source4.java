package kh20200131;

import java.util.Scanner;
import java.util.function.IntPredicate;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Source4 {
	public static void main(String[] args) {

// 스캐너
// 키보드의 입력을 받아서 변수에 저장할 수 있도록 기능을 제공하는 클래스
// 
// 
// 
		// 변수 선언
		int num;
		
		// 입력 기능이 들어간 객체 선언
		Scanner input;
		
		// 생성자
		input = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : " );
		// 입력한 문자열을 처리하는 메소드
		String result = input.nextLine();
		String result2 = input.nextLine();
		
		System.out.println(result + "\n" + result2);
		
	
	}
}