package kh20200219_quiz2;

public class Array implements ArrayAction {
	String[] arr = new String[10];
	int idx = 0;

	// �迭�� ������ ������ �ڿ� ����
	@Override
	public void add(String element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = element;
				idx++;
				return;
			} else if (arr[i] == arr[i]) {
//				arr[i] = null;
			}
		}

	}

	// element�� �����ϸ� ����
	// ����) �迭�� ��� ���̿� ������� ������ �����Ѵ�
	@Override
	public void remove(String element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
//				arr[i] = null;
				idx--;
				arr[i] = arr[i + 1];
				arr[i + 1] = null;

			}
		}
	}

	// idx��ġ�� element�� ��ȯ
	@Override
	public String get(int idx) {
		// TODO Auto-generated method stub
		return arr[idx];
	}

	// element�� idx�� ��ȯ
	// ������ -1
	@Override
	public int find(String element) {
		// TODO Auto-generated method stub
		idx = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				idx = i;
			}
		}
		return idx;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			} else {
//			System.out.println("��");
			}
		}
	}
}
