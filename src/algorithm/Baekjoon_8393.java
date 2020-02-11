package algorithm;

import java.util.Scanner;

public class Baekjoon_8393 {
	public static void main(String[] args) {

//		n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n을 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.print(sum);
		// sum += n; 과 혼동하기 쉬운데 i가 0부터 n과 동일해지기까지 증가하는 프로그램이기 때문에
		// 신경써서 코딩할 것!
	}
}
