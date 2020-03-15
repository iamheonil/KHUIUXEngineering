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

// ����� ���� ���� Ŭ����
//class UserAgeException extends Exception {			// Checked
class UserAgeException extends RuntimeException {	// UnChecked
	
	@Override
	public String getMessage() {
		return "���̴� 0���� ���� �� ����, 150���� Ŭ �� �����ϴ�.";
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