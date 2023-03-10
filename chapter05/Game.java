package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		int randomVal = random.nextInt(3);
		
		
		String[] computer = null;
		computer = new String[] {"가위", "바위", "보"};
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String human = scanner.nextLine();
		System.out.printf("게이머: " + human);
		System.out.println("\n인공지능 컴퓨터:" + computer[randomVal]);
		
		if(human.equals(computer[randomVal])) {
			System.out.println("결과: 비겼습니다.");
		} else if(human.equals("가위")&&computer[randomVal].equals("보")||human.equals("바위")&&computer[randomVal].equals("가위")|| human.equals("보")&&computer[randomVal].equals("바위")){
			System.out.println("결과: 게이머 승리");
		} else {
			System.out.println("결과: 인공지능 컴퓨터 승리");
		}
	}
}
