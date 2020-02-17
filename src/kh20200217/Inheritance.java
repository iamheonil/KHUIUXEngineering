package kh20200217;

public class Inheritance {

	// 상속
	// 목적 : 클래스 코드의 재사용
	// 		- 기존의 클래스 코드가 있어야한다.
	//		- 코드의 재사용 : 기존의 코드를 이용하여 새로운 코드를 개발하는 것.
	//							(필요한 부분은 수정, 추가하기도 한다.)
	//		- 클래스의 중복되는 코드를 하나의 클래스로 관리할 수 있게 해준다.
	//		- 상속을 주는 클래스의 코드를 변경하면 상속을 받는 클래스들 전부 반영된다.

	
	//		- 상속을 주는 클래스 : 부모 클래스, super() 클래스, 상위 클래스, Based(기준이 되는)
	//		- 상속을 받는 클래스 : 자식 클래스, 서브 클래스, 	하위 클래스, Derived(유도된, 파생된)
	
	// 상속의 문법
	class Parent {
		int n1;
		int n2;
		String name;
		
	}
	
	class Child extends Parent {	// extends Parent <- 상속
		
		
	}
	
	
}
