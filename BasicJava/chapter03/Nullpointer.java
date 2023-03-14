package chapter03;

import java.util.Calendar;
import java.util.Scanner;

public class Nullpointer {
	public enum Week{
		MONDAY,
		TUSDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("참조 같");
		}else {
			System.out.println("참조 다");
		}
		if(strVar1.equals(strVar2)){
			System.out.println("문자열이 같");
		}else {
			System.out.println("문자열이 다");
		}
		
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week + "일");
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUSDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}	
		
		System.out.printf("오늘은 %s", today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(grade);
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		// ---------------------------------
		
		int value = 356;
		System.out.println(value - value % 100);
		System.out.println(value / 100 * 100);
		
		//------------
		
		float var1 = 10f;
		double var2 = (double)var1 / 100;
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		
		//----------------
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom)*height/2.0; //나눌 때 .0을 붙여주면 깔끔
		System.out.println(area);
		//--------------------------------------------
		
		System.out.print("첫 번째 수");
		double firstNum = scanner.nextDouble();
		System.out.print("두 번째 수");
		double twoNum = scanner.nextDouble();
		
		double result = firstNum / twoNum;
		
		if(twoNum == 0 || twoNum == 0.0) {
			System.out.println("결과:무한대");
		}else {
			System.out.println("결과:" + result);
		}
		//String result = (secondNumber == 0 || secondNumber == 0.0) ? "무한대" : firstNumber/secondNumber 
		
		//---------------
		
		Scanner scanner2 = new Scanner(System.in);
		
		int var3 = 10;
		int var4 = 3;
		int var5 = 14;
		String pi = var4 + "." + var5;
		//double intPi = Double.parseDouble(pi);
		double var6 = var3 * var3 * Double.parseDouble(var4 + "." + var5);
		System.out.println("원의 넓이:" + var6);
		
		// -------------------------------- 
		
		System.out.print("아이디:");
		String name = scanner2.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner2.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
	}
}
