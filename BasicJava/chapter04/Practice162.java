package chapter04;

import java.util.Scanner;

public class Practice162 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		int total = 0;
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			balance = scanner.nextInt();
			
			if(balance == 1) {
				System.out.print("예금액> ");
				int deposit = scanner.nextInt();
				total += deposit;
			} else if(balance == 2) {
				System.out.print("출금액> ");
				int withdraw = scanner.nextInt();
				total -= withdraw;
			} else if(balance == 3) {
				System.out.print("잔고> ");
				System.out.print(total + "\n");
			} else {
				break;
			}
		}
		
		System.out.println("프로그램 종료 ");
		scanner.close();
	}
}
