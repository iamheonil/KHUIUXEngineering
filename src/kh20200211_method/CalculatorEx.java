package kh20200211_method;

import java.util.Scanner;

// 실행을 담당한다.

public class CalculatorEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator Calc = new Calculator();

		System.out.print("첫번째 정수를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		sc.nextLine();
		String add = sc.nextLine();
		System.out.print("두번째 정수를 입력하세요 : ");
		int n2 = sc.nextInt();

		switch (add) {
		case "+":
			System.out.println(n1 + " + " + n2 + " = " + Calc.sum(n1, n2));
			break;
		case "-":
			System.out.println(n1 + " - " + n2 + " = " + Calc.sub(n1, n2));
			break;
		case "*":
			System.out.println(n1 + " * " + n2 + " = " + Calc.mul(n1, n2));
			break;
		case "/":
			System.out.println(n1 + " / " + n2 + " = " + Calc.div(n1, n2));
			break;
		}
	}
}
