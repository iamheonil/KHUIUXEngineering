package kh202003.kh20200309;

import java.util.Scanner;

public class Programmers {
	public static void main(String[] args) {

//		���� ����
//		�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
//
//		���ѻ���
//		s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
//		����� ��
//		s	return
//		abcde	c
//		qwer	we

		Scanner sc = new Scanner(System.in);

		System.out.print("�ܾ �Է��ϼ��� : ");
		String s = sc.nextLine();

//		System.out.println(s.length());
		int ban = s.length() / 2;

		if (s.length() % 2 == 0) {
			System.out.print(s.charAt(s.length() / 2 - 1));
			System.out.println(s.charAt(s.length() / 2));
		} else {
			System.out.println(s.charAt(ban));
		}

	}
}
