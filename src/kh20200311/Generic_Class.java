package kh20200311;

// 제네릭을 적용한 class
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

		// T 라고 써 놓은 자료형을 여기서 String 으로 쓰겠다 라고 작성했다.
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		String fruit = c02.getData();
		
		System.out.println(fruit);
		
		System.out.println();
		
		// T 라고 써 놓은 자료형을 여기서 Integer 로 쓰겠다 라고 작성했다.
		Class02<Integer> c03 = new Class02<>();
		
		c03.setData(100);
		int Number = c03.getData();
		
		System.out.println(Number);
				
		
	}
}