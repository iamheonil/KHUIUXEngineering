package kh20200207;

import java.util.Scanner;

public class MultiArray {
	public static void main(String[] args) {

		// 2���� �迭
		// �迭�� ��ҷ� �迭�� �ִ´�
		// ++ ������ �迭

//		int[][] arr2; // 2���� �迭 ����
//		arr2 = new int[3][3]; // 2���� �迭 ����
//								// [3] [3] ����
//								// 3�� 3��¥�� ����
//		// � ���α׷��� ������ �������� ���� �迭 ũ�⸦ �������ش�.

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

//		int[] arr1D = { 1, 2, 3, 4, 5 }; // 1���� �迭
//
//		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2���� �迭
//
//		int[][][] arr3D = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 1, 2, 3 }, { 4, 5, 6 } } }; // 3���� �迭

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
		// 4��¥�� ���� �迭�� 3�� �m�m�m
//		int[][] arr = new int[3][];
//
//		arr[0] = new int[3];
//		arr[1] = new int[2];
//		arr[2] = new int[7];

//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
		// �⺻���� 2���� �迭�� ������� �ٸ� ����̴�.

//		for (int i = 0; i < arr.length; i++) {			// �⺻���� �������� ������.
//			for (int j = 0; j < arr[i].length; j++) { 	// ?0?;;
//				System.out.print(arr[i][j] + " ");
//			} System.out.println();
//		}

//		System.out.println(arr[2][]); --> ������ �迭���� new int[3][] �̷������� ������� �Ǹ� NullPointerException �߻�

		// 1 ~ 3�г�
		// 2���� ��
		// 4���� �л�
		// 3���� ����

		int[][][][] score = new int[3][2][4][3]; // ������ ������ �� �ִ� ����.
		// �̷��� 4���� �迭�� ���������� �ݺ����� 4 ��ø �ؾ��ϱ� ������
		// ���� �Ǿ��ִ� �׸��� �����ϰ� �������� �׸���� ���� ������ �ݺ����� �ٽ� �������Ѵ�.

		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];

//		2���� �л������� �����ϰ� �ƴ�.									] 1
//		��, ��, �� ������ �Է��Ͽ� �����ϰ�								] ���� 

//		������ ���Ѵ�.													] 1����
//		����� ���Ѵ�.													] 1����

//		�������� ��ü ���.												] 1����

		int[][] stu = new int[2][3];
		int[] sum = new int[2];
		double[] avg = new double[2];

		String subject[] = { "����", "����", "����" };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length + 1; j++) {
				System.out.print(i + 1 + "��° �ٻ��� " + subject[j] + " �Է� : ");
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
//				System.out.println(i + 1 + " ��° �л��� ������ : " + stu[i][j]);
//			}
//			System.out.println();
//		}

//		for (int i = 0; i < sum.length; i++) {
//			System.out.println(i + 1 + " ��° �л��� �� ������ : " + sum[i]);
//		}

		for (int i = 0; i < avg.length; i++) {
			avg[i] = sum[i] / (double) stu[i].length;
		}
		

		for (int i = 0; i < stu.length; i++) {
			
			System.out.println((i + 1) + " ��° �л��� �� ������ : " + sum[i]);
			for (int j = 0; j < stu.length; j++) {
			System.out.println("��ȣ\t����\t����\t����\t����\t���");
//			System.out.print((i + 1) + "��" + sum[i][j] + " ");
			}
//			System.out.printf("\t%.2f\n", avg[j]);
		}

		//

	} // Main End
} // Class End