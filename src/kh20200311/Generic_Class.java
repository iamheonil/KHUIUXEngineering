package kh20200311;

// ���׸��� ������ class
class Class02<T> {
	
	private T data;
	
	public T display(T data) {
		setData(data);
		
		return data;

	}

	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
		
	}
}

public class Generic_Class {
	public static void main(String[] args) {

		// T ��� �� ���� �ڷ����� ���⼭ String ���� ���ڴ� ��� �ۼ��ߴ�.
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		String fruit = c02.getData();
		
		System.out.println(fruit);
		
		System.out.println();
		
		// T ��� �� ���� �ڷ����� ���⼭ Integer �� ���ڴ� ��� �ۼ��ߴ�.
		Class02<Integer> c03 = new Class02<>();
		
		c03.setData(100);
		int Number = c03.getData();
		
		System.out.println(Number);
				
		
	}
}