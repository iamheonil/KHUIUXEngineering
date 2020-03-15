package kh202002.kh20200214;

public class PrintFormatted {
	// PrintFormatted
	// 문자열 서식지정 출력

	// 서식문자를 포함하는 문자열과 서식에 들어갈 데이터를 지정하여 출력한다.
	// System.out.printf("서식 포함하는 문자열", 서식데이터1, 서식데이터2, 서식데이터3 ...);

	// 서식문자
	// %s - 문자열
	// %d - 정수 (10진수)
	// %c - 단일문자
	// %f - 실수

	// ex) System.out.printf("%입니다", 123);
	// System.out.printf("%d%s", 100, "입니다");
	// -> %d와 100이 짝, %s와 "입니다"가 짝
	// System.out.printf("%d점 만점에 %d점\n", 10, 9);
	// System.out.printf(10 + "점 만점에 " + 9 "점");

	// 서식문자의 출력 공간 확보
	// %와 서식지정자 사이에 숫자를 넣으면 출력 공간을 확보한다
	// %7d -> 7칸을 확보하고 그 자리에 정수를 채워넣는다.
	// %f와 같은 서식문자는 정수부 자리와 소수부 자리수를 지정할 수 있다.
	// System.out.printf("%10.2f", 123.45678);
	// -> Result : ' '123.47

	public static void main(String[] args) {
		System.out.printf("%7d%7d%7d\n", 100, 200, 300);
		System.out.printf("%10.2f    %7.3f\n", 123.4567, 56.78910 );
	}
}
