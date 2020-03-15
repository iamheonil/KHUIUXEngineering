package kh202002.kh20200212_overloading;

// 설계 클래스



public class Overloading_02 {

	// int 형 전달인자의 문자수(길이)를 구해서 반환
	// 111222333 -> 9개
	// 1234 	 -> 4개
	// 	전달인자 // 반환값
	//	
	
	public int getLength(int num) {
		
		// 1. 입력 된 int -> String 형변환
		String str = String.valueOf(num);
		
		// 2. 변환된 문자열의 길이를 return
		int result = str.length();
		
		return result;
	} 
	
	public int getLength(boolean type) {
		
		// 1. 입력 된 boolean(true, false) -> String 형변환
		String str = String.valueOf(type);
		
		// 2. 변환된 문자열의 길이를 return
		int result = str.length();
		
		return result;
	}
	
	public int getLength(double num) {
		
		// 1. 입력 된 double -> String 형변환
		String str = String.valueOf(num);
		
		// 2. 변환된 문자열의 길이를 return
		int result = str.length();
		
		return result;
	} 
	
}
