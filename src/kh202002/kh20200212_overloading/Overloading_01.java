package kh202002.kh20200212_overloading;

// 설계 클래스



public class Overloading_01 {
	
	private int x;
	private int y;

	// 멤버필드 x, y 를 출력하는 메소드 구현
	public void display() { // 매개변수가 없는 Display
		System.out.println("( " + x + ", " + y + " )");
	}
	
	// 매개변수를 대입해 메소드 오버로딩 기능을 구현.
	// int 형 2개를 전달인자로 받아 멤버 x, y 를 초기화 및 출력
	public void display(int x, int y) { // 매개변수가 있는 Display
		this.x = x;		// 초기화
		this.y = y;		// 초기화
		
//		System.out.println("( " + x + ", " + y + " )");	// 출력
// 		위의 display 가 x, y 를 출력하기 때문에 sysout 을 쓰는게 아니라 display(); 를 불러와 사용해도 된다.
		
		display();
		// 코드의 재사용
	}
	
	public void display(double d) {				//	다른
	}

	public void display(String d) {				//	타입의
	}

	public void display(int d) {				//	데이터형
	}
	
	// 리턴타입이 void, int 등 상관없이 메소드 오버로딩과는 연관이 없다.
	// 무조건 데이터형의 갯수와 타입이 달라야한다.
	
	
}
