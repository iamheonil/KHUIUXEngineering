package kh20200217;

class Parent5 {

	public void display() { 
		System.out.println("부모 디폴트 생성자");
	}
}

class Child5 extends Parent5{
//final class Child5 extends Parent5 { final 이 붙게되면 상속 불가능
	@Override
//	public final void display() {
	public void display() {
		System.out.println("자식 클래스 오버라이딩");
	}
	
}

class GrandChild extends Child5 {
	
	@Override
	public void display() {
		System.out.println("2번 재정의된 메소드");
	}
}

public class InheritEx_05 {
	public static void main(String[] args) {

		GrandChild gc = new GrandChild();
		
		gc.display();
	}
}
