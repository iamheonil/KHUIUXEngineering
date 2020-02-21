package kh20200221_tokenize;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {

		// String.split() 메소드

		String data1 = "Hi Hello Hola";
		// " " 구분자로 적용하여 data1 문자열을 토근화한다.
		//
		//

		String[] tokens = data1.split(" ");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}

		System.out.println("\n");

		// 단일문자가 아닌 구분자도 사용할 수 있다.
		String data2 = "i%!am%!iron%!man";

		String[] token2 = data2.split("%!");
		for (int i = 0; i < token2.length; i++) {
			System.out.println(token2[i]);
		}

		System.out.println("\n");

		// [%! ] 의미는 "%", "!", " " 중 하나라도 만족하면 true
		// OR과 비슷하다.
		String data3 = "I%am!iron man";
		String[] token3 = data3.split("[%! ]");

		for (int i = 0; i < token3.length; i++) {
			System.out.println(token3[i]);
		}

		System.out.println("====================================================================");
		// StringTokenizer 클래스

		// 생성자 StringTokenizer(문자열, 구분자)
		StringTokenizer st1 = new StringTokenizer(data1, " ");

		System.out.println("토큰 수 : " + st1.countTokens());

		while (st1.hasMoreTokens()) { // hasMoreTokens 이 boolean 형식이라 와일문에 넣어도 가능.
										// 실행 가능한 토큰을 파악하고 true, false 를 반환하기 때문에
										// 다음 토큰이 없어 false 를 반환하는 동시에 반복문 종료.

			System.out.println("내용 : " + st1.nextToken());
		}

		// StringTokenizer 의 주요 메소드
		// public int countTokens() -> nextToken()이 실행될 수 있는 횟수를 반환한다.
		// nextToken()을 호출하면 반환되는 값이 줄어든다.

		// public boolean hasMoreTokens() -> nextToken()이 실행 가능한 지 boolean 값을 반환해준다.
		// 다음 토큰이 있으면 true, 없으면 false를 반환한다.

		// public String nextToken() -> 다음 토큰을 반환한다.
		// !

		System.out.println();
		
		StringTokenizer st2 = new StringTokenizer(data2, "%!");

		for (int i = 0; i < 4; i++) {
		}

		System.out.println("토큰 내용 : " + st2.nextToken());
		System.out.println("토큰 내용 : " + st2.nextToken("%")); // 구분자 변경 후 적용
		System.out.println("토큰 내용 : " + st2.nextToken());
		System.out.println("토큰 내용 : " + st2.nextToken());

		System.out.println();
		
		StringTokenizer st3 = new StringTokenizer(data3, "%! ");
//		StringTokenizer st3 = new StringTokenizer(data3, "[%! ]"); 정규 표현식을 알고 있다면 이 방법이 더 좋다.
		
		while (st3.hasMoreTokens()) {
			System.out.println("토큰 내용 : " + st3.nextToken());
		}
		
	}
}