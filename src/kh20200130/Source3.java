package kh20200130;

public class Source3 {

	public static void main(String[] args) {
		
		// String(문자열) - char의 나열, 문장을 표현하는 데이터 타입.
		
		String fruit;			// String 변수 선언
		fruit = "Apple";		// 변수에 값을 대입
		System.out.println(fruit);			// 출력

	
		// 중복으로 선언이 가능
		fruit = "Banana";
		System.out.println(fruit);
		
		fruit = "Grape";
		System.out.println("과일명 : " + fruit);
		
	}

}