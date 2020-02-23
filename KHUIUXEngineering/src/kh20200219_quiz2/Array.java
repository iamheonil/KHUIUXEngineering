package kh20200219_quiz2;

public class Array implements ArrayAction {
	String[] arr = new String[10];
	int idx = 0;

	// 배열의 마지막 데이터 뒤에 삽입
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

	// element가 존재하면 삭제
	// 주의) 배열의 요소 사이에 빈공간이 없도록 유지한다
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

	// idx위치의 element를 반환
	@Override
	public String get(int idx) {
		// TODO Auto-generated method stub
		return arr[idx];
	}

	// element의 idx를 반환
	// 없으면 -1
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
//			System.out.println("빔");
			}
		}
	}
}
