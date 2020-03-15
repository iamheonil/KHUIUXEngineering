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
				System.out.println("가위 : 1 / 바위 : 2 / 보 : 3 / 종료 : 0");
				System.out.print("사용자의 표식을 입력해주세요. : ");
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
					System.out.println("프로그램이 종료 되었습니다.");
					return;
				}

				if (user == 1) {
					System.out.println("유저의 표식 : 가위");
				} else if (user == 2) {
					System.out.println("유저의 표식 : 바위");
				} else {
					System.out.println("유저의 표식 : 보");
				}

				if (com == 1) {
					System.out.println("컴퓨터의 표식 : 가위");
				} else if (com == 2) {
					System.out.println("컴퓨터의 표식 : 바위");
				} else {
					System.out.println("컴퓨터의 표식 : 보");
				}

				if (user == 1 && com == ba) {
					System.out.println("사용자가 패배했습니다.");
				} else if (user == 2 && com == 3) {
					System.out.println("사용자가 패배했습니다.");
				} else if (user == 3 && com == 1) {
					System.out.println("사용자가 패배했습니다.");
				} else if (user == com) {
					System.out.println("비겼습니다.");
				} else if (3 < user) {
					System.out.println("사용자가 이상한 수를 입력했습니다.\n무효입니다.\n");
				} else {
					System.out.println("사용자가 이겼습니다.");
				}
			} while (user < 1 || user > 3);
			System.out.println();
		}
	}
}