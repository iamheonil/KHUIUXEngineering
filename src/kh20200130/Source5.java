package kh20200130;

public class Source5 {
	public static void main(String[] args) {
// ������
//		System.out.println("Ctrl + Alt + �Ʒ� Ȥ�� ���� ����Ű -> ��, Ȥ�� �Ʒ��� �о�� ����");
//		System.out.println("Ctrl + D(Delete) -> Ŀ���� ��ġ�� �ش��� ����");
//		System.out.println("Alt + ����Ű -> �ش����� �� �Ʒ��� �Դٰ���");
//		System.out.println("Ctrl + ����Ű -> ��ũ�� / �ٵ� �̰Ŵ� ���� �� �� �� ������..");
/////////////
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int num6;
		int num7;
		
		num1 = 30;
		num2 = 50;
		num3 = 70;
		num4 = 90;
		num5 = 110;
		num6 = 130;
		num7 = 150;
		
//		num1 = num2;
//		<---------- �� ������ �ȴ�.
		
//		System.out.println(num1);
		
		num6 = num5 = num4 = num3;
		num3 = num4 = num5 = num6;
		
//		System.out.println(num6);
//		System.out.println(num3);
		
		// ������� ����
		System.out.println("������� ���� ��");
		System.out.println("Num1 : " + num1);
		System.out.println("Num2 : " + num2);
		
		num2 += num1; // ��� ����
		
		System.out.println("������� ���� ��");
		System.out.println("Num1 : " + num1);
		System.out.println("Num2 : " + num2);
		
//		num2 -= num1;	// ������մ��Կ�����(����)
//		num2 = -num1;	// ���Կ�����(����), '-' ��ȣ��ȯ������(����)
//		System.out.println(num2);
//		�� ����ϱ�
		
	}
}

// ���׿����� - ����
// = �����ʿ� �ִ� ���� ���ʿ� �ִ� ������ �������ִ°�
// int main -> main = 10 
// main ���� ���� �� main ������ 10�̶�� ���� �����Ѵ�.

// ������ �켱����(���� 24P) Ȥ�� https://t1.daumcdn.net/cfile/tistory/2219753856A8E8D92E
// �ܿ� �ʿ�� ���� �ʿ�� ������ ���� �ȴ�. �������� ����, �������, ������� ��

// ���մ��Կ����� - �������
// +=, -=, *=, /=, %=
