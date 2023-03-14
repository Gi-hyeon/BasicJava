package chapter03;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int leapYear = scanner.nextInt();
		
		System.out.println((leapYear % 400==0) ? +leapYear + "년은 윤년입니다." : (leapYear % 4 ==0) && !(leapYear % 100 == 0) ? +leapYear+ "년은 윤년입니다." : +leapYear+"년은 윤년이 아닙니다");
		System.out.println((leapYear % 400==0)||((leapYear % 4 == 0 && !(leapYear % 100 ==0)))?+leapYear+"년은 윤년입니다." : +leapYear+"년은 윤년이 아닙니다.");
	}
}