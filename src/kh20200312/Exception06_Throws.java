package kh20200312;

public class Exception06_Throws {
	public static void main(String[] args) {

		Exception e = new NullPointerException(); // ���� ��ü ����
//		 Exception �� Checked

//		NullPointerException e = new NullPointerException();	// ���� ��ü ����
		// NullPointer �� Un Checked�̱� ������ ���� �ҽ��� �۵����� �ʴ´�.
		// �ٸ� try catch ������ �����ָ� ���� �����ϴ�.

//		throw e;

		try {
			throw e;
			
		} catch (Exception e2) {
			e2.printStackTrace();
			
		}

//		 throw new NullPointerException();
		
	}
}