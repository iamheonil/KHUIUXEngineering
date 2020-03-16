package kh202003.kh20200316.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {
	public static void main(String[] args) {

		// Stream�� �⺻������ ����Ʈ ���
		// ���ڰ� �ʿ���, 2B ����� ��ȯ������Ѵ�.

		// InputStreamReader
		// OutputStreamReader
		// �� Ŭ������ �̿��Ͽ� ��ȯ�Ѵ�.

		// ǥ���Է� ��Ʈ�� System.in -> Reader�� ��ȯ�ϴ� ����
		Reader reader = new InputStreamReader(System.in);

		// ǥ���Է� ��Ʈ�� System.out -> Writer�� ��ȯ�ϴ� ����
		Writer writer = new OutputStreamWriter(System.out);

		// ����� ��������
		char[] cbuf = new char[1024];
		int len = -1;
		int total = 0;
		// ����Ʈ ��Ű� �ٸ��� ����� ���ڼ�

		try {
			while ((len = reader.read(cbuf)) != -1) {
				writer.write(cbuf, 0, len);
				writer.flush();

				total += len; // �Է¹��� ���ڼ�
			}


		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// ���� System.out �� Close �Ǿ� �Ʒ��� Println ���� �������� �ʴ´�.
		System.out.println("���ݱ��� �Է��� ���ڼ��� " + total + "�� �Դϴ�.");

	}
}