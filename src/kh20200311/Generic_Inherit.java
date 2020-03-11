package kh20200311;


// ���׸� Ŭ���� ����
class Parent<T> {
	T data;
}

// ���׸� Ŭ������ �Ϲ�Ŭ������ ��� �ް� �ȴٸ�
// �Ϲ� Ŭ������ ���׸��� �𸣱� ������ �ٽ� Object �ڷ������� ���� ���·� ��� �޴´�.
class Child01 extends Parent {			// T -> Object 

	
}

class Child02 extends Parent<String> {	// T -> String
	
	
}

class Child03<K> extends Parent<K> {	// T -> K -> 
										// ��ӹ��� Ÿ�� �Ķ������ �ڷ��� ������ �̷�� 
	
}

class Child04<M, N> extends Parent<M> {
	N data2;
	
	// M data1 : ��ӹ��� ���׸� M�� �̿��� ����ʵ�, Ÿ�� �̰���
	// N data2 : �ڽ� Ŭ������ ������ ���׸� Ÿ��(N), Ÿ�� �̰���
	
}

public class Generic_Inherit {
	public static void main(String[] args) {

		Child03<Integer> c03 = new Child03<>();
		// Child03 �� T->K->Integer �� ��ȯ�ȴ�.
		
	}
}