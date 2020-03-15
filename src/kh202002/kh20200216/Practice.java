package kh202002.kh20200216;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("이름과 나이를 입력하세요 : ");
		String name = sc.nextLine();
		int i = sc.nextInt();
		System.out.println("이름은 : " + name + "\n나이는 : " + i);
		// 버퍼 확인
	}

}
