package kh20200207;

public class Sort {
	public static void main(String[] args) {

//		Sort ����.
//		����, ����, ���� ������ �����Ѵ�.
//		���ð� ������ ���� ���� ���ĸ� ����

		int[] arr = { 3, 2, 5, 4, 1 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("< ���� ���� �� >");
		System.out.println();

		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {	// ���� �ݺ�
			for (int j = 0; j < 4; j++) {		// ���� �ݺ�
				if(arr[j] > arr[j+1]) {			// ���� ���� ��������
//				if(arr[j] < arr[j+1]) {			// ���� ���� ��������
					temp = arr[j];				// ���� ��
					arr[j] = arr[j+1];
					arr[j+1] = temp;				
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		/*
		
		[j] > [j+1]
		temp <- j
		j -> j+1 ��
		j+1 -> ����?
		*/
		
	} // Main End
} // Class End