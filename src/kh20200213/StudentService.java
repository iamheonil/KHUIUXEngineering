package kh20200213;

import java.util.Scanner;

public class StudentService {

	private Student stu = new Student();
	private Scanner input = new Scanner(System.in);
	// 여기 초기화 해줘야함
		
	public StudentService() {

	}
	
	public void insertInfo() {
		System.out.print("이름을 입력하세요 : ");
		stu.setName(input.nextLine());
		System.out.print("나이를 입력하세요 : ");		
		stu.setAge(input.nextInt());
	}
	
	public void insertScore() {
		System.out.print("국어 점수를 입력하세요 : ");		
		stu.setKor(input.nextInt());
		System.out.print("영어 점수를 입력하세요 : ");		
		stu.setEng(input.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");		
		stu.setMath(input.nextInt());
	}
	
	public void calcSum() {
		stu.setSum((stu.getKor() + stu.getEng() + stu.getMath()));
	}
	
	public void calcAvg() {
		stu.setAvg(stu.getSum() / (double) 3);
	}
	
	public void printStu() {
		System.out.println();
		System.out.println();
		System.out.println("이름 : " + stu.getName());
		System.out.println("나이 : " + stu.getAge());
		System.out.println("국어점수 : " + stu.getKor());
		System.out.println("영어점수 : " + stu.getEng());
		System.out.println("수학점수 : " + stu.getMath());
		calcSum();
		calcAvg();
		System.out.println("총합 : " + stu.getSum());
		System.out.println("평균점수 : " + stu.getAvg());
		
	}
}