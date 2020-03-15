package kh202002.kh20200211_method;

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
//		String add = sc.nextLine();
		char oper = sc.nextLine().charAt(0);
		System.out.print("두번째 정수를 입력하세요 : ");
		int n2 = sc.nextInt();
		
//		switch (add) add 는 문자열 String 으로 처리했기때문에 case 를 " 로 수정해줘야한다.
		
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