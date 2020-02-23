package kh20200218;

// �θ� Ŭ����
abstract class Person {		// ���� Ŭ����
	
	protected String name;
	
	public abstract void display();	// ��ü�� ������ ����ϴ� ���

	public Person(String name) {	// ������
		this.name = name;
	}
	
}

class Professor extends Person {	// ���� Ŭ����
	
	private String major;	 // ����
	
	public Professor(String name, String major) {	// ������
		
		super(name);
		
		this.major = major;

	}
	@Override
	public void display() {
		System.out.println("���� " + name + ", " + major + " ����");
		
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
		System.out.println("�л� " + name + ", " + subject + " ��������");
		
	}
	
}


public class AbstractEx {
	public static void main(String[] args) {

		Student s = new Student("������", "����Ʈ�������");
		Professor f = new Professor("������", "UI/UX �����Ͼ");
		
		s.display();
		f.display();
		
		System.out.println();
		
		Person p1 = new Student("Clare", "�ڷᱸ��");
		Person p2 = new Professor("Dave", "�˰���");
		
		p1.display();
		p2.display();
		
		System.out.println();
		
		Person[] arr = null;	// �迭 ����
		
		arr = new Person[5];	// �迭 ���� ����
		
		arr[0] = new Professor("Apple", "������");
		arr[1] = new Student("Banana", "�����������");
//		arr[2] = new Person("Cherry", "Ű�������");	// Cannot instantiate the type Person
		
				
		// ��� 1�� ���
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].display();
			} else {
				break;
			}
		}
		System.out.println();
		
		// ��� 2�� ���
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == null) 	continue;
				arr[i].display();
			}
		
		
	}

}