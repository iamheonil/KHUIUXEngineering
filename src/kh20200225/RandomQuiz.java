package kh20200225;

import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {

		// Up & Down Quiz
		// + UP&DOWN ����
		// - ��ǻ�Ͱ� 1~50�� ������ �����Ѵ� (= com)
		// - ������� �Է��� �޴´� (= user)
		// - user�� com���� ������ ������ �Ǵ��Ͽ� UP&DOWN�� ����Ѵ�
		// (������ com)
		// (ex. com == 40 && user == 30 -> UP )
		// - user�� com�� ������ user �¸�
		// - 7���ȿ� ������ ���ϸ� com �¸�

		Scanner sc = new Scanner(System.in);

		int comRan;
		int human;
		int cnt = 0;
		
		System.out.println("��ǪŸ�� ���� ��ȣ�� ���� �߽��ϴ�.");
		comRan = (int) (Math.random() * 50 + 1);
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Up & Down : ");
			human = sc.nextInt();
			if (human == comRan) {
				System.out.println("������ϴ�! ������ �����մϴ�.");
				break;
			} else if (human > comRan) {
				System.out.println("����� ���ڰ� Ů�ϴ�");
				cnt++;
				System.out.println(cnt);
			} else if (human < comRan) {
				System.out.println("����� ���ڰ� �۽��ϴ�");
				cnt++;
				System.out.println(cnt);
			}
			if (cnt == 7) {
				System.out.println("7�� �ȿ� ������ ���Ͽ� ��ǻ���� �¸��� ������ �����մϴ�.");
				break;
			}			
		}
		
	}
}