package kh20200311;

// 일반 클래스
class Class03 {
	
	// 일반 메소드
	public void display(int n) { 
		// 형태만 보기 위해 코드 구현은 하지 않았다.
	}
	
	// 제네릭 메소드
	public <T> T print(T t) {
		// 반환데이터, 매개변수, 지역변수, 형변환 어디든 사용 가능하다.
		// 자료형 어디든 사용 가능하다.
		// 제네릭은 Object 의 아래에 있다.
		
		// T data = 123;
		
		// 참조형으로 취급되어 null 값을 넣어놓는다.
		T data = null; 
		
		return data;
	}
	
}

// 제네릭 클래스
class Class02_1 <T> {
	
	// 제네릭 메소드
	public <K> void display(K obj, T data) {
		// 이렇게 사용하는 경우가 거의 없어서 문법만 알고 있어도 된다.
	}
}

public class Generic_Method {
	public static void main(String[] args) {
		
		Class03 c03 = new Class03();
		
		// 타입 파라미터를 지정하지 않았는데 메소드는 이렇게 사용해도 괜찮다.
		// 자동으로 결정되었는데 제대로 결정 되었다.
		
		c03.print(123);
		
		c03.<Double>print(123.0);
	}
}