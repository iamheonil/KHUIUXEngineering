package kh20200210;

// 객체화를 위한 설계도 짜는 클래스 (멤버 필드)

public class Class_03 {

	private int num; 		// 번호
	private String name; 	// 이름
	private double height; 	// 키
	

	
	
	// Getter, Setter Method 를 사용하여 private 의 접근 제한자를 일시적으로 허용한다.
	
	// Getter Method	- num 필드의 값을 알려준다(반환한다)
	public int getNum() {
		return num;
	}

	// Setter Method	- num 필드의 값을 저장한다.
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
