package kh20200213;

class Constructor02 {
	// ���� Ŭ����, ����ʵ�
	private int num1;
	private int num2;

	// ����Ʈ ������
	public Constructor02() {
		System.out.println("����Ʈ ������.");
		this.num1 = 100;
		this.num2 = 200;
		
		// this �� �ڱ����� ��ü��� �ϴµ�, �ڱ��ڽ��� ������ �� �ִ�
		// �� �ᵵ ��������� Getter, Setter ���� �Ű����� ������ ���� �ۼ��Ѵ�.	
	}

	// �Ű������� int�� �ϳ��� ������
	// '��������'�� �̿��� num1 �� �ʱ�ȭ�Ѵ�.
	public Constructor02(int num1) {
		System.out.println("�Ű������� �ϳ��� ������");
		this.num1 = num1;
		this.num2 = 600;
	}

	// �Ű������� �ΰ��� ������
	// '��������'�� �̿��� num1 �� �ʱ�ȭ�Ѵ�.
	public Constructor02(int num1, int num2) {
		System.out.println("�Ű������� �ΰ��� ������");
//		this.num1 = num1;
//		this.num2 = num2;

		// Setter �� ����Ͽ� �ʱ�ȭ �����ϴ�.
		setNum1(num1);
		setNum2(num2);
		// Setter �� ����Ͽ� �ʱ�ȭ�ϴ°� ���� �� ���� ���
	}
	
	
	// ��� ����(���)�� ����ϴ� ���
	public void out() {
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}

	// ����ʵ� ����� Getter Setter ������ �ڿ������� �ٷ� �ϵ��� ����.
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

public class ConstructorEX_02 {
	public static void main(String[] args) {
		// ���� Ŭ����, ��� �޼ҵ�

		Constructor02 cons02 = new Constructor02();
		cons02.out();
		System.out.println();
		Constructor02 cons03 = new Constructor02(5050);
		cons03.out();
		System.out.println();
		Constructor02 cons04 = new Constructor02(600, 800);
		cons04.out();
		
	}
}
