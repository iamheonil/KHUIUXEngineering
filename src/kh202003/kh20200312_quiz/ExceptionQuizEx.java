package kh202003.kh20200312_quiz;

import java.util.Scanner;

public class ExceptionQuizEx {
	public static void main(String[] args) {

//		quiz1();
		quiz2();

	}

	public static void quiz1() {
		CharacterProcess cp = new CharacterProcess();

//		try {
//			cp.countAlpha("I am Heonil");
//		} catch (CharCheckException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // 공백 Exception

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열을 입력해주세요 : ");
			cp.countAlpha(sc.nextLine());
		} catch (CharCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 정상 출력 되게 할 것
	}

	public static void quiz2() {

		NumberProcess np = new NumberProcess();

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Num 1 : ");
			int n1 = sc.nextInt();
			System.out.print("Num 2 : ");
			int n2 = sc.nextInt();
			np.checkDouble(n1, n2);
		} catch (NumberRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 정상 출력

//		try {
//			np.checkDouble(6, 10);
//		} catch (NumberRangeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // 아님 출력
//
//		try {
//			np.checkDouble(100, 200);
//		} catch (NumberRangeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // 예외처리

	}
}