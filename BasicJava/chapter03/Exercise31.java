package chapter03;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int firstNum = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int secondNum = scanner.nextInt();

		int big = ((firstNum+secondNum) + Math.abs(firstNum-secondNum))/2;
		int small = ((firstNum+secondNum) - Math.abs(firstNum-secondNum))/2;
		
		int quotient = big / small;
		int remainder = big % small;
		
		System.out.println("큰 수를 작은 수로 나눈 몫은"+quotient+"이고, 나머지는"+remainder+ "이다.");
	}
}
