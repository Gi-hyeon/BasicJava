package chapter03;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초 : ");
		int programming = scanner.nextInt();
		System.out.print("데이터베이스 : ");
		int database = scanner.nextInt();
		System.out.print("화면 구현 : ");
		int display = scanner.nextInt();
		System.out.print("애플리케이션 구현 : ");
		int application = scanner.nextInt();
		System.out.print("머신러닝 : ");
		int machine = scanner.nextInt();
		
		int total = programming + database + display + application + machine;
		double avg = (double)total / 5;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f", avg);
		if(avg >= 90) {
			System.out.println("학점 : A");
		} else if(avg >= 80 && avg < 90) {
			System.out.println("학점 : B");
		} else if(avg >= 70 && avg < 80) {
			System.out.println("학점 : C");
		} else if(avg >= 60 && avg < 70) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
	}
}
