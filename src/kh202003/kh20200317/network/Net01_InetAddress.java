package kh202003.kh20200317.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {

		InetAddress ip = null; // IP 주소 표현 객체

		try {
			ip = InetAddress.getByName("www.op.gg");
		} catch (UnknownHostException e) {
			System.out.println("알 수 없는 호스트 Name 입니다.");
		}

		// 호스트네임 : 노드들을 구분하기 위해 지정한 이름
		// 호스트네임에서 도메인 네임으로
		// 도메인네임 : 호스트네임의 일종으로 IP와 매핑한 이름
		System.out.println("HostName : " + ip.getHostName());
		System.out.println("HostAddress : " + ip.getHostAddress());

		System.out.println();

		try {
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// 로컬호스트 : 자기 자신의 IP 정보를 얻어온다.
		System.out.println("HostName : " + ip.getHostName());
		System.out.println("HostAddress : " + ip.getHostAddress());

		System.out.println();

		// IP 주소를 Byte배열로 변환
		byte[] ipAddr = ip.getAddress();
		System.out.println(Arrays.toString(ipAddr));
		// 깨진 데이터

		// 깨진 데이터 복구
		for (int i = 0; i < ipAddr.length; i++) {
			if (ipAddr[i] < 0) {
				System.out.print(ipAddr[i] + 256 + ", ");
			} else {
				System.out.print(ipAddr[i] + ", ");
			}

		}

	}
}