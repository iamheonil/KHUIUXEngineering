package algorithm;

import java.util.Scanner;

public class Baekjoon_10952 {
	public static void main(String[] args) {

//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A�� �Է��ϼ���. : ");
		int a = sc.nextInt();
		System.out.print("B�� �Է��ϼ���. : ");
		int b = sc.nextInt();
		
		while(a != 0 && b != 0) {
			System.out.println(a + b);
		}
		// �̿ϼ� �����ؾ���.
		
	}
}