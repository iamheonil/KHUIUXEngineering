package kh202002.kh20200217;



class Parent4 {
	protected int num;
	
	public Parent4() {
		System.out.println("부모 디폴트 생성자");
	}
	
	public Parent4(int num) {
		this.num = num;
		System.out.println("부모 오버로딩 생성자 " + num);
	}
}

class Child4 extends Parent4 {
	// super() -> 슈퍼 생성자, 생략되어 있음.

	public Child4() {
		this(999);
		System.out.println("자식 디폴트 생성자");
	}

public Child4 (int num) {
//	this.num = num;
	// super() -> 슈퍼 생성자, 생략되어 있음.
	// Child4 내에 num 변수가 없어서 super 영역에서 찾는다.
	
	super(num);
//	this(999);

//	super.num = num;
	System.out.println("자식 오버로딩 생성자 " + num);
	}
}

public class InheritEx_04 {
	public static void main(String[] args) {

		Parent4 p4 = new Parent4();
		System.out.println();
		Child4 c4 = new Child4();
		System.out.println();
		Parent4 p2 = new Parent4(123);
		System.out.println();
		Child4 c2 = new Child4(456);
		
	}
}