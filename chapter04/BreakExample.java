package chapter04;

import java.util.Random;

public class BreakExample {
	public static void main(String[] args) {
		Random random = new Random();
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		for(int i=0; i<5; i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
					System.out.printf(" ");
				}else {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
		
		
		while(true) {
			int num = random.nextInt(6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		
		for(int i=0; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
}
