package kh202002.kh20200211_method;

import java.util.Scanner;

// ������ ����Ѵ�.

public class CalculatorEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator Calc = new Calculator();

		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int n1 = sc.nextInt();
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		sc.nextLine();
//		String add = sc.nextLine();
		char oper = sc.nextLine().charAt(0);
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int n2 = sc.nextInt();
		
//		switch (add) add �� ���ڿ� String ���� ó���߱⶧���� case �� " �� ����������Ѵ�.
		
		switch (oper) {
		case '+' :
			System.out.println(n1 + " + " + n2 + " = " + Calc.sum(n1, n2));
			break;
		case '-' :
			System.out.println(n1 + " - " + n2 + " = " + Calc.sub(n1, n2));
			break;
		case '*' :
			System.out.println(n1 + " * " + n2 + " = " + Calc.mul(n1, n2));
			break;
		case '/' :
			System.out.println(n1 + " / " + n2 + " = " + Calc.div(n1, n2));
			break;
		}
	}
}