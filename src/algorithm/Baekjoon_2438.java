package algorithm;

import java.util.Scanner;

public class Baekjoon_2438 {
	public static void main(String[] args) {

//		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

		Scanner sc = new Scanner(System.in);

		System.out.print("N�� �Է��ϼ���. : ");
		int n = sc.nextInt();
		String Star = "";

		for (int i = 1; i <= n; i++) {
			System.out.println(Star += "*");
		}
		// ������������ ���� ����������
		// ȿ������ �����ϰ� �����ϱ� ���� String ������ ���� �� *�� ��ø�ϴ� ������ �����߽��ϴ�.
	}
}