package kh202002.kh20200220;

// Object Ŭ����
//	- ��Ű�� : java.lang 
// 	- �ڹ��� ��� Ŭ������ �ֻ��� �θ� Ŭ����
// 	- ��� Ŭ������ Object�� ��ӹް� �ִ�.
// 	- �ڹ� ���α׷����� �⺻�� �Ǵ� Ŭ����.
// 
// Object Ŭ������ �޼ҵ�
//	- ������(Override) �Ұ��� �޼ҵ�
//		������ ����ȭ�� ��� �� 
//		notify, notifyAll, wait 
// 	
// 		Ŭ������ Ÿ�� ������ ��ȯ(Class Ÿ��) ��
// 		getClass
// 
// 	- ������(Override) ���� �޼ҵ� - �����ڰ� �ٲ㼭 ��� �����ϴ�.
// 		toString, equals, hashCode, clone, finalize
// 
// 		- toString
// 			- ��ü�� �����ϴ� ���ڿ��� ��ȯ.
// 			- �⺻���ϰ� - "������Ÿ��@������" ������ ���ڿ��� ��ȯ�Ѵ�.
//			- Sysout �޼ҵ��� �������� ��ü�� ����ϸ� �ش� ��ü�� toString() ��ȯ���� ����Ѵ�.
// 
//		- equals 
// 			- ���ϼ��� ���ϴ� �ڵ� - Identity
// 			- ���ϼ��� �ƴ� ����� ���ϴ� �ڵ�� �ٲ������ ��	- Equality
// 
// 		- hashCode
// 			- ��ü�� �������� ��ȯ�Ѵ�.
// 			- �⺻�������δ� ��ü�� �������� 10����(int)�� ��ȯ�Ѵ�.
// 			- String �� ���� �����Ͷ�� ���� hashCode �� ��ȯ�Ѵ�.
// 			- String �� ������ ��ü���� ���� hashCode �� ��ȯ�Ѵ�.
//			- ���󵵰� ����. 			
// 			
// 		- clone
// 			- ��ü ���� �޼ҵ�
// 			- protected ���������ڷ� �����Ǿ��ִ�.
// 			- ����Ϸ��� Ŭ�������� public ���� �������̵��� �� ����Ѵ�.
// 			- ��ȯ Ÿ���� Object�̹Ƿ� ����ȯ�� �ʿ��ϴ�.
// 			- ����ó������(try/catch)�� �߰��ؾ��Ѵ�.
// 			- clone()�� �����ϴ� Ŭ������ interface Cloneable�� ���(����ó��)�ؾ��Ѵ�. 
// 			- ���������� �����ߴٸ� ���� ���簡 �̷�����.
//			- ���󵵰� ����. 
//
// 		- finalize
// 			- GC(Garbage Collector)�� ��ü�� �ı��� �� ȣ���ϴ� �޼ҵ�
// 			- �ڹٿ����� ������� �����Ƿ� ���� �ǵ��� �� ��
// 			
//		- Math
//			- �������� ������ �����޼ҵ�� �����ϴ� Ŭ����
//			- ����ʵ�� E(�ڿ����), PI(������) �� ������ ��������� ������ �ִ�.
//			- �����
//			System.out.println(cos(30.0));
//			- 
//			- 
//			- 
//
//
//


class Point implements Cloneable {
	int x;
	int y;
		
	public Point(int x, int y) {
	
		this.x = x;
		this.y = y;
		
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "(" + x + ", " + y + ")";
//	}

	@Override
	public boolean equals(Object obj) {
		if(this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
			return true;
		}
		return false;		
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjectEx {
	public static void main(String[] args) {

		Object obj = new Object();
		Point p1 = new Point(100, 50);
		
		System.out.println(obj.toString());
		System.out.println(p1.toString() + "\n");
	

		System.out.println("�������ڷ� ��ü�� ���Ǹ� toString() ��ȯ���� ����Ѵ�.\n");
		
		System.out.println(obj);
		System.out.println(p1 + "\n");
		
		System.out.println("\nEqulas");
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2;
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);
		
		// ���ϼ��� ���ϴ� �ڵ� - Identity
		// ���� ��ü���� Ȯ��, ���� ��������� ����Ű�� �ִ��� Ȯ��
		// == ������
		System.out.println("p2 == p3 : " + (p2 == p3));
		System.out.println("p2 == p4 : " + (p2 == p4));
		
		System.out.println();
		
		// ���ϼ��� �ƴ� ����� ���ϴ� �ڵ�� �ٲ������ ��	- Equality
		// 	- ��������� ���� ���� ���� ������ �ִ��� Ȯ��.
		//	- equals() �޼ҵ�
		System.out.println("p2.equlas(p3) : " + p2.equals(p3));
		System.out.println("p2.equlas(p4) : " + p2.equals(p4));
	
		System.out.println("\nhashCode");
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		System.out.println();
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		
		// ���ڿ��� hashCode() �޼ҵ带 �������̵� �ϰ� �ִ�.
		// ���ڿ��� ���빰 (�� Char ������)�� ������ ������ �������� ��ȯ�Ѵ�.
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		
		System.out.println("\nclone");
		// ��ü ���� �޼ҵ�
		Point p_original = new Point(33, 44);
		Point p_clone1 = p_original;							// ���� ����
		Point p_clone2 = new Point(p_original.x, p_original.y); // �����ڸ� �̿��� ���� ����
		
		// clone() �� �̿��� ��������.
		// 1�ܰ� Not visible �ذ� -> 2�ܰ� Type missmatch �ذ�(Type missmatch ���� Ȯ�� �� ����ȯ, ���� ����� �� Ȯ��) 
		// -> 3�ܰ� CloneNotSupportedException ����(Surround with Try/Catch) �ذ�  
		// -> 4�ܰ� java.lang.CloneNotSupportedException(Ŭ���� �������� �ʴ� Ŭ������ Ŭ���Ϸ��� �ؼ� ����ó��)
		
		Point p_clone3 = null;
		try {
			p_clone3 = (Point) p_original.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p_clone3);
		System.out.println("Equals : " + p_original.equals(p_clone3));
		System.out.println("== : " + (p_original == p_clone3));
		
		// abs = absolute, ���� ��
		System.out.println(Math.abs(-5));
		
		System.out.println("\nfinalize");
		
	}
}