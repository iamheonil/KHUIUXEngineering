package kh202002.kh20200217;



class Parent4 {
	protected int num;
	
	public Parent4() {
		System.out.println("�θ� ����Ʈ ������");
	}
	
	public Parent4(int num) {
		this.num = num;
		System.out.println("�θ� �����ε� ������ " + num);
	}
}

class Child4 extends Parent4 {
	// super() -> ���� ������, �����Ǿ� ����.

	public Child4() {
		this(999);
		System.out.println("�ڽ� ����Ʈ ������");
	}

public Child4 (int num) {
//	this.num = num;
	// super() -> ���� ������, �����Ǿ� ����.
	// Child4 ���� num ������ ��� super �������� ã�´�.
	
	super(num);
//	this(999);

//	super.num = num;
	System.out.println("�ڽ� �����ε� ������ " + num);
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