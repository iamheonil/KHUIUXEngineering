package kh202001.kh20200131;

public class Source2 {

	public static void main(String[] args) {
		
// ���� ������ - ��
// &&, ||, !
// ! �����ڴ� ���� ������
//	
// && -> And		-> �ΰ��� ���� ��� true �� �� true�� �����Ѵ�.
// || -> OR		-> �� �� �ϳ��� ���� true ��� true�� �����Ѵ�.
// ! -> Not		-> �����Ѵ�, true�� false�� false�� true�� ��ȯ
// 
// 		&&(AND)	True	False		
// 		True	T		F
// 		False	F		F
//
//		||(OR)	True	False		
// 		True	T		T
// 		False	T		F
//
// 		!(NOT)	True	False		
// 		True	F		T
// 		!�� �������̱⿡ �ݴ�� ��µȴ�.
//		
//		XOR		True	False	-> XOR�� �� �� ���� ����.
//		True	F		T
//		False	T		F
// 	

	boolean b1 = true;
	boolean b2 = false;
	
	System.out.println("True && False : " + (b1 && b2));	// �� ���� �� ���̾�� Ʈ�簡 ���
	System.out.println("True || False : " + (b1 || b2));	// �ϳ��� ���̶�� Ʈ�� ���
	System.out.println("False : " + ! b2);					// b2�� false ������ !�� �������̱⿡ �ݴ�� true�� ���
	
	System.out.println("");
	
	int num = 88;
	System.out.println((num >= 1) && (num <= 100));			// �ΰ����� ��� �����ؾ��Ѵ�.
	System.out.println((num >= 1) || (num <= 100));			// �Ѱ����� �����ص� �����ϴ�.
	
	
	System.out.println((1 <= num) && (num <= 100));
	System.out.println( !((1 <= num) && (num <= 100)) );
	
	
	}
}