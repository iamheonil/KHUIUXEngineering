package kh202002.kh20200221_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Time
// Date, Calendar, GregorianCalendar
// 3개의 클래스가 자바의 Time을 관리한다.

public class TimeEx {
	public static void main(String[] args) {

		// Date의 추가 메소드 대부분이 Deprecated(사용금지를 권장) 처리 되어 있다.
		// 세부정보(날짜/시간)를 파악하려면 Calendar 클래스의 get() 메소드를 사용해야한다.

		// java.util.Date;
		Date dToday = new Date();
		System.out.println(dToday);

		Date dToday2 = new Date(0L);
		System.out.println(dToday2);

		// java.util.Calendar;

		Calendar cToday = Calendar.getInstance();
		// System.out.println(cToday); // 객체 전체의 정보를 출력하기 때문에 따로 빼서 출력 해줘야한다.

		System.out.println(cToday.get(Calendar.YEAR)); // 년도
		System.out.println(cToday.get(Calendar.MONTH)); // 달(배열과 똑같이 0 - 1월 // 1 - 2월 이런식)
		System.out.println(cToday.get(Calendar.DATE)); // 날짜
		System.out.println(cToday.get(Calendar.HOUR)); // 시간
		System.out.println(cToday.get(Calendar.HOUR_OF_DAY)); // 시간(24시간식)
		System.out.println(cToday.get(Calendar.MINUTE)); // 분
		System.out.println(cToday.get(Calendar.SECOND)); // 초

		System.out.println("\n");
		// java.util.GregorianCalendar

		GregorianCalendar gToday = new GregorianCalendar();
		GregorianCalendar gToday2 = new GregorianCalendar(1945, 1, 1, 20, 7, 9);
		

		// System.out.println(gToday);

		System.out.println(gToday.get(Calendar.YEAR)); // 년도
		System.out.println(gToday.get(Calendar.MONTH)); // 달(배열과 똑같이 0 - 1월 // 1 - 2월 이런식)
		System.out.println(gToday.get(Calendar.DATE)); // 날짜
		System.out.println(gToday.get(Calendar.HOUR)); // 시간
		System.out.println(gToday.get(Calendar.HOUR_OF_DAY)); // 시간(24시간식)
		System.out.println(gToday.get(Calendar.MINUTE)); // 분
		System.out.println(gToday.get(Calendar.SECOND)); // 초
		
		System.out.println(gToday2);

		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);		// Date -> Calendar 적용
		
		System.out.println(cal);
		
		
		GregorianCalendar greCal = new GregorianCalendar();
		greCal.setTime(now);
		
		Date res1 = cal.getTime(); 			// Calendar -> Date 형변환
		Date res2 = greCal.getTime();		// GregorianCalendar -> Date
		
		System.out.println(res1);
		System.out.println(res2);
		
	}
}