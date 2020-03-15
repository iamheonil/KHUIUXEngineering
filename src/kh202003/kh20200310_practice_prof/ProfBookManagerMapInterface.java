package kh202003.kh20200310_practice_prof;

//BookManagerMap�� �������̽�
//��� �޼ҵ�鿡 ���� ������ �ڼ��� �ۼ��ص�
public interface ProfBookManagerMapInterface {

	/**
	 * �� ���� �߰�
	 * 	�ʿ� ���ο� ������ �߰��Ѵ�
	 * 
	 * @param book - Book, ���Ӱ� �߰��� å ������ ����ִ� ��ü
	 */
	public void putBook(ProfBook book);
	
	
	
	/**
	 * ���� ����
	 * 	å ��ȣ�� ���޹޾� �ʿ��� ���� ������ �����Ѵ�
	 * 
	 * @param bNo - String, ������ ������ �̸� 
	 */
	public void removeBook(String bNo);
	
	
	
	/**
	 * ���� ���� �˻�
	 * 	å �̸��� ���޹޾� �ش� å�� å��ȣ�� ��ȯ�Ѵ�
	 *	�������� �ʴ� å�̶�� null�� ��ȯ�Ѵ�
	 * 
	 * @param bTitle - String, �˻��Ϸ��� å �̸�
	 * @return
	 * 	String - �˻��� å��ȣ
	 * 	null - �˻��� å ������ �������� ���� ��
	 */
	public String searchBook(String bTitle);
	
	
	
	/**
	 * ��� å�� ������ ����Ѵ�
	 * 	printBook() Ȱ��
	 *  
	 */
	public void displayAll();
	
	
	
	/**
	 * å �ѱ��� ������ ����Ѵ�
	 * 
	 * @param bNo - String, ����Ϸ��� å�� å��ȣ
	 */
	public void printBook(String bNo);
	
}
