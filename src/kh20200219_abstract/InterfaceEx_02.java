package kh20200219_abstract;

// 인터페이스 숨겨진 기능들 정리.



public class InterfaceEx_02 {
	public static void main(String[] args) {

		Child c = new Child();
		c.out();
		
		
		// extends 한 부모 클래스가 된다.
		Parent p;
		p = new Child();
		
		p.out();	// 동적 바인딩으로 인하여 자식 클래스 출력
		
		Inter_01 i01;	// 인터페이스 객체 변수
		i01 = new Child();	// 부모 인터페이스 <- 자식 클래스
		i01.out();	// 동적 바인딩으로 인하여 자식 클래스 출력
		// 추상메소드여도 interface01 에 out 메소드가 존재해야 바인딩 자체가 가능해진다.
		// 없다면 컴파일 자체가 안된다.
		
		Inter_02 i02 = new Child();
		i02.out();	
		
	}
}
