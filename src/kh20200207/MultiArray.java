package kh20200207;

import java.util.Scanner;

public class MultiArray {
	public static void main(String[] args) {

		// 2차원 배열
		// 배열의 요소로 배열을 넣는다
		// ++ 다차원 배열

//		int[][] arr2; // 2차원 배열 선언
//		arr2 = new int[3][3]; // 2차원 배열 생성
//								// [3] [3] 생성
//								// 3행 3열짜리 생성
//		// 어떤 프로그램을 제작할 것인지에 따라 배열 크기를 조정해준다.

//		int[][] arr4;
//		arr4 = new int[2][3];
//		
//		arr2[2][2] = 555;
//		
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i][i] + " s");
//			
//	
//		}

//		int[] arr1D = { 1, 2, 3, 4, 5 }; // 1차원 배열
//
//		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2차원 배열
//
//		int[][][] arr3D = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 1, 2, 3 }, { 4, 5, 6 } } }; // 3차원 배열

//		for(int i = 0; i < 2; i++) { 
//			for(int j = 0; j < 3; j++) {
//				System.out.print(arr2D[i][j] + " ");
//			}
//			System.out.println();
//		}

//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				arr2D[i][j] = (i + 1) * 10 + (j + 1);
//				System.out.print(arr2D[i][j] + " ");
//			}
//		}

//		int[][] arr = new int[3][4];
		// 4개짜리 한줄 배열을 3개 챡챡챡
//		int[][] arr = new int[3][];
//
//		arr[0] = new int[3];
//		arr[1] = new int[2];
//		arr[2] = new int[7];

//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
		// 기본적인 2차원 배열의 선언과는 다른 방식이다.

//		for (int i = 0; i < arr.length; i++) {			// 기본적인 참조형의 관리법.
//			for (int j = 0; j < arr[i].length; j++) { 	// ?0?;;
//				System.out.print(arr[i][j] + " ");
//			} System.out.println();
//		}

//		System.out.println(arr[2][]); --> 이차원 배열에서 new int[3][] 이런식으로 비워놓게 되면 NullPointerException 발생

		// 1 ~ 3학년
		// 2개의 반
		// 4명의 학생
		// 3과목 점수

		int[][][][] score = new int[3][2][4][3]; // 점수를 저장할 수 있는 공간.
		// 이렇게 4차원 배열을 만들어버리면 반복문도 4 중첩 해야하기 때문에
		// 고정 되어있는 항목을 제외하고 유동적인 항목들은 따로 빼내어 반복문을 다시 돌려야한다.

		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];

//		2명의 학생정보를 관리하게 됐다.									] 1
//		국, 영, 수 점수를 입력하여 저장하고								] 묶음 

//		총점을 구한다.													] 1묶음
//		평균을 구한다.													] 1묶음

//		마지막엔 전체 출력.												] 1묶음

		int[][] stu = new int[2][3];
		int[] sum = new int[2];
		double[] avg = new double[2];

		String subject[] = { "국어", "영어", "수학" };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length + 1; j++) {
				System.out.print(i + 1 + "번째 핵상의 " + subject[j] + " 입력 : ");
				stu[i][j] = sc.nextInt();
			}
		}

		System.out.println();

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < stu[i].length; j++) {
				sum[i] += stu[i][j];
			}
		}

//		for (int i = 0; i < stu.length; i++) {
//			for (int j = 0; j < stu[i].length; j++) {
//				System.out.println(i + 1 + " 번째 학생의 점수는 : " + stu[i][j]);
//			}
//			System.out.println();
//		}

//		for (int i = 0; i < sum.length; i++) {
//			System.out.println(i + 1 + " 번째 학생의 총 점수는 : " + sum[i]);
//		}

		for (int i = 0; i < avg.length; i++) {
			avg[i] = sum[i] / (double) stu[i].length;
		}
		

		for (int i = 0; i < stu.length; i++) {
			
			System.out.println((i + 1) + " 번째 학생은 총 점수는 : " + sum[i]);
			for (int j = 0; j < stu.length; j++) {
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
//			System.out.print((i + 1) + "번" + sum[i][j] + " ");
			}
//			System.out.printf("\t%.2f\n", avg[j]);
		}

		//

	} // Main End
} // Class End