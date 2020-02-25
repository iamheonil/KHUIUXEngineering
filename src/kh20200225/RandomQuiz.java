package kh20200225;

import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {

		// Up & Down Quiz
		// + UP&DOWN 게임
		// - 컴퓨터가 1~50의 랜덤을 생성한다 (= com)
		// - 사용자의 입력을 받는다 (= user)
		// - user가 com보다 낮은지 높은지 판단하여 UP&DOWN을 출력한다
		// (기준은 com)
		// (ex. com == 40 && user == 30 -> UP )
		// - user가 com과 같으면 user 승리
		// - 7번안에 맞추지 못하면 com 승리

		Scanner sc = new Scanner(System.in);

		int comRan;
		int human;
		int cnt = 0;
		
		System.out.println("콤푸타가 랜덤 번호를 생성 했습니다.");
		comRan = (int) (Math.random() * 50 + 1);
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Up & Down : ");
			human = sc.nextInt();
			if (human == comRan) {
				System.out.println("맞췄습니다! 게임을 종료합니다.");
				break;
			} else if (human > comRan) {
				System.out.println("당신의 숫자가 큽니다");
				cnt++;
				System.out.println(cnt);
			} else if (human < comRan) {
				System.out.println("당신의 숫자가 작습니다");
				cnt++;
				System.out.println(cnt);
			}
			if (cnt == 7) {
				System.out.println("7번 안에 맞추지 못하여 컴퓨터의 승리로 게임을 종료합니다.");
				break;
			}			
		}
		
	}
}