package algorithm;

import java.util.Scanner;

public class Baekjoon_2739 {
	public static void main(String[] args) {

//		N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
//			2 * 1 = 2
//			2 * 2 = 4
//			2 * 3 = 6
//			2 * 4 = 8
//			2 * 5 = 10
//			2 * 6 = 12
//			2 * 7 = 14
//			2 * 8 = 16
//			2 * 9 = 18
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수를 입력해주세요 : ");
		int mul = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(mul + " * " + i + " = " + mul * i);
		}
	}
}
