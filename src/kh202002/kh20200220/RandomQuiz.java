package kh202002.kh20200220;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int user;
		int com;

		int ga = 0;
		int ba = 0;
		int bo = 0;

		while (true) {
			com = ran.nextInt(3) + 1;

			do {
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("���� : 1 / ���� : 2 / �� : 3 / ���� : 0");
				System.out.print("������� ǥ���� �Է����ּ���. : ");
				user = sc.nextInt();
				System.out.println();

				if (user == 1) {
					ga = 1;
				} else if (user == 2) {
					ba = 2;
				} else if (user == 3) {
					bo = 3;
				}

				if (com == 1) {
					ga = 1;
				} else if (com == 2) {
					ba = 2;
				} else {
					bo = 3;
				}

				if (user == 0) {
					System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
					return;
				}

				if (user == 1) {
					System.out.println("������ ǥ�� : ����");
				} else if (user == 2) {
					System.out.println("������ ǥ�� : ����");
				} else {
					System.out.println("������ ǥ�� : ��");
				}

				if (com == 1) {
					System.out.println("��ǻ���� ǥ�� : ����");
				} else if (com == 2) {
					System.out.println("��ǻ���� ǥ�� : ����");
				} else {
					System.out.println("��ǻ���� ǥ�� : ��");
				}

				if (user == 1 && com == ba) {
					System.out.println("����ڰ� �й��߽��ϴ�.");
				} else if (user == 2 && com == 3) {
					System.out.println("����ڰ� �й��߽��ϴ�.");
				} else if (user == 3 && com == 1) {
					System.out.println("����ڰ� �й��߽��ϴ�.");
				} else if (user == com) {
					System.out.println("�����ϴ�.");
				} else if (3 < user) {
					System.out.println("����ڰ� �̻��� ���� �Է��߽��ϴ�.\n��ȿ�Դϴ�.\n");
				} else {
					System.out.println("����ڰ� �̰���ϴ�.");
				}
			} while (user < 1 || user > 3);
			System.out.println();
		}
	}
}