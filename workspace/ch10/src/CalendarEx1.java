import java.util.*;

class  CalendarEx1 {
	public static void main(String[] args) 
	{      // 기본적으로 현재날짜와 시간으로 설정된다.
		// new Calendar(); 불가능하다
		// 캘린더 클래스는 추상클래스(추상 메소드(로직이 없음)가 존재)
		// new 연산자로 객체를 생성할 수 없다

		Calendar today = Calendar.getInstance();
//		new GregorianCalendar();

		// getInstance 메소드 안에서 OS에세 문의해서 지역정보를 얻은 후 태국이 아니라면
		// new GregorianCalendar(); 객체를 생성해서 리턴한다
		System.out.println(today instanceof GregorianCalendar);

		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월): " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		// DATE와 DAY_OF_MONTH는 같다.
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("이 해의 몇 일: " + today.get(6));
		
		System.out.println("요일(1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK)); // 1:일요일, 2:월요일, ... 7:토요일
		System.out.println("이 달의 몇 째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));

		// 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
		System.out.println("TimeZone(-12~+12): " + (today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000)));
		System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE)); // 이 달의 마지막 일을 찾는다.
	}
}
