package kh20200213;

import java.util.Scanner;

public class StudentService {

	private Student stu = new Student();				// ���� ��ü �ʱ�ȭ �������
	private Scanner input = new Scanner(System.in);		// �ɹ��ʵ� �ʱ�ȭ ���ִ� ����

		
	public StudentService() { 

	}
	
	// Information Insert
	public void insertInfo() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		stu.setName(input.nextLine());
		System.out.print("���̸� �Է��ϼ��� : ");		
		stu.setAge(input.nextInt());
	}
	
	// Score Insert
	public void insertScore() {
		System.out.print("���� ������ �Է��ϼ��� : ");		
		stu.setKor(input.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");		
		stu.setEng(input.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");		
		stu.setMath(input.nextInt());
	}
	
	// Score �� �հ�
	public void calcSum(Student stu) {
		stu.setSum((stu.getKor() + stu.getEng() + stu.getMath()));
	}
	
	// Score �� �հ��� ���
	public void calcAvg(Student stu) {
		stu.setAvg(stu.getSum() / (double) 3);
	}
	
	// Print Information
	public void printStu() {
		System.out.println();
		System.out.println();
		System.out.println("\t�̸� : " + stu.getName());
		System.out.println("\t���� : " + stu.getAge());
		System.out.println("\t�������� : " + stu.getKor());
		System.out.println("\t�������� : " + stu.getEng());
		System.out.println("\t�������� : " + stu.getMath());
		System.out.println("\t���� : " + stu.getSum());
		System.out.print("\t��� : ");
		System.out.printf("%.2f", stu.getAvg());
		
	}
}