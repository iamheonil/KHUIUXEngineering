package kh202003.kh20200317.network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {
	public static void main(String[] args) {

		String javaUrl = "https://docs.oracle.com:443/javase/8/docs/api/java/net/URL.html";

		URL url = null;

		try {
			url = new URL(javaUrl);
		} catch (MalformedURLException e) {
			System.out.println("잘못 된 형식의 URL 입니다");
		}

		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트번호 : " + url.getPort());
		System.out.println("파일경로 : " + url.getFile());
		System.out.println("전체 : " + url.toExternalForm());

	}
}