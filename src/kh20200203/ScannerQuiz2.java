package kh20200203;

import java.util.Scanner;

public class ScannerQuiz2 {
	public static void main(String[] args) {

// �л� ���� ���� ���α׷� ����.
// �̸�, ����, ����, ����, ����, ���� 6���� ������ ������ �� �ִ� ������ �����ϰ�
// 6���� ������ Scanner �� �̿��� �Է� �� �� ������ ����� ������ ����� ����Ѵ�.
	
		Scanner sc = new Scanner(System.in);
		
		String name, gender;
		int age, kor, eng, mat;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		gender = sc.nextLine();
		System.out.print("���������� �Է��ϼ��� : ");
		kor = sc.nextInt();
		System.out.print("���������� �Է��ϼ��� : ");
		eng = sc.nextInt();
		System.out.print("���������� �Է��ϼ��� : ");
		mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double result = sum / (double)3;
		String Cresult = String.format("%.2f", result);
		
		System.out.println("--- ��� ��� ---");
		System.out.println("�̸�\t ����\t ����\t ����\t ����\t ����\t ����\t ���\t");
		System.out.println(name + "\t" + age + "\t" + gender + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + Cresult);
	}
}