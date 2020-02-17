package kh20200217;


class Parent {
	String name;
	int num;
	
	
	public void display() {
		System.out.println("�θ� Ŭ������ �޼ҵ��Դϴ�.\n" + name + " " + num);
		
		System.out.println("");
	}
}

class Child extends Parent{
	int score;
	
	public void print() {
		System.out.println("�ڽ� Ŭ������ �޼ҵ��Դϴ�.\n" + name + " " + num +  " " + score);
	}
	
	public void display() {
		System.out.println("�޼ҵ� ������, �������̵�");
	}
	
}

// �޼ҵ� �����ε�(Method OverLoading)
//	- �޼ҵ� �ߺ�����
//	- ���� �̸��� �޼ҵ带 �Ű������� ������ Ÿ���� �ٸ��� �Ͽ� �ٸ� �޼ҵ带 �����ϴ°�.

// �޼ҵ� �������̵�(Method OverRiding) - ��ӹ��� Ŭ������ �޼ҵ带 ����� ���Ӱ� �����.
//	- �޼ҵ� ������
//	- ��ӹ��� �޼ҵ带 �ڽ�Ŭ������ ���Ӱ� �����ϴ� ��.

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
