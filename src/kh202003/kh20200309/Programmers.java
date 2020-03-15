package kh202003.kh20200309;

import java.util.Scanner;

public class Programmers {
	public static void main(String[] args) {

//		문제 설명
//		단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//		제한사항
//		s는 길이가 1 이상, 100이하인 스트링입니다.
//		입출력 예
//		s	return
//		abcde	c
//		qwer	we

		Scanner sc = new Scanner(System.in);

		System.out.print("단어를 입력하세요 : ");
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
