package kh20200203;

import java.util.Scanner;

public class ScannerQuiz2 {
	public static void main(String[] args) {

// 학생 정보 관리 프로그램 제작.
// 이름, 나이, 성별, 국어, 영어, 수학 6가지 정보를 저장할 수 있는 변수를 선언하고
// 6가지 정보를 Scanner 를 이용해 입력 한 후 총점과 평균을 포함한 결과를 출력한다.
	
		Scanner sc = new Scanner(System.in);
		
		String name, gender;
		int age, kor, eng, mat;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.nextLine();
		System.out.print("국어점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double result = sum / (double)3;
		String Cresult = String.format("%.2f", result);
		
		System.out.println("--- 결과 출력 ---");
		System.out.println("이름\t 나이\t 성별\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println(name + "\t" + age + "\t" + gender + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + Cresult);
	}
}