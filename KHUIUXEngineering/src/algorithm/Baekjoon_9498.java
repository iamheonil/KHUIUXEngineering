package algorithm;

import java.util.Scanner;

public class Baekjoon_9498 {
	public static void main(String[] args) {

//		���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ���. : ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.print("A");
		} else if (score >= 80) {
			System.out.print("B");
		} else if (score >= 70) {
			System.out.print("C");
		} else if (score >= 60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
	}
}
