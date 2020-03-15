package kh202002.kh20200212_field;

// 설계 클래스



public class MemberField_02 {
	// 변수선언으로 만드는 곳 스택 메모리
	// 멤버 필드

	
	// Static 키워드, 정적 키워드
	// 클래스의 멤버를 인스턴스화(객체생성) 없이 사용할 수 있게 만드는 키워드.
	// 멤버필드, 멤버메소드 모두에게 적용 가능하다.
	// 객체(인스턴스)와 상관 없이 동작하며 클래스 단위로 제어된다.
	// 클래스마다 따로 관리한다.
	// 정적인 시점(프로그램 동작 직전)에 사용할 수 있는 준비가 완료된다.
	// 멤버 필드는 클래스 영역에 변수 공간을 생성한다.
	// 멤버 메소드는 실행할 수 있는 준비가 완료된다.(바인딩)
	
//	** 정적메소드에서 인스턴스 변수는 사용할 수 없다. 
//	** 정적메소드에선 정적변수만 사용해야한다.
	
//	** 일반메소드에서는 둘 다 사용 가능하다.
//	** main() 메소드는 static 메소드이다.
	
	
	// 클래스 변수, 정적변수, Static 변수
	public static String city = "Seoul";
	
	//	private static String city = "Seoul";
	
	// 정적 메소드, 스태틱메소드
	public static String getCity() {
		return city;
	}
	
//	private int num;
//	
//	public static void test() {
//		
//		System.out.println(num);
//	}
	
	// static 은 스택, 힙 메모리 생성전에 결과가 처리 되어서
	// 정적메소드에서 인스턴스 사용이 불가능하다.
	

	private static int num2;

	public void test2() {
		System.out.println(num2);
	}

	private static int num3;

	public static void test3() {
		System.out.println(num3);
	}
	
}