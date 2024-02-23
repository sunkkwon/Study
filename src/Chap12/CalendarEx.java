package Chap12;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();	// 추상클래스 이다
		
//		System.out.print(cal.get(1));
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("/" + (int) (cal.get(Calendar.MONTH) + 1));
		System.out.print("/" + (int) (cal.get(Calendar.DATE)));
		System.out.print(" " + (int) (cal.get(Calendar.HOUR)));
//		System.out.print(":" + (int) (cal.get(Calendar.HOUR_OF_DAY)));
		System.out.print(":" + (int) (cal.get(Calendar.MINUTE)));
		System.out.print(":" + (int) (cal.get(Calendar.SECOND)));
//		System.out.print(":" + cal.get(Calendar.AM_PM));
		
		if (cal.get(Calendar.AM_PM) == 0) {
			System.out.println(" AM");
		} else {
			System.out.println(" PM");
		}
		
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String a = "";
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			a = "Sunday";
			break;
		case 2:
			a = "Monday";
			break;
		case 3:
			a = "Tuesday";
			break;
		case 4:
			a = "Wednesday";
			break;
		case 5:
			a = "Thursday";
			break;
		case 6:
			a = "Friday";
			break;
		case 7:
			a = "Satday";
			break;
		}
		
		System.out.println("Today is " + a);
	}
}
