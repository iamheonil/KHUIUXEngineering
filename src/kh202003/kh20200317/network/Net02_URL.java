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
			System.out.println("�߸� �� ������ URL �Դϴ�");
		}

		System.out.println("�������� : " + url.getProtocol());
		System.out.println("ȣ��Ʈ : " + url.getHost());
		System.out.println("��Ʈ��ȣ : " + url.getPort());
		System.out.println("���ϰ�� : " + url.getFile());
		System.out.println("��ü : " + url.toExternalForm());

	}
}