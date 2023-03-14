package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
		Random random = new Random();
		
//		int ranNum1 = random.nextInt(6) + 1;
//		int ranNum2 = random.nextInt(6) + 1;
//		int ranNum3 = random.nextInt(6) + 1;
//		int ranNum4 = random.nextInt(6) + 1;
//		int ranNum5 = random.nextInt(6) + 1;
//		int ranNum6 = random.nextInt(6) + 1;
//		int ranNum7 = random.nextInt(6) + 1;
//		int ranNum8 = random.nextInt(6) + 1;
//		
//		System.out.println(ranNum1);
//		System.out.println(ranNum2);
//		System.out.println(ranNum3);
//		System.out.println(ranNum4);
//		System.out.println(ranNum5);
//		System.out.println(ranNum6);
//		System.out.println(ranNum7);
//		System.out.println(ranNum8);
		
		for(int i=0; i<=8; i++) {
			System.out.println(random.nextInt(6)+1);
		}
		
		int num = random.nextInt(5) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("3번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("4번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		
		int sNum = random.nextInt(5) + 1;
		
		switch (sNum) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		
		int time = random.nextInt(4) + 8;
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
		char grade = 'B';
		
		switch (grade) {
		case 'A':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
			break;
		}
		
		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;	
		default:
			System.out.println("300만원");
		}
	}
}
