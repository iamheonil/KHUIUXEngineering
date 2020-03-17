package kh202003.kh20200317.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {

		InetAddress ip = null; // IP �ּ� ǥ�� ��ü

		try {
			ip = InetAddress.getByName("www.op.gg");
		} catch (UnknownHostException e) {
			System.out.println("�� �� ���� ȣ��Ʈ Name �Դϴ�.");
		}

		// ȣ��Ʈ���� : ������ �����ϱ� ���� ������ �̸�
		// ȣ��Ʈ���ӿ��� ������ ��������
		// �����γ��� : ȣ��Ʈ������ �������� IP�� ������ �̸�
		System.out.println("HostName : " + ip.getHostName());
		System.out.println("HostAddress : " + ip.getHostAddress());

		System.out.println();

		try {
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// ����ȣ��Ʈ : �ڱ� �ڽ��� IP ������ ���´�.
		System.out.println("HostName : " + ip.getHostName());
		System.out.println("HostAddress : " + ip.getHostAddress());

		System.out.println();

		// IP �ּҸ� Byte�迭�� ��ȯ
		byte[] ipAddr = ip.getAddress();
		System.out.println(Arrays.toString(ipAddr));
		// ���� ������

		// ���� ������ ����
		for (int i = 0; i < ipAddr.length; i++) {
			if (ipAddr[i] < 0) {
				System.out.print(ipAddr[i] + 256 + ", ");
			} else {
				System.out.print(ipAddr[i] + ", ");
			}

		}

	}
}