package kh20200218;

// 부모 클래스
abstract class Person {		// 슈퍼 클래스
	
	protected String name;
	
	public abstract void display();	// 객체의 정보를 출력하는 기능

	public Person(String name) {	// 생성자
		this.name = name;
	}
	
}

class Professor extends Person {	// 서브 클래스
	
	private String major;	 // 전공
	
	public Professor(String name, String major) {	// 생성자
		
		super(name);
		
		this.major = major;

	}
	@Override
	public void display() {
		System.out.println("교수 " + name + ", " + major + " 전공");
		
	}
	
}

class Student extends Person {
	
	private String subject;
	
	public Student(String name, String subject) {
		super(name);
		
		this.subject = subject;
		
	}

	@Override
	public void display() {
		System.out.println("학생 " + name + ", " + subject + " 수강과목");
		
	}
	
}


public class AbstractEx {
	public static void main(String[] args) {

		Student s = new Student("김헌일", "소프트웨어공학");
		Professor f = new Professor("한지오", "UI/UX 엔지니어링");
		
		s.display();
		f.display();
		
		System.out.println();
		
		Person p1 = new Student("Clare", "자료구조");
		Person p2 = new Professor("Dave", "알고리즘");
		
		p1.display();
		p2.display();
		
		System.out.println();
		
		Person[] arr = null;	// 배열 선언
		
		arr = new Person[5];	// 배열 공간 생성
		
		arr[0] = new Professor("Apple", "디자인");
		arr[1] = new Student("Banana", "열대생물연구");
//		arr[2] = new Person("Cherry", "키보드공학");	// Cannot instantiate the type Person
		
				
		// 출력 1번 방법
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].display();
			} else {
				break;
			}
		}
		System.out.println();
		
		// 출력 2번 방법
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == null) 	continue;
				arr[i].display();
			}
		
		
	}

}