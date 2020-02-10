package kh20200204;

import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 구구단 중 입력받은 수의 단수를 출력하여라
//		System.out.print("첫번째 수를 입력해주세요 : ");
//		int a = sc.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			int result = a * i;
//			
//			System.out.println(a + " * " + i + " = " + result);
//		}

		// 어떤 수의 약수를 구하는 프로그램을 작성하여라
		// 약수 = 어떤 수를 정수로 나눌 수 있는 수

//		System.out.print("약수 구할 값을 입력하세요. : ");
//		int yak = sc.nextInt();
//		
//		for (int i = 1; i <= yak; i++) {
//			if(yak % i == 0) {
//				System.out.print(i + " ");	
//			} 
//		}

		// 1에서 1000까지의 정수중에서 4로 나누어도
		// 6으로 나누어도 나머지가 1인 수의 합을 출력하라.
		// > 41916

//		int LoopSu = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 4 == 1 && i % 6 == 1) {
//				LoopSu += i;
//			}
//		}System.out.println(LoopSu);

		// 입력받은 두수의 최소 공배수와 최대 공약수를 구하는
		// 프로그램을 작성하라.
		// 최소공배수 = 공배수 중에서 가장 작은 정수
		// 최대공약수 = 공약수 중에서 절대치가 가장 큰 수

//		int val1, val2;
//		int r = 1;
//		int LCM;
//
//		System.out.print("첫번째 수를 입력하시오 : ");
//		val1 = sc.nextInt();
//		System.out.print("두번째 수를 입력하시오 : ");
//		val2 = sc.nextInt();
//
//		int tmp1 = val1, tmp2 = val2; 	// 최소공배수를 구하기 위해 입력받은 값 저장
//		if (val1 < val2) {				// 2번째 입력수가 클 경우 큰수를 val1으로 변경
//			val1 = tmp2;
//			val2 = tmp1;
//		}
//
//		while (r > 0) {					// GCD 구하기
//			r = val1 % val2;
//			val1 = val2;
//			val2 = r;
//		}
//		
//		LCM = tmp1 * tmp2 / val1;		// LCM 구하기
//		System.out.println("GCD(최대공약수) : " + val1);
//		System.out.println("LCM(최소공배수) : " + LCM);

		// 1에서부터 입력된 어떤 수까지 내에 있는 소수를
		// 찾는 프로그램을 작성하라.
		// * 소수 = 1 과 자신의 숫자로만 나누어 떨어지는 수
		// * ex) 2,3,5,7,11,13, ...

		int x = 0;
		System.out.print("소수를 구할 어떤 수를 입력해주세요. : ");
		x = sc.nextInt();
		int result = 0;

		for (int i = 2; i <= x; i++) {
			boolean isPrime = true; // 초기 값
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
				}
				// 소수가 아니다.
				isPrime = false;
				break;
			}
			if (isPrime) { // 소수 일때만 값을 출력
				System.out.print(i + " ");
			}
		}
		sc.close();

//		System.out.print("수를 입력해보세요 : ");
//		int scInt = sc.nextInt();
//		
//		int count = 0;
//		for (int i = 1; i <= scInt; i++)
//		{
//			for (int j = 2; j <= scInt; j++) {
//				if (i % j == 0) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				System.out.print(i + ", ");
//			}
//				count = 0;
//		}
		// i = 1부터 시작, scInt(스캔값)과 같아질 때 까지 1차 포문
		// 안쪽 포문 1은 아무수도 아니기에 2부터 시작, 마찬가지로 scInt(스캔값)과 같아질 때까지 증가한다.
		// i, j 둘 다 입력 값이기때문에 바깥 포문과 안쪽 포문이 차례대로 증가하면서 연산한다.
		// 소수는 1을 포함한 나의 숫자로만 나눠져야하기때문에 나눴을 때 나머지가 0이라면 count를 더한다.
		// count가 1이 된다면 바깥포문에서 i의 숫자와 콤마를 print 해주고 다시 0으로 초기화 해준다.
		// 이 과정을 입력한 scInt 까지 무한반복 결과가 출력된다.

		// Q1.
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//		}

		// Q2.
//		for (int i=0; i < 5; i++) {
//			System.out.println("*");
//		}

		// Q3.
//		for (int i = 1; i < 5; i++) {
//		for (int j = 1; j < 5; j++) {
//			System.out.print("*");
//		}
//		System.out.println("*");
//	}

		// Q4.
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j < 6; j++) {
//				System.out.print(i);
//			}
//			System.out.println("");
//		}
//		
//		System.out.println("");
//
//		for (int i = 0; i < 5; i++) {
//			
//			for (int j = 0; j < 5; j++) {
//				System.out.print(i + 1);
//			}
//			
//			System.out.println("");
//		}

		// Q5.
//		for(int j = 0; j < 5; j++) {
//			for(int i = 0; i < 5; i++) {
//			System.out.print(i + 1);
//			} System.out.println();
//		}

		// Q6. - 12345 23456 34567 45678 56789

//		for(int i = 0; i < 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//			System.out.print(i + j);
//			} System.out.println("");
//		}

		// Q7. 역순으로다가 56789 ~ 12345
//		for (int i = 5; i > 0; i--) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(i + j);
//			}System.out.println("");
//		}

//		for (int i = 5; i > 0; i--) {
//			for (int j = i; j <= i+4; j++) {
//				System.out.print(j);
//			}System.out.println();
//		}

//		for (int i = 1; i < 6; i++) {
//			System.out.print("*");
////			for(int j = 1; j < 2; j++) {
////				System.out.println("");
////			}
//		}

//			for(int j = 0; j <= 4; j++) {
//				System.out.print(i + j);
//			}System.out.println("");
//		}

		// Q8. 별 찍기
//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
////
//		// Q9. 별 역으로 찍기
//		for (int i = 6; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//		// Q10. 별 5 4 3 2 1 순으로 찍기
		// *****
		// ****
		// *** .. 2개 1개까지
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 5; j >= 1; j--) {
//				if (j > i) {
//				System.out.print(" ");
//				} else {
//					System.out.print("*");	
//				}
//			} System.out.println();
//		} 
//		
		// Q11. 별 역으로
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= 5; j++) {
//				if (i > j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}

		// Q12. 별 세트1
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// Q13. 별 세트2
//		for (int i = 5; i > 1; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

	} // Main End
} // Class End
