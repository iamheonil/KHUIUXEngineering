package kh20200213;

import java.util.Scanner;

public class StudentService {

	private Student stu = new Student();				// 여기 객체 초기화 해줘야함
	private Scanner input = new Scanner(System.in);		// 맴버필드 초기화 해주는 과정

		
	public StudentService() { 

	}
	
	// Information Insert
	public void insertInfo() {
		System.out.print("이름을 입력하세요 : ");
		stu.setName(input.nextLine());
		System.out.print("나이를 입력하세요 : ");		
		stu.setAge(input.nextInt());
	}
	
	// Score Insert
	public void insertScore() {
		System.out.print("국어 점수를 입력하세요 : ");		
		stu.setKor(input.nextInt());
		System.out.print("영어 점수를 입력하세요 : ");		
		stu.setEng(input.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");		
		stu.setMath(input.nextInt());
	}
	
	// Score 총 합계
	public void calcSum(Student stu) {
		stu.setSum((stu.getKor() + stu.getEng() + stu.getMath()));
	}
	
	// Score 총 합계의 평균
	public void calcAvg(Student stu) {
		stu.setAvg(stu.getSum() / (double) 3);
	}
	
	// Print Information
	public void printStu() {
		System.out.println();
		System.out.println();
		System.out.println("\t이름 : " + stu.getName());
		System.out.println("\t나이 : " + stu.getAge());
		System.out.println("\t국어점수 : " + stu.getKor());
		System.out.println("\t영어점수 : " + stu.getEng());
		System.out.println("\t수학점수 : " + stu.getMath());
		System.out.println("\t총합 : " + stu.getSum());
		System.out.print("\t평균 : ");
		System.out.printf("%.2f", stu.getAvg());
		
	}
}