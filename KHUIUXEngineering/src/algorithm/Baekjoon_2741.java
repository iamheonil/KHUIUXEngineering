package algorithm;

import java.util.Scanner;

public class Baekjoon_2741 {
	public static void main(String[] args) {

//		�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڿ��� N�� �Է��ϼ���. : ");
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i <= n; i++) {
			System.out.println(count++);
		}
		// 0���� �����ϰ��� �ϸ� i�� 0����,
		// 1���� �����ϰ��� �ϸ� i�� 1����!
	}
}
