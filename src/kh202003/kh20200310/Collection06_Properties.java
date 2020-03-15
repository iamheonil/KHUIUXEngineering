package kh202003.kh20200310;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection06_Properties {
	public static void main(String[] args) {

		Properties prop = new Properties(); // Properties ��ü

		try {

			// ���� -> Properties ���� �ҷ�����
			prop.load(new FileReader("./src/kh20200310/user.properties"));

			System.out.println(prop);

			System.out.println();

			// �Ӽ� �� ��������
			String user = prop.getProperty("username");
			String password = prop.getProperty("password");
			System.out.println("User : " + user);
			System.out.println("Pass : " + password);

			System.out.println();

			// ����, Authentication, Auth
			if ("abc".equals(user) && "123".equals(password)) {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			} else {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			}

			// ----------------------------------------------

			user = "abc";
			password = "123";

			prop.setProperty("username", user);
			prop.setProperty("password", password);

			System.out.println(prop);

			// Store -> Properties ������ ����Ѵ�.
			prop.store(new FileWriter("./src/kh20200310/user.properties"), "User Information");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();

		// �ý��� ���� Properties ���
		Properties sysProp = System.getProperties();

		System.out.println("�ڹ� ���� : " + sysProp.getProperty("java.version"));
		System.out.println("OS �̸� : " + sysProp.getProperty("os.name"));
		System.out.println("����� ���� : " + sysProp.getProperty("user.name"));
		System.out.println(sysProp);
		
		// ./
		// ���� ��ġ�� ��Ÿ���� ���
		// �ڹ����α׷��� ������ġ�� Ŭ�����н�(Class Path)�� �����Ѵ�.

		// Ŭ�����н� : ���α׷��� ����� ��ġ -> ������Ʈ ��

	} // main end
} // class end
