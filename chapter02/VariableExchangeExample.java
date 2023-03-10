package chapter02;
import java.util.Scanner;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x:" + x + ", y:" + y);
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int score[] = new int[count];
		
		for(int i=0; i<count; i++) {
			score[i] = scan.nextInt();
		}
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length-i-1; j++) {
				if(score[j] > score[j+1]) {
					int temp1 = score[j];
					score[j] = score[j+1];
					score[j+1] = temp1;
				}
			}
		}
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1 + "번째 숫자 : " + score[i]);
		}
		scan.close();
	}
}
