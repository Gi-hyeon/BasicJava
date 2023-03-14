package chapter10;

import java.util.Scanner;

public class TryWithResourceExample {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫");
//		int firstNum = scanner.nextInt();
//		System.out.println("두");
//		int SecondNum = scanner.nextInt();
//		int result = firstNum + SecondNum;
//		System.out.println(result);
		
		
		Scanner scanner = null;
		try {
			System.out.println("첫");
			int firstNum = scanner.nextInt();
			System.out.println("두");
			int SecondNum = scanner.nextInt();
			int result = firstNum + SecondNum;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(scanner != null) {
				System.out.println("실행");
			}
		}
		
		
//		jdk1.7 부터 가능
		
//		try with로 묶어준다
//		try (Scanner scanner = new Scanner(System.in)) {
//			System.out.println("첫");
//			int firstNum = scanner.nextInt();
//			System.out.println("두");
//			int SecondNum = scanner.nextInt();
//			int result = firstNum + SecondNum;
//		}
		
		
	}
}
