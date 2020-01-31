package kh20200131;

import java.util.Scanner;

public class Source5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int 는 21~2억 사이 그 이상은 Long
		Long result;
		
		System.out.print("숫자 입력하세요 : ");
		result = sc.nextLong();
		System.out.println("입력하신 숫자는 " + result);
		
	}
}
