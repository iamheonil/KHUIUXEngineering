package kh20200312;

public class Exception12_CustomException {
	public static void main(String[] args) {

		// 짝수인지 판별하는 객체 만들기

		CheckEven ce = new CheckEven();

		try {
			ce.check(13);
		} catch (OddNumberException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			ce.check(14);
		} catch (OddNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 예외 처리, Exception 홀수 안돼 출력

//		ce.check(14); // 정상 상황, sysout 짝수 맞다 출력

	}
}