package kh202002.kh20200210;

// 실행 클래스:
// main() 메소드를 가지고 있는 클래스


public class Main_01 {
	public static void main(String[] args) {

		int num;
		
//
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();
//		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
		c05.num = 500;
		
		Class_01 c01;	// Class_01 의 타입의 객체 변수 선언. (참조형 변수)
		c01 = new Class_01();
						// () 은 문법상, 변수의 데이터 타입과 new 뒤에 오는 데이터타입이 동일해야한다.
						// Class 타입의 객체(인스턴스) 생성
		
		c01.str = "Apple";	// 멤버필드 str에 값을 대입.
		c01.num = 5000;		// 멤버필드 num에 값을 대입.
		
		System.out.println(c01.str);
		System.out.println(c01.num);
		
		// c01 객체의 메소드 중 하나인 display 사용 (호출, Call) 
		c01.display();
		// 메소드를 호출할 때에는 메소드명을 적고 '( )' 괄호를 붙인다.
		
		
		
	}
}