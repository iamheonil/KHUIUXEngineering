package kh202003.kh20200310;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection06_Properties {
	public static void main(String[] args) {

		Properties prop = new Properties(); // Properties 객체

		try {

			// 파일 -> Properties 정보 불러오기
			prop.load(new FileReader("./src/kh20200310/user.properties"));

			System.out.println(prop);

			System.out.println();

			// 속성 값 가져오기
			String user = prop.getProperty("username");
			String password = prop.getProperty("password");
			System.out.println("User : " + user);
			System.out.println("Pass : " + password);

			System.out.println();

			// 인증, Authentication, Auth
			if ("abc".equals(user) && "123".equals(password)) {
				System.out.println("로그인에 성공하였습니다.");
			} else {
				System.out.println("로그인에 실패하였습니다.");
			}

			// ----------------------------------------------

			user = "abc";
			password = "123";

			prop.setProperty("username", user);
			prop.setProperty("password", password);

			System.out.println(prop);

			// Store -> Properties 정보를 기록한다.
			prop.store(new FileWriter("./src/kh20200310/user.properties"), "User Information");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();

		// 시스템 정보 Properties 얻기
		Properties sysProp = System.getProperties();

		System.out.println("자바 버전 : " + sysProp.getProperty("java.version"));
		System.out.println("OS 이름 : " + sysProp.getProperty("os.name"));
		System.out.println("사용자 계정 : " + sysProp.getProperty("user.name"));
		System.out.println(sysProp);
		
		// ./
		// 현재 위치를 나타내는 경로
		// 자바프로그램은 현재위치를 클래스패스(Class Path)로 제공한다.

		// 클래스패스 : 프로그램이 실행된 위치 -> 프로젝트 폴

	} // main end
} // class end
