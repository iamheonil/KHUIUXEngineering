package kh20200214;

public class PrintFormatted {
	// PrintFormatted
	// ���ڿ� �������� ���

	// ���Ĺ��ڸ� �����ϴ� ���ڿ��� ���Ŀ� �� �����͸� �����Ͽ� ����Ѵ�.
	// System.out.printf("���� �����ϴ� ���ڿ�", ���ĵ�����1, ���ĵ�����2, ���ĵ�����3 ...);

	// ���Ĺ���
	// %s - ���ڿ�
	// %d - ���� (10����)
	// %c - ���Ϲ���
	// %f - �Ǽ�

	// ex) System.out.printf("%�Դϴ�", 123);
	// System.out.printf("%d%s", 100, "�Դϴ�");
	// -> %d�� 100�� ¦, %s�� "�Դϴ�"�� ¦
	// System.out.printf("%d�� ������ %d��\n", 10, 9);
	// System.out.printf(10 + "�� ������ " + 9 "��");

	// ���Ĺ����� ��� ���� Ȯ��
	// %�� ���������� ���̿� ���ڸ� ������ ��� ������ Ȯ���Ѵ�
	// %7d -> 7ĭ�� Ȯ���ϰ� �� �ڸ��� ������ ä���ִ´�.
	// %f�� ���� ���Ĺ��ڴ� ������ �ڸ��� �Ҽ��� �ڸ����� ������ �� �ִ�.
	// System.out.printf("%10.2f", 123.45678);
	// -> Result : ' '123.47

	public static void main(String[] args) {
		System.out.printf("%7d%7d%7d\n", 100, 200, 300);
		System.out.printf("%10.2f    %7.3f\n", 123.4567, 56.78910 );
	}
}