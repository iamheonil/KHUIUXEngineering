package kh20200217;


class Parent {
	String name;
	int num;
	
	
	public void display() {
		System.out.println("부모 클래스의 메소드입니다.\n" + name + " " + num);
		
		System.out.println("");
	}
}

class Child extends Parent{
	int score;
	
	public void print() {
		System.out.println("자식 클래스의 메소드입니다.\n" + name + " " + num +  " " + score);
	}
	
	public void display() {
		System.out.println("메소드 재정의, 오버라이딩");
	}
	
}

// 메소드 오버로딩(Method OverLoading)
//	- 메소드 중복정의
//	- 같은 이름의 메소드를 매개변수나 갯수나 타입을 다르게 하여 다른 메소드를 정의하는것.

// 메소드 오버라이딩(Method OverRiding) - 상속받은 클래스의 메소드를 덮어씌어 새롭게 만든다.
//	- 메소드 재정의
//	- 상속받은 메소드를 자식클래스가 새롭게 정의하는 것.

public class InheritEx_01 {
	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		
		p.name = "Alice";
		p.num = 123;
		p.display();
		
		c.name = "Bob";
		c.num = 123;
		c.score = 456;
		c.print();
		c.display();
		
		
	}
}
