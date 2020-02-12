package kh20200212_field;

// 설계 클래스



public class MemberField_01 {
	// 변수선언으로 만드는 곳 스택 메모리
	// 멤버 필드
	
	private int num = 1995;
	private String name = "Heonil";
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}