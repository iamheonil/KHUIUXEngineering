package kh202002.kh20200217;

class Parent3 {
	public int num = 111;
	
	public Parent3() {
		System.out.println("�θ� ����Ʈ ������");
		
		System.out.println(this.num);
	}
}

class Child3 extends Parent3 {
	private int num = 333;
	
	public Child3() {
		System.out.println("�ڽ� ����Ʈ ������");
		System.out.println(this.num);	// this -> �ڽ� ���� ��ü 
		System.out.println(super.num); 	// super -> �θ� ���� ��ü
	}
}


public class InheritEx_03 {
	public static void main(String[] args) {
		
		Parent3 p = new Parent3();
		
		System.out.println();
		
		Child3 c = new Child3();
		
		
		
	}
}
