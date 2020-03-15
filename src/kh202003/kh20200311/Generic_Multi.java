package kh202003.kh20200311;

// 타입 파라미터를 여러개 사용하는 방법.

// 멀티 제네릭 클래스
class Class04<T1, T2> {
	
	private T1 data1;
	private T2 data2;
	

// 멀티 제네릭 메소드
	public <K1, K2> K2 test(K1 data) {
		K2 result = (K2) data;
		
		return result;
	}


	public T1 getData1() {
		return data1;
	}


	public void setData1(T1 data1) {
		this.data1 = data1;
	}


	public T2 getData2() {
		return data2;
	}


	public void setData2(T2 data2) {
		this.data2 = data2;
	}
	
	
}

public class Generic_Multi {
	public static void main(String[] args) {

		Class04<Integer, String> c04 = new Class04<>();
		
		c04.setData1(123);
		c04.setData2("ABC");
		
		
		// 위의 Integer, String 선언을 한 상태여도
		// 새로 생성자를 만들어서 선언해줘도 사용하는데 무관하다.
		
		c04.<Boolean, Double>test(true);
	}
}
