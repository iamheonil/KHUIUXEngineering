package kh20200219;

class Person { 
	
	void display() {
		System.out.println("Person");
	}
}

class Child extends Person {
	
	void display() {
		System.out.println("Child");
	}
}

public class Practice {
	public static void main(String[] args) {
		Person p1 = new Person();
		Child c1 = new Child();
		Person child = new Child();
		 
		
		p1.display();
		c1.display();
		child.display();
	}
	
	// 동적 바인딩으로 인하여 Person Child = new Child() 의
	// display() 는 Child가 출력.
	
}
