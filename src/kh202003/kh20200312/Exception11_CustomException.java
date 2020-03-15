package kh202003.kh20200312;

class User { 

	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {
		
		if(age < 0 || age > 150) { // UserAgeException
			throw new UserAgeException();
		}
		
		this.age = age;
		
	}
	
}

// 사용자 정의 예외 클래스
//class UserAgeException extends Exception {			// Checked
class UserAgeException extends RuntimeException {	// UnChecked
	
	@Override
	public String getMessage() {
		return "나이는 0보다 작을 수 없고, 150보다 클 수 없습니다.";
	}
}

public class Exception11_CustomException {
	public static void main(String[] args) {

//		throw new UserAgeException();
		
		User user = new User();
		
		
//		user.setAge(10);
		
		
		try {
			user.setAge(1111);
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
		
	}
}