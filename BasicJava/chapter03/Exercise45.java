package chapter03;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100)+1;
		//System.out.println(randomNumber);
		
		int count = 0;
		
		while(true) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요 : ");
			int number = scanner.nextInt();
			count ++;	
			if(randomNumber > number) {
				System.out.println("정답은 더 큰 수입니다.");
				
			} else if(randomNumber < number) {
				System.out.println("정답은 더 작은 수입니다.");
				
			} else {
			
				System.out.println("맞춘 횟수 : " + count);
				System.out.println("정답입니다. \n게임을 종료합니다.");
				break;
			}
			
		}
	}
}
