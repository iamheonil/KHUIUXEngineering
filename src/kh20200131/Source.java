package kh20200131;

public class Source {
	public static void main(String[] args) {

// ���� ������ - ���迬���ڶ�� �θ��⵵�ϰ� �񱳿����ڶ�� �θ��⵵ �Ѵ�.
// <, >, <=, >=, ==, !=		// ! �� ������(Not)�̱⿡ != �� ���� �ʴٰ� �Ǵ°��̴�.
// lt, gt, le, ge, eq, ne ����
// less than, greater than, less than equal, greater than equal, equal, not equal
// ����			ū			�۰ų� ����			ũ�ų� ����		 ����	���� ����
// ����� �ܿ�°��� ����.
// ���迬���� ���(����)�� ��, ����(BooleanŸ��) ���� ǥ���ȴ�.
// 
// 
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 == num2 : " + (num1 == num2));	// False
		System.out.println("num1 != num2 : " + (num1 != num2)); // True

		System.out.println("num1 < num2 : " + (num1 < num2));	// True
		System.out.println("num1 > num2 : " + (num1 > num2)); 	// False
		
		System.out.println("num1 <= num2 : " + (num1 <= num2));	// True
		System.out.println("num1 >= num2 : " + (num1 >= num2)); // False
		
		System.out.println("===============================================");

// �� ���̴� ������ boolean �� ������� �����ϴ��� �˾ƺ��� ���� �ڵ� �ۼ�
		
		boolean res1;
		boolean res2;
		
		res1 = num1 < num2;
		res2 = num1 == num2;
		
		System.out.println("res1 �� ��  : " + res1); // true
		System.out.println("res2 �� ��  : " + res2); // false
		
	}
	
}