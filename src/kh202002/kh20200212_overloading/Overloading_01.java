package kh202002.kh20200212_overloading;

// ���� Ŭ����



public class Overloading_01 {
	
	private int x;
	private int y;

	// ����ʵ� x, y �� ����ϴ� �޼ҵ� ����
	public void display() { // �Ű������� ���� Display
		System.out.println("( " + x + ", " + y + " )");
	}
	
	// �Ű������� ������ �޼ҵ� �����ε� ����� ����.
	// int �� 2���� �������ڷ� �޾� ��� x, y �� �ʱ�ȭ �� ���
	public void display(int x, int y) { // �Ű������� �ִ� Display
		this.x = x;		// �ʱ�ȭ
		this.y = y;		// �ʱ�ȭ
		
//		System.out.println("( " + x + ", " + y + " )");	// ���
// 		���� display �� x, y �� ����ϱ� ������ sysout �� ���°� �ƴ϶� display(); �� �ҷ��� ����ص� �ȴ�.
		
		display();
		// �ڵ��� ����
	}
	
	public void display(double d) {				//	�ٸ�
	}

	public void display(String d) {				//	Ÿ����
	}

	public void display(int d) {				//	��������
	}
	
	// ����Ÿ���� void, int �� ������� �޼ҵ� �����ε����� ������ ����.
	// ������ ���������� ������ Ÿ���� �޶���Ѵ�.
	
	
}
