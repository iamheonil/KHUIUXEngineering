package kh202002.kh20200210;

// ���� Ŭ����:
// main() �޼ҵ带 ������ �ִ� Ŭ����


public class Main_01 {
	public static void main(String[] args) {

		int num;
		
//
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();
//		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
		c05.num = 500;
		
		Class_01 c01;	// Class_01 �� Ÿ���� ��ü ���� ����. (������ ����)
		c01 = new Class_01();
						// () �� ������, ������ ������ Ÿ�԰� new �ڿ� ���� ������Ÿ���� �����ؾ��Ѵ�.
						// Class Ÿ���� ��ü(�ν��Ͻ�) ����
		
		c01.str = "Apple";	// ����ʵ� str�� ���� ����.
		c01.num = 5000;		// ����ʵ� num�� ���� ����.
		
		System.out.println(c01.str);
		System.out.println(c01.num);
		
		// c01 ��ü�� �޼ҵ� �� �ϳ��� display ��� (ȣ��, Call) 
		c01.display();
		// �޼ҵ带 ȣ���� ������ �޼ҵ���� ���� '( )' ��ȣ�� ���δ�.
		
		
		
	}
}