package kh202002.kh20200211_method;



// ��� Ŭ����

public class ProfMethod_04 {

	//�迭�� ��� ��� ���(print)
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
	public void mul10(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 10;
		}
	}
	
	public int[] mul10v2(int[] arr) { 
		int[] res = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			res[i] = arr[i] * 10;
		}
		return res;
	} //���������
	// ���������������������
	// �޼ҵ忡�� Return ��?
	// 1. ��ȯ�� ����.
	// 2. �޼ҵ� ����.
	// ** return ������ Ÿ���� void ��� �޼ҵ带 ��ȯ���� �������� �ʰ� �޼ҵ带 �����Ű�� ���Ҹ� �����Ѵ�.
	// ** main() �޼ҵ忡�� return �ڵ带 ������ ��� ���α׷��� ���Ḧ �ǹ��Ѵ�.
	// 3. 
	//

	
}