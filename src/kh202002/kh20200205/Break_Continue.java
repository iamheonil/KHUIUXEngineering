package kh202002.kh20200205;

public class Break_Continue {
	public static void main(String[] args) {

		int i = 0;	// �ʱ��
		while ( i < 100 ) {	// ���ǽ�
			i++; // ������
			
			if(i % 2 == 0) { // ���� �ݺ����� �Ѿ��.
				continue;	 // Continue => ���� �ݺ��� �ߴ��ϰ� ���� �ݺ� ����
			}
			
			if(i > 10) {	// i �� 10���� ũ�ٸ�
				break;		// break; �� �����Ѵ�.
							// break �� ����Ǹ� �� �̻� ���� �ڵ带 �������� �ʰ� while�� ������ ������ �ȴ�.
		
			}
			System.out.println(i); // ���� �ڵ�
			
		}
	
		System.out.println("==========================");
		
		for(int j = 0; j < 100; j++) {
			if (j % 2 == 0) {
				continue;
			}
			
			if(j > 10) {
				break;
			}
			
			System.out.println(j);
		}
	
		
		
	}
}