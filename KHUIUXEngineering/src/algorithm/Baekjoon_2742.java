package algorithm;

import java.util.Scanner;

public class Baekjoon_2742 {
	public static void main(String[] args) {

//		�ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڿ��� N�� �Է��ϼ���. : ");
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
		// i�� n������ ����. i�� 0�� �� ������ i�� ���������ڷ� ���ش�.
		// �׷��鼭 i�� ���ÿ� ����Ʈ, ���� Ȯ�ν�Ų��.
	}
}
