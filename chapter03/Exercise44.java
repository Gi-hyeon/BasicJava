package chapter03;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임!");
		
		System.out.print("철수 : ");
		String human1 = scanner.nextLine();
		System.out.print("영희 : ");
		String human2 = scanner.nextLine();
		
		if(human1.equals("가위")) {
			System.out.println((human2.equals("보")) ? "결과 : 철수 승리!" : (human2.equals("바위"))?"결과 : 영희 승리!" :"결과 : 비김" );
		} else if(human1.equals("바위")) {
			System.out.println((human2.equals("가위")) ? "결과 : 철수 승리!" : (human2.equals("보"))?"결과 : 영희 승리!" :"결과 : 비김" );
		} else {
			System.out.println((human2.equals("바위")) ? "결과 : 철수 승리!" : (human2.equals("가위"))?"결과 : 영희 승리!" :"결과 : 비김" );
		}
		
		//--------------------------------------------시험문제 --------------------------------------------------------------------
		String result = "";
		if(human1.equals(human2)) {
			result = "비겼습니다!";
		} else if(human1.equals("가위") && human2.equals("바위")||human1.equals("바위") && human2.equals("보")||human1.equals("보") && human2.equals("가위")) {
			result = "영희 승리";
		} else {
			result = "철수 승리!";
		}
		System.out.println("결과: " + result);
		scanner.close();
		//---------------------------------시험문제---------------------------------------------------
		
		
		
		
		
		
	}
}
