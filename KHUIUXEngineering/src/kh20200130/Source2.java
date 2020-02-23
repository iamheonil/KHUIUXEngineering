package kh20200130;

public class Source2 {
	public static void main (String[] args) {
		
//		System.out.println(777); // 상수
		
//		int num = 500 + 600;
		
		
		final int MAX = 100000000;
//		max = 100;
//		max = 200;
//		따로 값을 대입해줘도 상관없지만 final 같은 경우는 선언과 동시에 초기화 해주는것도 생각해봐야한다.
//		final 로 선언한 변수명은 대부분 대문자로 작성한다.
		System.out.println("MAX의 값은 : " + MAX);
		System.out.println("");
		

		final int STUDENT_NUM = 10;	// 학생의 수
		
		int sum = 808;	// 총점
		double avg;	// 평균
		avg = sum / (double) STUDENT_NUM;
//			여기서	(double) 같은 경우엔 나누기(/) 작업을 수행할 때 STUDENT_NUM 의 형변환을 해주어서 소숫점까지 계산하여 출력한다. **
		
		System.out.println("총 인원 : " + STUDENT_NUM);
		System.out.println(avg);
	}
}
