package kh202002.kh20200221_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Time
// Date, Calendar, GregorianCalendar
// 3���� Ŭ������ �ڹ��� Time�� �����Ѵ�.

public class TimeEx {
	public static void main(String[] args) {

		// Date�� �߰� �޼ҵ� ��κ��� Deprecated(�������� ����) ó�� �Ǿ� �ִ�.
		// ��������(��¥/�ð�)�� �ľ��Ϸ��� Calendar Ŭ������ get() �޼ҵ带 ����ؾ��Ѵ�.

		// java.util.Date;
		Date dToday = new Date();
		System.out.println(dToday);

		Date dToday2 = new Date(0L);
		System.out.println(dToday2);

		// java.util.Calendar;

		Calendar cToday = Calendar.getInstance();
		// System.out.println(cToday); // ��ü ��ü�� ������ ����ϱ� ������ ���� ���� ��� ������Ѵ�.

		System.out.println(cToday.get(Calendar.YEAR)); // �⵵
		System.out.println(cToday.get(Calendar.MONTH)); // ��(�迭�� �Ȱ��� 0 - 1�� // 1 - 2�� �̷���)
		System.out.println(cToday.get(Calendar.DATE)); // ��¥
		System.out.println(cToday.get(Calendar.HOUR)); // �ð�
		System.out.println(cToday.get(Calendar.HOUR_OF_DAY)); // �ð�(24�ð���)
		System.out.println(cToday.get(Calendar.MINUTE)); // ��
		System.out.println(cToday.get(Calendar.SECOND)); // ��

		System.out.println("\n");
		// java.util.GregorianCalendar

		GregorianCalendar gToday = new GregorianCalendar();
		GregorianCalendar gToday2 = new GregorianCalendar(1945, 1, 1, 20, 7, 9);
		

		// System.out.println(gToday);

		System.out.println(gToday.get(Calendar.YEAR)); // �⵵
		System.out.println(gToday.get(Calendar.MONTH)); // ��(�迭�� �Ȱ��� 0 - 1�� // 1 - 2�� �̷���)
		System.out.println(gToday.get(Calendar.DATE)); // ��¥
		System.out.println(gToday.get(Calendar.HOUR)); // �ð�
		System.out.println(gToday.get(Calendar.HOUR_OF_DAY)); // �ð�(24�ð���)
		System.out.println(gToday.get(Calendar.MINUTE)); // ��
		System.out.println(gToday.get(Calendar.SECOND)); // ��
		
		System.out.println(gToday2);

		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);		// Date -> Calendar ����
		
		System.out.println(cal);
		
		
		GregorianCalendar greCal = new GregorianCalendar();
		greCal.setTime(now);
		
		Date res1 = cal.getTime(); 			// Calendar -> Date ����ȯ
		Date res2 = greCal.getTime();		// GregorianCalendar -> Date
		
		System.out.println(res1);
		System.out.println(res2);
		
	}
}