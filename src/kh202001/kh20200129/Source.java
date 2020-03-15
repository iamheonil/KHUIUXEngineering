// 패키지 명
package kh202001.kh20200129;

public class Source {
	
	// 메인 메소드 Start Point
	public static void main(String[] args) {
		
			// 콘솔창에 Hello World 출력
			System.out.println("Hello World!");
						
			int number;
			number = 100;
			
			char ascii; // char 에 아스키코드 대입하면 프린트 시 해당코드가 나온당
			ascii = 126;
			
			System.out.println(number);
			System.out.println(ascii);
	}
	
} // End Point

// 자료형, 데이터 타입, Data Type
// 컴퓨터가 데이터를 표현하는 정해진 형식.
// 데이터는 메모리에 저장된다.

// 자바의 기본 데이터타입
// 정수형(소수점 이하 표현하지 않는 숫자 1, 2, 3, 4, 5...), 
// byte, 		short, 			int, 		long -> 숫자를 표현할 때 거의 int 를 사용한다.
// 1byte,	 	2byte,	 		4byte,		 8byte
// -128~127,	약-3만~3만    	-21억~21억,	'경' 단위

// 실수형(소수점을 표현하는 숫자 x.123456789...)
// float, double - > 실수는 double 을 사용한다.
// 4Byte, 8Byte

// 문자형(위의 정수형과 같은 처리방식)
// char(캐릭터) -> 유니코드를 사용한다.
// 2Byte -> 유니코드를 표헌하기 위해서는 최소 2Byte가 필요하다.

// 논리형
// boolean
// 1Byte
// 참과 거짓 true, false

////////////////////////////////////////////////////////////////////////
// 수를 표현할 땐 int, 소수를 표현할 땐 double, 문자는 char, T,F는 boolean 
////////////////////////////////////////////////////////////////////////

// 변수
// 데이터를 저장하는 메모리의 공간
// 저장할 수 있는 데이터의 형식을 위의 데이터 타입을 대입하여 사용한다.
// 변수는 한번에 한 개의 데이터만 저장 가능하다. 중복삽입(?)이나 여러개를 집어 넣을 수 없다.

// 변수 선언, Declaration
// 프로그램에서 사용하려는 변수를 할당받는 코드
// 자료형 변수명;
// int age;

// 변수 대입, Assign
// 선언된 변수에 데이터를 저장하는 것
// age = 25;

// 문자형 데이터 처리 방식
// 모든 문자에 대한 숫자코드를 부여하고 컴퓨터에 예약해놓는다.
// 데이터타입에 따라서 해당 숫자가 정수인지 문자인지 판단할 수 있도록 한다.
// ASCII, UNICODE
// ASCII - 영어 대, 소문자, 숫자, 특수기호, 가상키들을 코드화 시킨 표
// UNICODE - ASCII를 포함하고 있으며, 영어권 나라가 아닌 나라(한국, 일본, 중국)에서 문자를 표현할 수 있게 확장한 개념
// UNICODE - UTF-8, EUC-KR, MS949(CP949) 중 하나를 사용하여 글자를 표현한다.

// Oracle Java 8 API Documentation
// https://docs.oracle.com/javase/8/docs/api/

// 오늘의 단어
// API - Application Programming Interface / 프로그램을 개발하기 위해 준비된 코드들
// JDK - Java Development Kit / 자바 개발 도구 javac / 자바언어를 이용해서 프로그램을 개발하기 위한 API와 환경을 구성하는 프로그램
// JRE - Java Runtime Environment / 자바 실행 환경 java(JVM) / 자바 프로그램이 실행되기 위해 필요한 환경

//	컴파일러와 인터프리트의 차이점과 장단점
//	컴파일(Java)은 한번에 모든것을 스캔하고 통 번역을하고
//	인터프리터(C기반)는 한줄씩 스캔하기 때문에 인터프리터가 속도면에서는 유리하다.
//	
//	컴파일은 사전 실행과정이 오래걸리지만 유지보수, 사용자 입장에서 매우 편하고
//	인터프리터는 당장 필요한 것을 번역하기에 사전 실행과정이 필요없다.
//	하지만 요청을 받으면 당장 번역을 하기때문에 버벅일 수도 있다.