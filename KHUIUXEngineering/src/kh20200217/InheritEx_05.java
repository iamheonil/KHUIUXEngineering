package kh20200217;

class Parent5 {

	public void display() { 
		System.out.println("�θ� ����Ʈ ������");
	}
}

class Child5 extends Parent5{
//final class Child5 extends Parent5 { final �� �ٰԵǸ� ��� �Ұ���
	@Override
//	public final void display() {
	public void display() {
		System.out.println("�ڽ� Ŭ���� �������̵�");
	}
	
}

class GrandChild extends Child5 {
	
	@Override
	public void display() {
		System.out.println("2�� �����ǵ� �޼ҵ�");
	}
}

public class InheritEx_05 {
	public static void main(String[] args) {

		GrandChild gc = new GrandChild();
		
		gc.display();
	}
}
