package kh202002.kh20200214;

import java.util.Arrays;
import java.util.Scanner;

//-------------------------
//- sc : Scanner
//- stuArr : Student[3]
//-------------------------
//<<constructor>>
//+ StudentService_ver2()
//
//<<method>>
//- getIdx() : int
//
//- insertInfo(Student,int):void
//+ insertInfoAll() : void
//+ insertInfoIdx() : void
//
//- insertScore(Student,int):void
//+ insertScoreAll() : void
//+ insertSocreIdx() : void
//
//+ insertStu(int idx) : void
//+ insertStuAll() : void
//
//- calcSum(Student) : void
//- calcAvg(Student) : void
//
//- printStu(Student,int):void
//+ printStuAll() : void
//+ printStuIdx() : void
//-------------------------

public class StudentService_ver2 {

	// 멤버필드 초기화
	private Scanner sc = new Scanner(System.in);
	private Student stuArr[] = new Student[3];

	// 생성자
	public StudentService_ver2() {
		for (int i = 0; i < stuArr.length; i++) {
			stuArr[i] = new Student();
		}
	}

	// 인덱스 번호
	public int getIdx() {
		System.out.print("몇번째 학생 : ");
		int idx = sc.nextInt();
		return (idx - 1);
	}

	private void insertInfo(Student stu, int num) {
		sc.nextLine();
		System.out.print(num + "번째 학생의 이름을 입력하시오: ");
		stu.setName(sc.nextLine());
		System.out.print(num + "번째 학생의 나이를 입력하시오: ");
		stu.setAge(sc.nextInt());
	}

	public void insertInfoAll() {
		for (int i = 0; i < stuArr.length; i++) {
			insertInfo(stuArr[i], (i + 1));
			
		}
	}

	public void insertInfoIdx() {
		int idx = getIdx();
		insertInfo(stuArr[idx], (idx + 1));
	}

	private void insertScore(Student stu, int num) {
		sc.nextLine();
		System.out.print(num + "번째 학생의 국어점수를 입력하세요. : ");
		stu.setKor(sc.nextInt());
		System.out.print(num + "번째 학생의 영어점수를 입력하세요. : ");
		stu.setEng(sc.nextInt());
		System.out.print(num + "번째 학생의 수학점수를 입력하세요. : ");
		stu.setMath(sc.nextInt());
		calcSum(stu);
		calcAvg(stu);
	}

	public void insertScoreAll() {
		for (int i = 0; i < stuArr.length; i++) {
			insertScore(stuArr[i], (i + 1));
		}
	}

	public void insertScoreIdx() {
		int idx = getIdx();
		insertScore(stuArr[idx], (idx + 1));
	}

	public void insertStu() {

	}

	public void insertStuAll() {
		for (int i = 0; i < stuArr.length; i++) {
			insertInfo(stuArr[i], (i + 1));
			insertScore(stuArr[i], (i + 1));
		}
	}

	private void calcSum(Student stu) {
		stu.setSum((stu.getKor() + stu.getEng() + stu.getMath()));
	}

	private void calcAvg(Student stu) {
		stu.setAvg(stu.getSum() / (double) 3);
	}

	private void printStu(Student stu, int num) {
		System.out.println();
		System.out.println("\t이름 : " + stu.getName());
		System.out.println("\t나이 : " + stu.getAge());
		System.out.println("\t국어점수 : " + stu.getKor());
		System.out.println("\t영어점수 : " + stu.getEng());
		System.out.println("\t수학점수 : " + stu.getMath());
		System.out.println("\t총합 : " + stu.getSum());
		System.out.print("\t평균 : ");
		System.out.printf("%.2f", stu.getAvg());
		System.out.println();
		System.out.println();
	}

	public void printStuAll() {
		for(int i = 0; i < stuArr.length; i++) {
			printStu(stuArr[i], (i + 1));
		}
	}

	public void printStuIdx() {
		int idx = getIdx();
		printStu(stuArr[idx], (idx + 1));
	}

}
