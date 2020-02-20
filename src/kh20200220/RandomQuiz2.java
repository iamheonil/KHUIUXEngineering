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
			System.out.print("몇 번 부를까요? : ");
			user = sc.nextInt();
			com = ran.nextInt(3) + 1;

			if (user < 4) {
				for (int i = 1; i <= user; i++) {
//					count = i;
					System.out.println("유저 : " + count++);
					if (count > 31) {
						System.out.println("당신의 패배입니다.");
						return;
					}
				}
				for (int j = 1; j <= com; j++) {
					System.out.println("컴퓨터 : " + count++);
					if (count > 31) {
						System.out.println("당신의 승리입니다.");
						break;
					}
				}
			}
		} while (count <= 31);
		System.out.println("종료!");

	} // Method End
} // Class End



//do {
//System.out.print("한번 두번 세번 부를 값을 입력하세요. : ");
//user = sc.nextInt();
//if (user == 1) {
//	
//	count++;
//	System.out.println(count);
//} else if (user == 2) {
//	System.out.println("유저 : 2!");
//	count++;
//	count++;
//} else if (user == 3) {
//	System.out.println("유저 : 3!");
//	count++;
//	count++;
//	count++;
//} else {
//	System.out.println("바른 값을 입력하지 않으셨기 때문에 패배입니다.\n");
//	break;
//}
//
//System.out.println(count);
//com = ran.nextInt(3) + 1;
//
//if (com == 1) {
//	System.out.println("콤푸타 : 1!");
//	count++;
//
//} else if (com == 2) {
//	System.out.println("콤푸타 : 2!");
//	count++;
//	count++;
//} else if (com == 3) {
//	System.out.println("콤푸타 : 3!");
//	count++;
//	count++;
//	count++;
//}
//
////System.out.println("현재 숫자 : " + count);
//
//} while (count < 31);
//System.out.println("게임이 끝났습니다.");