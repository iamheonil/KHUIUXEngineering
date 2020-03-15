package kh202002.kh20200203;

import java.util.Scanner;

public class Source3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" -- 입력 -- ");
		System.out.print("숫자를 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("문자를 입력 : ");
		sc.nextLine(); // 버퍼의 남아있는 '\n'을 지워준다.
//		위의 nextInt를 사용하게 되면 아래의 sc.nextLine() 이 먹통이 되는데 이것을 방지하고자 바로위의 sc.nextLine() 을 사용해준다.
//		* 부가설명
//		nextLine() 메소드를 사용하기 전에 nextLine() 이외의 모든 next() 계열 메소드를 사용한 적이 있다면 nextLine() 직전에 nextLine()을 한번 더 실행해야한다.
		String str = sc.nextLine();
		
		System.out.println(" -- 출력 -- ");
		System.out.println(num);
		System.out.println(str);
		
	}
}