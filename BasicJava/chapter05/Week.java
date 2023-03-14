package chapter05;

import java.util.Calendar;

public class Week {
	public static void main(String[] args) {
		
		Season today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			
			today = Season.SUNDAY;        //ctrl + e split
			break;
		case 2:
			today = Season.MONDAY;
			break;
		case 3:
			today = Season.TUESDAY;
			break;
		case 4:
			today = Season.WEDNSDAY;
			break;
		case 5:
			today = Season.THURSDAY;
			break;
		case 6:
			today = Season.FRIDAY;
			break;
		case 7:
			today = Season.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요알: " + today);
		
		if(today == Season.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
	}
}
