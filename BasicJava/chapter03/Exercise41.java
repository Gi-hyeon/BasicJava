package chapter03;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int firstLength = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int secondLength = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int thirdLength = scanner.nextInt();
		
		if(firstLength > secondLength && firstLength > thirdLength) {
			System.out.println((firstLength < secondLength+thirdLength)?"삼각형을 만들 수 있습니다.":"삼각형을 만들 수 없습니다.");
		} else if(secondLength > firstLength && secondLength > thirdLength) {
			System.out.println((secondLength < firstLength+thirdLength)?"삼각형을 만들 수 있습니다.":"삼각형을 만들 수 없습니다.");
		} else {
		System.out.println((thirdLength < firstLength+secondLength)?"삼각형을 만들 수 있습니다.":"삼각형을 만들 수 없습니다.");
		}
	}
}