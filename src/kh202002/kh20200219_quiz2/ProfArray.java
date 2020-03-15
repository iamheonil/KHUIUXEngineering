package kh202002.kh20200219_quiz2;


public class ProfArray implements ArrayAction {
	String[] arr = new String[10];

	@Override
	public void add(String element) {
		int idx; //���� ��ġ �ε���
		
//		//���� ��ġ ã�� - for�� �̿�
//		for(idx=0; idx<arr.length; idx++) { //�迭�� ���̸�ŭ
//			if( arr[idx] == null ) { //����ִ� ������ idxã��
//				break;
//			}
//		}
		
		// ���� ��ġ ã�� - find()�Լ� �̿�
		idx = find(null);
		
		
		// �迭�� ũ�⺸�� ���� �����͸� �Է��ϴ� ��Ȳ - ���� ó��
		if( idx >= arr.length || idx == -1 ) {
			return;
		}
		
		arr[idx] = element; //����
	}
	
	@Override
	public void print() {
		int idx;
		
		//�迭�� ��� ��� ���
		for(idx=0; idx<arr.length; idx++) {
			if( arr[idx] != null ) { //null�� �ƴϸ� ���
				System.out.println( arr[idx] );
			}
		}
	}

	@Override
	public void remove(String element) {
		int idx = find(element);
		
		// ������� ��ҷκ��� ������ �ִ� ��ҵ���
		//��� ��ĭ�� ��ܼ� �����Ѵ�
		for(; idx<arr.length-1; idx++) {
			arr[idx] = arr[idx+1];
		}
		
		// �迭�� ������ ��ҿ� null�� ����
		arr[idx] = null;
	}

	@Override
	public String get(int idx) {
		return arr[idx];
	}

	@Override
	public int find(String element) {
		int idx; //��ġ �ε���
		
		//ã�� ������ ��ġ ã��
		for(idx=0; idx<arr.length; idx++) { //�迭�� ���̸�ŭ
			if( arr[idx] == element ) { //element�� ���� ������ ��� ã��
				break;
			}
		}
		
		if(idx==arr.length) { //�迭�ȿ� ������ -1 ��ȯ
			return -1;
		}
		
		return idx; //ã�� �ε��� ��ȯ
	}
}