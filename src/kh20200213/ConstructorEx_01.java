package kh20200213;

class Constructor01 {
	// ����Ŭ����, ����ʵ�

	private int num1;
	private int num2 = 20;

	public Constructor01() {
		System.out.println("����Ʈ ������ ȣ���!");
		
		System.out.println(num1);
		System.out.println(num1);
		System.out.println("-----");
		num1 = 500;
		num2 = 600;
	}

	// �Ű������� �ִ� ������
	public Constructor01(int num1, int num2) {
		System.out.println("�Ű����� �ִ� ������ ȣ���");
		this.num1 = num1;
		this.num2 = num2;
		
		setNum1(num1);
		setNum2(num2);
				
	}
	
//	public void Constructor01() {
//		
//	}
	// �Ϲ� �޼ҵ� - �����ڿ� �򰥸��ϱ� ���� �̷��� ����� �ȵȴ�.
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}

public class ConstructorEx_01 {
	public static void main(String[] args) {
		// ����Ŭ����, ����޼ҵ�

		Constructor01 cons = new Constructor01();
		System.out.println("cons.num1 : " + cons.getNum1());
		System.out.println("cons.num2 : " + cons.getNum2());
		
		System.out.println();
		
		Constructor01 cons02 = new Constructor01(111, 222);
		System.out.println("cons.num1 : " + cons.getNum1());
		System.out.println("cons.num2 : " + cons.getNum2());
		
	}

}
