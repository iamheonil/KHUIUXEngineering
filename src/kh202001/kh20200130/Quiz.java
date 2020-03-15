package kh202001.kh20200130;

public class Quiz {

	public static void main(String[] args) {
		
		// 변수에 알맞은 타입을 골라 선언하고
		// 대입한 후 출력해보자.

		// 개인정보 변수
		// 이름, 나이, 성별, 키

		//	출력 예시
		//	이름 : Alice
		//	나이 : 99
		//	성별 : 남
		//	키 : 222.66

		//	ex)
		//	System.out.println("이름 : " + name);
		
//		==================================================================================
				
		// 선언과 동시에 대입해도 가능하나 final 이 아니기에 마지막에 대입 된 값이 출력된다.
		// 둘 다 사용가능한 방법
		String name = "Park";
		int age;
		String gender;
		double height;
		
		name = "Alice";
		age = 99;
		gender = "남";
		height = 222.66;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);	

	}

}