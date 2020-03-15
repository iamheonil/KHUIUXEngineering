package kh202002.kh20200210_defaultTest;

import kh202002.kh20200210.Class_02;

// 건물을 실체화하는 부분



public class Main_02_default {
	public static void main(String[] args) {

		Class_02 cl = null;		// 참조형 객체 변수 선언
								// 참조형은 배열때도 나왔던 얘기지만
								// 주소를 지정해주는 그런 역할이다.
		
		cl = new Class_02();	// 객체 생성, 실체화(인스턴스화)
		
		System.out.println(cl.num4);		// public
//		System.out.println(cl.num3);		// protected
//		System.out.println(cl.num2);		// default
//		System.out.println(cl.num1);		// private
		
		
	}
}