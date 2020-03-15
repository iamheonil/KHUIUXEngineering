package kh202002.kh20200219_abstract;


abstract class TestClass {
	public abstract void method();

}

// 상수만 모아놓을때, 추상 메소드만 모아 기능 제공할 때 인터페이스를 사용한다. (일종의 클래스)
// 개발중인 메소드의 형식을 강제하기 위해 사용.
// 멤버필드는 public static final 이 기본적으로, 메소드는 abstract 가 기본으로 적용된다.
interface TestInterface {
	
	// 인터페이스로 변수 선언을 하게되면 'public static final' 키워드가 생략된다. 
	//	int num = 15;
	// -> public static final int num = 15;

	int MAX = 2000;
	static int S = 400;
	final int F = 500;
	// 항상 public static final int num = 15; 이런식으로 선언해줄것
	
	// 인터페이스로 클래스를 만들면 abstract 키워드가 생략된다.
	public void display();
	
	public abstract void out();
	// 둘 다 똑같다.
	// 조금 귀찮더라도 abstract 를 붙여 써주는게 좋다.
	// 헷갈릴 수 있기 때문
}


// 클래스끼리의 다중상속 절대 금지, 하지만 인터페이스끼리의 다중 상속은 가능하다.
// 인터페이스 다중 구현을 하는것도 가능하다.
class Test extends TestClass implements TestInterface {
	// 순서는 클래스 - 상속(extends) - 구현(implements) 순으로 작성
	//	- 용어는 다르지만 상속과 거의 흡사하다.
	
	int t = MAX;

	@Override
	public void method() {
		System.out.println(t);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.method();
		
	}
}
