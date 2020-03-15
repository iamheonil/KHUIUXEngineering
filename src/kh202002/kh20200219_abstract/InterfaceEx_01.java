package kh202002.kh20200219_abstract;


abstract class TestClass {
	public abstract void method();

}

// ����� ��Ƴ�����, �߻� �޼ҵ常 ��� ��� ������ �� �������̽��� ����Ѵ�. (������ Ŭ����)
// �������� �޼ҵ��� ������ �����ϱ� ���� ���.
// ����ʵ�� public static final �� �⺻������, �޼ҵ�� abstract �� �⺻���� ����ȴ�.
interface TestInterface {
	
	// �������̽��� ���� ������ �ϰԵǸ� 'public static final' Ű���尡 �����ȴ�. 
	//	int num = 15;
	// -> public static final int num = 15;

	int MAX = 2000;
	static int S = 400;
	final int F = 500;
	// �׻� public static final int num = 15; �̷������� �������ٰ�
	
	// �������̽��� Ŭ������ ����� abstract Ű���尡 �����ȴ�.
	public void display();
	
	public abstract void out();
	// �� �� �Ȱ���.
	// ���� �������� abstract �� �ٿ� ���ִ°� ����.
	// �򰥸� �� �ֱ� ����
}


// Ŭ���������� ���߻�� ���� ����, ������ �������̽������� ���� ����� �����ϴ�.
// �������̽� ���� ������ �ϴ°͵� �����ϴ�.
class Test extends TestClass implements TestInterface {
	// ������ Ŭ���� - ���(extends) - ����(implements) ������ �ۼ�
	//	- ���� �ٸ����� ��Ӱ� ���� ����ϴ�.
	
	int t = MAX;

	@Override
	public void method() {
		System.out.println(t);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.method();
		
	}
}
