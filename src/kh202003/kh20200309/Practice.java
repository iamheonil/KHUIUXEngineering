package kh202003.kh20200309;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

//		String test = "F";
//
//		if (test.equals("C")) {
//			System.out.print("F �� �´�.");
//		} else {
//			System.out.print("���ε�");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� �Է� : ");
		String name = sc.nextLine();
		
		System.out.println("�г� �Է� : ");
		int grade = sc.nextInt();

		System.out.println("�� �Է� : ");
		int qlass = sc.nextInt();
		
		sc.nextLine();
		System.out.println("���� �Է�");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();

		System.out.println(name + grade + qlass + gender + score);

	}
}
