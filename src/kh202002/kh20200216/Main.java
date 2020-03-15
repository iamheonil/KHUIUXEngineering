package kh202002.kh20200216;

class Parent { 
	   int a = 10; 
	}

class Child extends Parent {
	   int a = 20;
	    void display() {

	        System.out.println(a);

	        System.out.println(this.a);

	        System.out.println(super.a);

	    }
	}

public class Main {
	public static void main(String[] args) {

//		Student stu = new Student("±Ë«Â¿œ", 26, 80, 180, "20200216", 3, 4.5);
//		
//		stu.show();
		
		Child ch = new Child();
		
		ch.display();
		
		
	}
}