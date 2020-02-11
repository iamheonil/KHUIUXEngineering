package algorithm;

import java.util.Scanner;

public class Baekjoon_2742 {
	public static void main(String[] args) {

//		자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 N을 입력하세요. : ");
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
		// i를 n값으로 대입. i가 0이 될 때까지 i를 후위연산자로 빼준다.
		// 그러면서 i를 동시에 프린트, 값을 확인시킨다.
	}
}
