package kh20200311;

// �Ϲ� Ŭ����
class Class03 {
	
	// �Ϲ� �޼ҵ�
	public void display(int n) { 
		// ���¸� ���� ���� �ڵ� ������ ���� �ʾҴ�.
	}
	
	// ���׸� �޼ҵ�
	public <T> T print(T t) {
		// ��ȯ������, �Ű�����, ��������, ����ȯ ���� ��� �����ϴ�.
		// �ڷ��� ���� ��� �����ϴ�.
		// ���׸��� Object �� �Ʒ��� �ִ�.
		
		// T data = 123;
		
		// ���������� ��޵Ǿ� null ���� �־���´�.
		T data = null; 
		
		return data;
	}
	
}

// ���׸� Ŭ����
class Class02_1 <T> {
	
	// ���׸� �޼ҵ�
	public <K> void display(K obj, T data) {
		// �̷��� ����ϴ� ��찡 ���� ��� ������ �˰� �־ �ȴ�.
	}
}

public class Generic_Method {
	public static void main(String[] args) {
		
		Class03 c03 = new Class03();
		
		// Ÿ�� �Ķ���͸� �������� �ʾҴµ� �޼ҵ�� �̷��� ����ص� ������.
		// �ڵ����� �����Ǿ��µ� ����� ���� �Ǿ���.
		
		c03.print(123);
		
		c03.<Double>print(123.0);
	}
}