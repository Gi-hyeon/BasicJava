package chapter03;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12): ");
		int month = scanner.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.printf("%d월은 겨울입니다.", month);
		} else if(month==3 || month==4 || month==5) {
			System.out.printf("%d월은 봄입니다.", month);
		} else if(month==6 || month==7 || month==8) {
			System.out.printf("%d월은 여름입니다.", month);
		} else if(month==9 || month==10 || month==11){
			System.out.printf("%d월은 가을입니다.", month);
		} else {
			System.out.printf("%d월은 잘못된 입력입니다.", month);
		}
		
	}
}
