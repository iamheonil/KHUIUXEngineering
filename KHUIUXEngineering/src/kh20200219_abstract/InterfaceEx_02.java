package kh20200219_abstract;

// �������̽� ������ ��ɵ� ����.



public class InterfaceEx_02 {
	public static void main(String[] args) {

		Child c = new Child();
		c.out();
		
		
		// extends �� �θ� Ŭ������ �ȴ�.
		Parent p;
		p = new Child();
		
		p.out();	// ���� ���ε����� ���Ͽ� �ڽ� Ŭ���� ���
		
		Inter_01 i01;	// �������̽� ��ü ����
		i01 = new Child();	// �θ� �������̽� <- �ڽ� Ŭ����
		i01.out();	// ���� ���ε����� ���Ͽ� �ڽ� Ŭ���� ���
		// �߻�޼ҵ忩�� interface01 �� out �޼ҵ尡 �����ؾ� ���ε� ��ü�� ����������.
		// ���ٸ� ������ ��ü�� �ȵȴ�.
		
		Inter_02 i02 = new Child();
		i02.out();	
		
	}
}
