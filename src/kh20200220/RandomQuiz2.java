package kh20200220;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz2 {
	public static void main(String[] args) {

		int user;
		int com;
		int count = 1;

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("�� �� �θ����? : ");
			user = sc.nextInt();
			com = ran.nextInt(3) + 1;

			if (user < 4) {
				for (int i = 1; i <= user; i++) {
//					count = i;
					System.out.println("���� : " + count++);
					if (count > 31) {
						System.out.println("����� �й��Դϴ�.");
						return;
					}
				}
				for (int j = 1; j <= com; j++) {
					System.out.println("��ǻ�� : " + count++);
					if (count > 31) {
						System.out.println("����� �¸��Դϴ�.");
						break;
					}
				}
			}
		} while (count <= 31);
		System.out.println("����!");

	} // Method End
} // Class End



//do {
//System.out.print("�ѹ� �ι� ���� �θ� ���� �Է��ϼ���. : ");
//user = sc.nextInt();
//if (user == 1) {
//	
//	count++;
//	System.out.println(count);
//} else if (user == 2) {
//	System.out.println("���� : 2!");
//	count++;
//	count++;
//} else if (user == 3) {
//	System.out.println("���� : 3!");
//	count++;
//	count++;
//	count++;
//} else {
//	System.out.println("�ٸ� ���� �Է����� �����̱� ������ �й��Դϴ�.\n");
//	break;
//}
//
//System.out.println(count);
//com = ran.nextInt(3) + 1;
//
//if (com == 1) {
//	System.out.println("��ǪŸ : 1!");
//	count++;
//
//} else if (com == 2) {
//	System.out.println("��ǪŸ : 2!");
//	count++;
//	count++;
//} else if (com == 3) {
//	System.out.println("��ǪŸ : 3!");
//	count++;
//	count++;
//	count++;
//}
//
////System.out.println("���� ���� : " + count);
//
//} while (count < 31);
//System.out.println("������ �������ϴ�.");