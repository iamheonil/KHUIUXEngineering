package algorithm;

import java.util.Scanner;

public class Baekjoon_8393 {
	public static void main(String[] args) {

//		n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.print(sum);
		// sum += n; �� ȥ���ϱ� ��� i�� 0���� n�� ������������� �����ϴ� ���α׷��̱� ������
		// �Ű�Ἥ �ڵ��� ��!
	}
}
