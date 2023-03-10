package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Pratice161 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int sum = 0;
		for(int i=0; i<=100; i+=3) {
			sum += i;
		}
		System.out.println("3의 배수의 총 합 : " + sum);
		
		while(true) {
			int num1 = random.nextInt(4)+1;
			int num2 = random.nextInt(4)+1;
			
			while(num1 == num2) {
				num2 = random.nextInt(4)+1;
			}
			
			if(num1+num2 == 5) {
				System.out.printf("(%d, %d)", num1, num2);
				break;
			} else {
				System.out.printf("(%d, %d) ", num1, num2);
			}
		
		}
		
		System.out.printf("\n");
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(4*j + 5*i == 60 || 4*i + 5*j == 60) {
					System.out.printf("(%d, %d) ", i, j);
				}
			}
		}
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		
		
		for(int i=1; i<=5; i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
	}
}
