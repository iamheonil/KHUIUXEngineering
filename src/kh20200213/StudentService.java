package kh20200213;

import java.util.Scanner;

public class StudentService {

	private Student stu = new Student();
	private Scanner input = new Scanner(System.in);
	// ���� �ʱ�ȭ �������
		
	public StudentService() {

	}
	
	public void insertInfo() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		stu.setName(input.nextLine());
		System.out.print("���̸� �Է��ϼ��� : ");		
		stu.setAge(input.nextInt());
	}
	
	public void insertScore() {
		System.out.print("���� ������ �Է��ϼ��� : ");		
		stu.setKor(input.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");		
		stu.setEng(input.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");		
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
		System.out.println("�̸� : " + stu.getName());
		System.out.println("���� : " + stu.getAge());
		System.out.println("�������� : " + stu.getKor());
		System.out.println("�������� : " + stu.getEng());
		System.out.println("�������� : " + stu.getMath());
		calcSum();
		calcAvg();
		System.out.println("���� : " + stu.getSum());
		System.out.println("������� : " + stu.getAvg());
		
	}
}