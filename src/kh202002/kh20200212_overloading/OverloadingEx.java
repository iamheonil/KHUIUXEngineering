package kh202002.kh20200212_overloading;

// ���� Ŭ����



public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading_01 ol = new Overloading_01();
		Overloading_02 ol2 = new Overloading_02();
		
		// ����� ���� Ŭ�������� ���ֱ⿡ �޼ҵ� �̸��� �ҷ��´�
		ol.display();
		
		// �޼ҵ� �����ε��� ���� ���� �־ ����ϱ�.
		ol.display(135, 230);
		ol.display(125, 235);
		
		System.out.println();
		// ��� 1
		System.out.println(ol2.getLength(12345));
		// ��� 2
		int num = ol2.getLength(1234);
		System.out.println(num);
		
		System.out.println();
		System.out.println("--- �� ��ȯ ---");
		// int ��
		System.out.println(ol2.getLength(123));
		// boolean ��
		System.out.println(ol2.getLength(true));
		// double ��
		System.out.println(ol2.getLength(12.34));
		
		
	}
}