package chapter03;

import java.util.Scanner;

public class Yeon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int score = 79;
//		
//		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
//		System.out.println(grade);
		
//		int x = 10;
//		int y = 20;
//		int z = ++x - y--;
//		
//		System.out.println(z);		
		
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = 534/30; 
//		System.out.println(pencilsPerStudent);
		
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = (double)var1/var2;
//		int var4 = (int)(var3 * var2);
//		System.out.println(var4);
//		
//		int value = 356;
//		System.out.println(value - value%300);
		
//		float var1 = 10f;
//		double var2 = (double)var1 / 100;
//		if(var2 == 0.1) {
//			System.out.println("10%입니다.");
//		}else {
//			System.out.println("10%가 아닙니다.");
//		}
//		
//		
//		int legnthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = (double)(legnthTop+lengthBottom)*height/2;
//		System.out.println(area);
		
		System.out.print("첫 번째 수 : ");
		double firstNumber = scan.nextDouble();
		
		System.out.print("두 번째 수 : ");
		double twoNumber = scan.nextDouble();
		
		if(twoNumber == 0 || twoNumber == 0.0) {
			System.out.printf("결과 : 무한대");
		}else {
			System.out.printf("결과 : %.2f", firstNumber/twoNumber);
		}
		
		scan.close();
	}
}
