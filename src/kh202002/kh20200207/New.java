package kh202002.kh20200207;

import java.util.Scanner;

public class New {
	public static void main(String[] args) {

//	new ������
//	���� �Ҵ� ������

//	�Ҵ� : �������� ����(������� ����)

//	���� �Ҵ� : ���α׷� ���� ���� �غ� ������ �Ҵ�, Compile-time
//	���� �Ҵ� : ���α׷� ���� ���߿� �غ�, Run-time

//		int num; // int�� ���� ���� -> ���� �Ҵ�
		// ������ �����ϴ°� ���� �Ҵ�

//		int[] arr; // int �� �迭 ���� ���� -> ���� �Ҵ�

//		arr = new int[5]; // int[5] �迭 ���� -> ���� �Ҵ�
		// ���� �Ҵ��� �ϸ� ������ ������ ������ �� �ִ� �������� ��ȯ�Ѵ�.
		//

//		int[] arr2 = new int[-10];
		// �̷��Ŵ� ����ǰ� -10 ũ���� �Ҵ��� �ϱ⶧���� �������ڸ��� ������ ����
		// �迭 ���� ������ �迭 ���� ������ �ٸ���.

		// �迭���� ���� -> ���� �Ҵ�
		// �迭���� ���� -> ���� �Ҵ�

		int[][] score = new int[3][];
		// 3���� ������ �����ϳ� �� �л����� ������� �𸥴�.

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + "�� �л��� �������? : ");
			int len = sc.nextInt();

			score[i] = new int[len];
		}
		
		
	}
}
