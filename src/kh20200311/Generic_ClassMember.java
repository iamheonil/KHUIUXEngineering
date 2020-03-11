package kh20200311;

class Data<K> {

	K data;
	
}

class Class05<T> {
	
	Data d1; 			// raw, Data<K> -> Data<Object>
	
	Data<String> d2; 	// Data<K> -> Data<String>
	
	Data<T> d3; 		// Data<K> -> Data<T>, ���� �� ĭ�̴�.
	
}

public class Generic_ClassMember {
	public static void main(String[] args) {

		Class05<Integer> c05 = new Class05<>();
		c05.d3 = new Data<>();
		// ���� �� Ȯ���� ��.
		// c05.d3.data(100);
		
		// Class05�� �����ڴ� ��������� d3 �� �����ڴ� ������ �ʾ���
		// c05.d3 = new Data<>(); �߰�.
		c05.d3.data = 100; // NullPointerException �߻�
		
		c05.d1 = new Data<>();	// Data<K> -> Data<Object>
		c05.d2 = new Data<>();	// Data<K> -> Data<String>
		c05.d3 = new Data<>();	// Data<K> -> Data<T> -> Data<Integer>
		
	}
}