package kh20200217;

// �θ� Ŭ����Ÿ���� �ڽ�Ŭ����Ÿ���� ������ �޾��ش�.
class Parent2 {
	public int num;
	
	public void display() {
		System.out.println("�θ� �޼ҵ�");
	}
		
}

class Child2 extends Parent2 {
		
	@Override
		public void display() {
			
			num = 100;
			System.out.println("�������̵� �޼ҵ�");
		}	
	
	public void print() {
		System.out.println("�ڽ� �޼ҵ�");
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
		
		Parent2 pc = new Child2();	// Parent2 <= Child2 �� ����
		
//		Child2 cp = (Child2) new Parent2();
		// �θ� Ŭ����Ÿ���� �ڽ�Ŭ����Ÿ���� ������ �޾��ش�
		// �ݴ�� �ȵȴ�.
		// ClassCastException
	
		pc.display();	// child2 �� �޼ҵ� ȣ��		-> ��� ����
		pc.num = 50;	// Parent2 �� ���� ���			-> ��� ����
		
		((Child2)pc).display();	// ����� �ڵ��~
	}
}


