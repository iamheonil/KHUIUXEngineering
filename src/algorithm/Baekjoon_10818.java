package algorithm;

import java.util.Scanner;

// N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
// ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.


public class Baekjoon_10818 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�� �Է����ּ���. : ");
		int n = sc.nextInt();
		int[] result = new int[n];
		
		for(int i = 0; i < n; i++) {
			result[i] = (int) (Math.random() * 1000000);
			System.out.print(result[i] + " ");
		}
		
		
		
	}
}
