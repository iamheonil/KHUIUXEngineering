package kh202001.kh20200130;

public class Source4 {
	public static void main(String[] args) {
		
//		이항연산자 - 산술
//		+ - * / % 
//		% 는 나머지연산자라고 부른다. (modular 혹은 mod) 
		
//		피 연산자 선언과 대입
		int num1 = 17, num2 = 4;
		
//		연산 결과 저장하는 변수
		int result;
		
//		연산 결과
		result = num1 + num2;
//		result = 17 + 4;
//		result = 21;
//		result 변수에 21이 저장된다.
		
		// 나머지 연산자
		int mod = num1 % num2;
		
		System.out.println(result);
		System.out.println("");
		System.out.println("나머지 연산자 부분");
		System.out.println(mod);
		System.out.println("");
		System.out.println("산술 연산자 부분");
		System.out.println(num1 + num2);
		System.out.println("");
		System.out.println("사칙연산 모조리");
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("");
//		형변환
		System.out.println("형변환");
		System.out.println(num1 / num2);
//		(double) 로 형변환을 하게되면 num1 은 17.0 num2는 4.0 이 되어 계산된다.
		System.out.println((double)num1 / (double)num2);
		System.out.println(num1 / (double)num2);
//		int 와 int 를 나누고 싶다면 한쪽만 형변환 해주면 가능하다. 		
	}
}
		
// System.out.println("num1 / num2 : " + num1 - num2);
// -----> 순으로 컴파일이 되기 때문에 문자열 + num 1 - num2 가 되어 컴파일이 불가능하다.
// 그래서 num1 - num2 를 () 안에 넣어 먼저 계산해주고 문자열에 더 하는 방식으로 작성해야한다.
				
// 데이터 형변환(Data Type Casting)
// Casting, TypeCasting	
// 연산은 반드시 피연산자들이 같은 데이터타입일 때만 가능하다.
// 서로 다른 연산자라면 형변환을 하고 연산을 해줘야 한다.
// 연술 연산의 결과는 피연산자의 데이터타입과 같다.		

// 자동형변환(묵시적, 암묵적, 암시적)
// 표현범위가 작은 데이터를 큰 데이터타입으로 사용할 때
//						int / double
// 강제형변환(명시적)
// 표현범위가 큰 데이터를 작은 데이터타입으로 사용할 때
//						double / int

// 자바 자료형의 표현범위 비교
// byte < short < int < long < float < double
// char < int
// boolean 은 아예 형변환도 되지않으며 값도 없기때문에 오로지 참/거짓을 구분하기 위한 논리형변수

// 연산, Operate
// 프로그램이 데이터를 가공하는 것 (컴퓨터의 모든 동작을 연산이라고 표현할 수 있다.)
//
// 연산자, Operator
// 연산을 기호로 나타낸 것을 연산자라고 한다.
// +, -, *, /
//
// 연산자를 구분하는 기준
// 1) 피연산자의 갯수에 따른 분류
// 단항연산자, 이항연산자, 삼항연산자
//
// 2) 기능에 따른 분류
// 산술연산자, 관계, 논리, 대입, 비트, 기타
//
// 피연산자, Operand
// 연산의 대상(값, 상수, 변수 등)