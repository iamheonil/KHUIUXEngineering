package algorithm;

import java.util.Scanner;

public class Baekjoon_2438 {
	public static void main(String[] args) {

//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

		Scanner sc = new Scanner(System.in);

		System.out.print("N을 입력하세요. : ");
		int n = sc.nextInt();
		String Star = "";

		for (int i = 1; i <= n; i++) {
			System.out.println(Star += "*");
		}
		// 이중포문으로 구현 가능하지만
		// 효율성과 간편하게 구현하기 위해 String 변수를 선언 후 *를 중첩하는 식으로 진행했습니다.
	}
}