package algorithm;

import java.util.Scanner;

public class Baekjoon_2741 {
	public static void main(String[] args) {

//		자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 N을 입력하세요. : ");
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i <= n; i++) {
			System.out.println(count++);
		}
		// 0부터 시작하고자 하면 i를 0부터,
		// 1부터 시작하고자 하면 i를 1부터!
	}
}
