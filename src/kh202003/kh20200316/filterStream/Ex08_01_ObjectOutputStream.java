package kh202003.kh20200316.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import kh202002.kh20200206.Array;

class Person implements Serializable {

	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Ex08_01_ObjectOutputStream {
	public static void main(String[] args) {

		File file = new File("./src/kh202003/kh20200316/", "ObjectTest2.ser");

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			List list = new ArrayList();
			
			list.add(new Point(10, 20));
			list.add(new Person("Alice", 25));
			list.add(new Point(40, 60));
			list.add(new Person("Bob", 33));
			list.add(new Person("Bob", 44));
			
			oos.writeObject(list);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}