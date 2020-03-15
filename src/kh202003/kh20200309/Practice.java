package kh202003.kh20200309;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

//		String test = "F";
//
//		if (test.equals("C")) {
//			System.out.print("F 가 맞다.");
//		} else {
//			System.out.print("안인데");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.println("학년 입력 : ");
		int grade = sc.nextInt();

		System.out.println("반 입력 : ");
		int qlass = sc.nextInt();
		
		sc.nextLine();
		System.out.println("성별 입력");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();

		System.out.println(name + grade + qlass + gender + score);

	}
}
