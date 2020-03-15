package kh202002.kh20200203;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		double result;
//		
//		System.out.print("소수를 입력하셍 : ");
//		result = sc.nextDouble();
//		System.out.println("입력하신 값은 : " + result);
//	
//		문자열 - > java.lang 패키지
//		자바 프로그래밍에 필요한 기본적인 클래스를 모아놓은 패키지 
//		String str;
//		System.out.println(str);
		
//		String str;
//		System.out.print("단어입력 : ");
//		str = sc.nextLine();
//		System.out.println("입력하신 단어는 : " + str);
		
//		String str = "Apple";
//		str.charAt(3);
//		char ch = str.charAt(3);
//		System.out.println(ch);
//		실행시 l 이 출력 되는 이유는 index가 1이 아닌 0부터 올라가기 때문이다.
//		
//		아래의 두 방식 다 이해하고 있으면 된다.
//		System.out.print("단어를 입력해주세요 : ");
//		String input = sc.nextLine();
//		char inputChar = input.charAt(0);
//		System.out.println("입력하신 단어의 0번째는 : " + inputChar);
//		
//		System.out.print("입력 : ");
//		String input2 = sc.nextLine();
//		char inputChar2 = input2.charAt(0);
//		System.out.println(inputChar2);	
		
//		아래의 세 줄은 잘못된 것은 아니지만 보기가 불편하고 웬만하면 변수에 저장해서 출력하는것이 좋다.
//		변수에 저장 없이 입력 즉시 출력하는 방식.
		System.out.print("성별을 입력하세요 : ");
		String gResult = sc.nextLine();
		System.out.println("입력하신 성별은 : " + gResult.charAt(0));
		
		
	}
}