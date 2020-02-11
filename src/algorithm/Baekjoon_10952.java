package algorithm;

import java.util.Scanner;

public class Baekjoon_10952 {
	public static void main(String[] args) {

//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A를 입력하세요. : ");
		int a = sc.nextInt();
		System.out.print("B를 입력하세요. : ");
		int b = sc.nextInt();
		
		while(a != 0 && b != 0) {
			System.out.println(a + b);
		}
		// 미완성 보완해야함.
		
	}
}