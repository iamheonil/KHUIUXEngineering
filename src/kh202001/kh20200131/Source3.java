package kh202001.kh20200131;

public class Source3 {
	public static void main(String[] args) {
		
// 단항연산자 - 부호
// +, -
// 
		
	int num = -7;
	System.out.println(-num);
	System.out.println(-(-7));
	System.out.println(+num);
	
	System.out.println("");
	
	System.out.println(+num);
	System.out.println(+(-7));
	System.out.println(-7);
	System.out.println("");
	
// '!' : 논리 부정 연산자
// (type) : 형변환 연산자
// '.' : 참조 연산자 (System'.'out'.'println)
//
	
// 단항연산자 - 증감
// ++, --
// 증가연산자, 감소연산자 = 앞글자를 따 증감연산자라고 한다.
// 
// 피연산자로 적용된 변수의 값을 1 증가, 감소시킨다.
// ex) i++
	
	System.out.println("");
	int i;
	i = 15;
	System.out.println(i);
	System.out.println(i--); // 후위, 후치 연산자, i(15)를 불러온 뒤 연산을 진행한다.
	System.out.println(i);	 // 15, 15, 14
	System.out.println("");
	i = 15;
	System.out.println(i);
	System.out.println(--i); // 전위, 전치 연산자, i(15)를 불러오기 전 연산을 진행(14)한다.
	System.out.println(i);	 // 15, 14, 14
	System.out.println("");
	i = 15;
	System.out.println(i++ * 3);
	System.out.println(i);
	System.out.println(i * 3);
	System.out.println("");
	
// 삼항연산자 - 조건
// 삼항조건연산자
// 삼항연산자
// 조건연산자
	
// ** 조건식 : 연산의 결과를 true / false 로 판별할 수 있는 연산식
// 조건식 ? 참일때 반환 값 : 거짓일 때 반환 값
	int jo1 = 10, jo2 = 20;
	System.out.println(jo1 > jo2 ? "jo1 이 크다" : "jo1 이 크지않다.");
	
	int result;
	result = jo1 > jo2 ? jo1 : jo2;
	System.out.println(result);
	
// 위의 조건식은 안 쓰고 if 문으로 대체한다.
	
// 
// 
// 
// 
// 	
	
	}
}