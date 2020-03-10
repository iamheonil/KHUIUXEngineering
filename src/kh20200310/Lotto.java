package kh20200310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		
		lottoDisplay();
		
	}

	private static void lottoDisplay() {
		
		Random ran = new Random();
		
		//1~45 ������ ����
		//	ran.nextInt(45) + 1;
		
		Set set = new TreeSet();
		
		int cnt = 0; //TEST
		// TreeSet�� ��Ұ� 6���� �� ������ �ݺ�
		while( set.size() != 6 ) {
			set.add(ran.nextInt(45) + 1);
			
			cnt++; //TEST
		}

		System.out.println("[TEST] " + cnt + "�� �ݺ��ϰ� ��� ����");
		System.out.println(set);
		
		System.out.println("---------------------");
		
		//���1. List�� ��ȯ�ϱ�
		List list = new ArrayList(set);
		System.out.println( list );
		
		System.out.println("---------------------");
		
		//���2. �迭�� ��ȯ�ϱ�
		Object[] arr = set.toArray();
		System.out.println( Arrays.toString(arr) );
		
	}
}