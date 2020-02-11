package kh20200211_method;

// 설계를 담당한다.

//  	+ package
//		java06_class.method.quiz
//
//		+ 클래스 작성하기
//		1. 기능 클래스 ( class Calculator )
//		- 기능 : 사칙연산 계산기
//		- 메소드 4개
//			sum, sub, mul, div
//		- 매개변수 : 정수 2개
//		- return : 정수 (단, div는 double)
//
//		2. 실행 클래스 ( class CaculatorEx )
//		- 기능 : 계산기 기능클래스를 이용
//
//		정수2개와 연산자 1개를 입력받음 (Scanner 이용)
//		switch로 구분하여 계산기클래스 이용하기
//
//		ex) switch( operator ) {
//		case '+':
// 	 	System.out.println(n1+"+"+n2+"="+calc.sum(n1,n2));
// 		break;


public class Calculator {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}

	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	public double div(int n1, int n2) {
		return n1 / (double) n2;
	}

	
}
