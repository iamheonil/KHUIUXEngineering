package kh20200219_quiz2;

public interface ArrayAction {
	// �迭�� ������ ������ �ڿ� ����
	public void add(String element);
	
	// element�� �����ϸ� ����
	// ����) �迭�� ��� ���̿� ������� ������ �����Ѵ�
	public void remove(String element);
	
	// idx��ġ�� element�� ��ȯ
	public String get(int idx);
	
	// element�� idx�� ��ȯ
	//	������ -1
	public int find(String element);

	// ��� element ���
	public void print();
}






