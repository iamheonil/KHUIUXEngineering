package kh202002.kh20200211_method;



// 기능 클래스

public class ProfMethod_04 {

	//배열의 모든 요소 출력(print)
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
	public void mul10(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 10;
		}
	}
	
	public int[] mul10v2(int[] arr) { 
		int[] res = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			res[i] = arr[i] * 10;
		}
		return res;
	} //↑↑↑↑↑↑↑↑
	// ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	// 메소드에서 Return 은?
	// 1. 반환값 지정.
	// 2. 메소드 종료.
	// ** return 데이터 타입이 void 라면 메소드를 반환값을 지정하지 않고 메소드를 종료시키는 역할만 수행한다.
	// ** main() 메소드에서 return 코드를 수행할 경우 프로그램의 종료를 의미한다.
	// 3. 
	//

	
}