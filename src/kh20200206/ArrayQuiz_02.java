package kh20200206;

public class ArrayQuiz_02 {
	public static void main(String[] args) {

//		 int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		 �迭�� ����� �� ������ Ǫ�ÿ�

		int arr[] = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 };
		int invert_arr[] = new int[10];

		int first = 0;
		int sec = 0;

//		Q1.
//		���� ���ڸ� invert_arr��� �迭�� �Ųٷ� �Է��Ͻÿ�
//		=> invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }

//		for (int i = 0; i <= 9; i++) {
//				invert_arr[i] = arr[9-i];
//				System.out.print(invert_arr[i] + ", ");
//			}

//		Q2.
//		���� ������ (¦����° �ε��� ������ ��) - (Ȧ����° �ε��� ������ ��)�� ���Ͻÿ�
//		������ -5�� ���;� ��.

//		for (int i = 0; i < arr.length; i++) {
//			if (i % 2 == 0) {
//				sec += arr[i];
//				
//			} else if(arr[i] % 2 != 0) {
//				first += arr[i];
//			}
//		} System.out.println(first - sec);

//		Q3. 
//		���� �迭�� ���� ���ڰ� 1���� �ǰ��Ͽ� rank_arr��� �迭�� ������ �Է��Ͻÿ�
//		    => arr : 	 { 10, 17, 3,  9, 27, 10, 8, 9, 13, 21 }
//		    => rank_arr :{  5,  3, 10, 7,  1,  5, 9, 7,  4,  2 }

		int vs_arr[] = new int[10];
		int rank_cArr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
			for (int i = 0; i < vs_arr.length; i++) {
				for (int j = 0; j < vs_arr.length; j++) {
				if(arr[i] < arr[j]) {
						rank_cArr[i]++;
					}
				} System.out.print(arr[i] + "\t");
			} System.out.println();
			
			for (int i = 0; i < vs_arr.length; i++) {
				System.out.print(rank_cArr[i] + "��\t");
			}

//		Q4. 
//		�ߺ��� ���� over_arr�� �ְ� �ߺ����� ���� ���� ret_arr�� �Է��Ͻÿ� ���ı��� �ߴٸ�
//		    => over_arr : { 9, 10 }
//		    => ret_arr : { 3, 8, 13, 17, 21, 27 }

// ==========================================================================================

	} // Main End
} // Class End