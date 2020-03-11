package kh20200311;

class Data<K> {

	K data;
	
}

class Class05<T> {
	
	Data d1; 			// raw, Data<K> -> Data<Object>
	
	Data<String> d2; 	// Data<K> -> Data<String>
	
	Data<T> d3; 		// Data<K> -> Data<T>, 아직 빈 칸이다.
	
}

public class Generic_ClassMember {
	public static void main(String[] args) {

		Class05<Integer> c05 = new Class05<>();
		c05.d3 = new Data<>();
		// 문법 잘 확인할 것.
		// c05.d3.data(100);
		
		// Class05의 생성자는 만들었지만 d3 의 생성자는 만들지 않았음
		// c05.d3 = new Data<>(); 추가.
		c05.d3.data = 100; // NullPointerException 발생
		
		c05.d1 = new Data<>();	// Data<K> -> Data<Object>
		c05.d2 = new Data<>();	// Data<K> -> Data<String>
		c05.d3 = new Data<>();	// Data<K> -> Data<T> -> Data<Integer>
		
	}
}