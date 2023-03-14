package chapter02;

import java.util.Scanner;

public class printfExample {
	public static void main(String[] args) {
		String name = "김자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age);
		System.out.printf("\n전화 : %s-%s-%s\n", tel1, tel2, tel3);
		
		Scanner scanner = new Scanner(System.in);
		
		String message = scanner.nextLine();
		if(message.equals("C")) {
			System.out.print("일치");
		} else {
			System.out.print("불일치");
		}
		
		System.out.print("\n첫번째 수 : "); 
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수 : ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		
		System.out.println("덧셈 결과 : " + result);
		
		System.out.print("1. 이름 : ");
		String name2 = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리 : ");
		String social = scanner.nextLine();
		
		System.out.print("3. 전화번호 : ");
		String phoneNumber = scanner.nextLine();
		
		System.out.println(name2);
		System.out.println(social);
		System.out.println(phoneNumber);
		
		scanner.close();
	}
}