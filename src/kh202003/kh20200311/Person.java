package kh202003.kh20200311;

public class Person {

	private int no;
	private String name;
	private String hobby;

	public Person(int no, String name, String hobby) {
		super();
		setNo(no);
		setName(name);
		setHobby(hobby);
	}

	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + ", hobby=" + hobby + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}