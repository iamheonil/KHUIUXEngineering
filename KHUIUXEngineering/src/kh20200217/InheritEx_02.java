package kh20200217;

// 부모 클래스타입이 자식클래스타입을 무조건 받아준다.
class Parent2 {
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
	}
		
}

class Child2 extends Parent2 {
		
	@Override
		public void display() {
			
			num = 100;
			System.out.println("오버라이딩 메소드");
		}	
	
	public void print() {
		System.out.println("자식 메소드");
	}
}


public class InheritEx_02 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		
		c.num = 123;
		c.display();
		
		Parent2 p = new Parent2();
		
		p.num = 333;
		p.display();
		
		Parent2 pc = new Child2();	// Parent2 <= Child2 를 저장
		
//		Child2 cp = (Child2) new Parent2();
		// 부모 클래스타입이 자식클래스타입을 무조건 받아준다
		// 반대는 안된다.
		// ClassCastException
	
		pc.display();	// child2 의 메소드 호출		-> 얘는 동적
		pc.num = 50;	// Parent2 의 변수 사용			-> 얘는 정적
		
		((Child2)pc).display();	// 요상한 코드야~
	}
}


