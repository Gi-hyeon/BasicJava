package chapter05;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			

			
			if(selectNo == 1) {
				System.out.print("학생 수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> %d\n", i+1, scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<studentNum; i++) {
					sum += scores[i];
					avg = (double)sum/studentNum;
					if(scores[i] > max) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selectNo == 5) {
				run = false;
			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
