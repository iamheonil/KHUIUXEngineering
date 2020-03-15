package kh202002.kh20200220;

// Object 클래스
//	- 패키지 : java.lang 
// 	- 자바의 모든 클래스의 최상위 부모 클래스
// 	- 모든 클래스는 Object를 상속받고 있다.
// 	- 자바 프로그래밍의 기본이 되는 클래스.
// 
// Object 클래스의 메소드
//	- 재정의(Override) 불가능 메소드
//		스레드 동기화에 사용 ↓ 
//		notify, notifyAll, wait 
// 	
// 		클래스의 타입 정보를 반환(Class 타입) ↓
// 		getClass
// 
// 	- 재정의(Override) 가능 메소드 - 개발자가 바꿔서 사용 가능하다.
// 		toString, equals, hashCode, clone, finalize
// 
// 		- toString
// 			- 객체를 설명하는 문자열을 반환.
// 			- 기본리턴값 - "데이터타입@참조값" 형식의 문자열을 반환한다.
//			- Sysout 메소드의 전달인자 객체를 사용하면 해당 객체의 toString() 반환값을 출력한다.
// 
//		- equals 
// 			- 동일성을 비교하는 코드 - Identity
// 			- 동일성이 아닌 동등성을 비교하는 코드로 바꿔줘야할 때	- Equality
// 
// 		- hashCode
// 			- 객체의 고유값을 반환한다.
// 			- 기본동작으로는 객체의 참조값을 10진수(int)로 반환한다.
// 			- String 은 같은 데이터라면 같은 hashCode 를 반환한다.
// 			- String 은 동등한 객체에서 같은 hashCode 를 반환한다.
//			- 사용빈도가 적다. 			
// 			
// 		- clone
// 			- 객체 복사 메소드
// 			- protected 접근제한자로 설정되어있다.
// 			- 사용하려는 클래스에서 public 으로 오버라이딩한 후 사용한다.
// 			- 반환 타입이 Object이므로 형변환이 필요하다.
// 			- 예외처리구문(try/catch)을 추가해야한다.
// 			- clone()을 구현하는 클래스는 interface Cloneable을 상속(구현처리)해야한다. 
// 			- 성공적으로 수행했다면 깊은 복사가 이뤄진다.
//			- 사용빈도가 적다. 
//
// 		- finalize
// 			- GC(Garbage Collector)가 객체를 파괴할 때 호출하는 메소드
// 			- 자바에서는 사용하지 않으므로 절대 건들지 말 것
// 			
//		- Math
//			- 수학적인 연산을 정적메소드로 제공하는 클래스
//			- 멤버필드로 E(자연상수), PI(원주율) 두 가지를 정적멤버로 가지고 있다.
//			- 사용방법
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
	

		System.out.println("전달인자로 객체가 사용되면 toString() 반환값을 출력한다.\n");
		
		System.out.println(obj);
		System.out.println(p1 + "\n");
		
		System.out.println("\nEqulas");
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2;
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);
		
		// 동일성을 비교하는 코드 - Identity
		// 같은 객체인지 확인, 같은 참조대상을 가리키고 있는지 확인
		// == 연산자
		System.out.println("p2 == p3 : " + (p2 == p3));
		System.out.println("p2 == p4 : " + (p2 == p4));
		
		System.out.println();
		
		// 동일성이 아닌 동등성을 비교하는 코드로 바꿔줘야할 때	- Equality
		// 	- 참조대상의 값이 같은 값을 가지고 있는지 확인.
		//	- equals() 메소드
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
		
		// 문자열은 hashCode() 메소드를 오버라이딩 하고 있다.
		// 문자열의 내용물 (각 Char 데이터)를 가지고 재생산된 고유값을 반환한다.
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		
		System.out.println("\nclone");
		// 객체 복사 메소드
		Point p_original = new Point(33, 44);
		Point p_clone1 = p_original;							// 얕은 복사
		Point p_clone2 = new Point(p_original.x, p_original.y); // 생성자를 이용한 깊은 복사
		
		// clone() 을 이용한 깊은복사.
		// 1단계 Not visible 해결 -> 2단계 Type missmatch 해결(Type missmatch 오류 확인 후 형변환, 에러 변경된 거 확인) 
		// -> 3단계 CloneNotSupportedException 오류(Surround with Try/Catch) 해결  
		// -> 4단계 java.lang.CloneNotSupportedException(클론을 지원하지 않는 클래스를 클론하려고 해서 예외처리)
		
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
		
		// abs = absolute, 절대 값
		System.out.println(Math.abs(-5));
		
		System.out.println("\nfinalize");
		
	}
}