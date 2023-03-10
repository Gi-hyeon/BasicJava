package chapter03;

import java.util.Scanner;

public class Arrangement {
	public static void main(String[] args) {
//		int[][] array3 = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
//		System.out.println(array3.length);  //3
//		System.out.println(array3[2].length);  //5
//		
//		
//		
//		int max4 = 0;
//		int[] array4 = {1, 5, 3, 8, 2};
//		for(int i=0; i<array4.length; i++) {
//			if(array4[i] > max4) {
//				max4 = array4[i];
//			}
//		}
//		System.out.println("max: " + max4);
//		
//		  
//		
//		int[][] array5 = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
//		int sum5 = 0;
//		double avg5 = 0.0;
//		int count5 = 0;
//		
//		for(int i=0; i< array5.length; i++) {
//			for(int j=0; j<array5[i].length; j++) {
//				sum5 += array5[i][j]; 
//				count5++;
//			}
//		}
//		avg5 = (double)sum5 / count5;
//		
//		System.out.println("sum: " + sum5);
//		System.out.println("avg: " + avg5);
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run){
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int SelectNo = scanner.nextInt();
			
			if(SelectNo == 1) {
				System.out.print("선택> ");
				studentNum = scanner.nextInt();
				System.out.printf("학생수> %d\n", studentNum);
				scores = new int[studentNum];
			} else if(SelectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = scanner.nextInt();
				}
			} else if(SelectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			} else if(SelectNo == 4) {
				int sum = 0;
				int count = 0;
				int max = 0;
				double avg = 0.0;
				for(int i=0; i<studentNum; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
					count++;
				}
				avg = (double)sum/count;
				System.out.printf("최고 점수: %d\n", max);
				System.out.printf("평균 점수: %f\n", avg);
			} else if(SelectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
		
		scanner.close();
	}
}
