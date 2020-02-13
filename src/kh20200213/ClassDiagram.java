package kh20200213;

public class ClassDiagram {
	public static void main(String[] args) {
		// 프로그램 설계 시 클래스의 형태, 구조, 클래스간의 관계를 일정한 규칙과 기호등을 사용해 표현한 것.
		// 시스템의 논리적 구조를 표현한 다이어그램
		// ** 논리적 구조 = 클래스의 구조 + 클래스들 간의 관계
		
		//======================================================================
		//              |===================================|	- 접근제한자 표현 기호
		//				|									|	- + : public
		//				|			 클래스 이름			|	- # : protected
		//				|									|	- ~ : default
		//              |===================================|	- - : private
		//				|									|	
		//				|									|	멤버필드 표기 예시
		//				|									|	private String name	=> - name : String
		//				|									|	public int num;		=> + num : int
		//				|			멤버	필드			|	double height		=> ~ height : double
		//				|									|	
		//				|									|	멤버 메소드 표기 예시
		//				|									| 	public String getName() { }					=> + getName() : String	
		//				|									|	private double display(int n1, int n2) { }	=> - display(int, int) : double
		//              |===================================|
		//				|									|	- 스테레오 타입, Stereotype
		//				|			 멤버 메소드			|	- <<Override>>
		//				|									|	
		//              |===================================| Class Diagram
		//======================================================================

		
		
	}
}