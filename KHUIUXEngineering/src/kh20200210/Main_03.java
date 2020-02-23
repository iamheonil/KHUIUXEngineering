package kh20200210;

// 객체화 하는 클래스

public class Main_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_03 c01 = new Class_03();
		Class_03 c02 = new Class_03();
			
//		c01.num = 10;	// 접근 제한자로 인해 사용이 불가능한 코드
		
		c01.setNum(10);				// Setter Method 에 10이라는 값을 저장한다.
		int num = c01.getNum();		// Get으로 저장 된 값을 가져온다. 
		
		System.out.println(num);
		System.out.println(c01.getNum());
		
		
		
	}
}