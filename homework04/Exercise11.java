package homework04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		Scanner scanner = null;
		
		int result = 0;
		
//		while(true) {
//			try {
//				System.out.print("어떤 수를 나누시겠습니까?>>");
//				int firstNum = scanner.nextInt();
//				System.out.print("어떤 수를 나누시겠습니까?>>");
//				int secondNum = scanner.nextInt();
//				result = firstNum / secondNum;
//			} catch (InputMismatchException e) {
//				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//				scanner.next();
//			} catch (ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
//			}finally {
//				if(!(result == 0)) {
//				System.out.println(result);
//				scanner.close();
//				return;
//				}
//			}
//		}
//		--------------------------------------------------
		while(true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>>");
				int firstNum = Integer.parseInt(scanner.nextLine());
				System.out.print("어떤 수를 나누시겠습니까?>>");
				int secondNum = Integer.parseInt(scanner.nextLine());
				result = firstNum / secondNum;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
			}finally {
				if(!(result == 0)) {
				System.out.println(result);
				scanner.close();
				break;
				}
			}
		}
	}
}
