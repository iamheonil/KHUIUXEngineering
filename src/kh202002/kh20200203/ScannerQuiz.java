package kh202002.kh20200203;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		int under = 0;
//		int height = 0;
		

//	result = sc.nextDouble();
		System.out.print("밑변을 입력하세요 : ");
		int under = sc.nextInt();
		System.out.print("높이를 입력하세요 : ");
		int height = sc.nextInt();
	
//		중간중간 테스트 해보는 습관을 들이는것이 좋다.
//		System.out.print("중간점검 : " + under + height);
		
//		형변환을 하게 되면 맨 뒤에 넣어주는것이 좋다.
		double result = (under * height) / (double)2;
		System.out.println("넓이는 : " + result);
	
	}
}