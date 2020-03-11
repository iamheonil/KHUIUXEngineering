package kh20200311;


// 제네릭 클래스 구현
class Parent<T> {
	T data;
}

// 제네릭 클래스를 일반클래스가 상속 받게 된다면
// 일반 클래스는 제네릭을 모르기 때문에 다시 Object 자료형으로 변한 상태로 상속 받는다.
class Child01 extends Parent {			// T -> Object 

	
}

class Child02 extends Parent<String> {	// T -> String
	
	
}

class Child03<K> extends Parent<K> {	// T -> K -> 
										// 상속받은 타입 파라미터의 자료형 결정을 미룬다 
	
}

class Child04<M, N> extends Parent<M> {
	N data2;
	
	// M data1 : 상속받은 제네릭 M을 이용한 멤버필드, 타입 미결정
	// N data2 : 자식 클래스의 고유한 제네릭 타입(N), 타입 미결정
	
}

public class Generic_Inherit {
	public static void main(String[] args) {

		Child03<Integer> c03 = new Child03<>();
		// Child03 은 T->K->Integer 로 변환된다.
		
	}
}