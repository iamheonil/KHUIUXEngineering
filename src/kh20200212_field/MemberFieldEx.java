package kh20200212_field;

// 실행 클래스



public class MemberFieldEx {
	public static void main(String[] args) {
		// new 로 만드는 곳 HEAP(힙) 메모리
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null; // Null Pointer
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();
		
		mf01.setNum(100);
		mf02.setNum(200);

//		mf01.setName(name);
		mf02.setName("셋");
		
//		mf03.setNum(300);
		// NullPointerException - 참조대상이 없음 이 출력된다면
		// 해당 코드로 가서 참조변수 '.'의 이전이 무엇으로 되어있나 확인할 것.
		
//		System.out.println(mf01.getNum());
//		System.out.println(mf02.getNum());
//		System.out.println(mf01.getName());
//		System.out.println(mf02.getName());
//		
//		System.out.println();
		
		
//		System.out.println(mf04.city);
//		System.out.println(mf05.city);
//		System.out.println();
//		
//		mf04.city = "BuSaN";
//		System.out.println(mf04.city);
//		System.out.println(mf05.city);
//
//		System.out.println();
//		mf05.city = "JeJu";
//		System.out.println(mf05.city);
//
//		System.out.println(MemberField_02.getCity());
		
		// 설계 클래스에서 변수명을 
		// Final 로 선언 하고 사용하게 되면 절대 수정 불가능하다.
		// Static 으로 선언 하고 사용하게 되면 수정 된 내용으로 모두 채워진다.
		
		MemberField_03 mf06 = new MemberField_03();
			
		
	}
}