import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		int total = 0;
		
		double pi = Math.PI;
		System.out.printf("%f", pi);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수 : ");
		int won500 = scanner.nextInt();
		
		System.out.print("100원짜리 동전의 갯수 : ");
		int won100 = scanner.nextInt();
		
		System.out.print("50원짜리 동전의 갯수 : ");
		int won50 = scanner.nextInt();
		
		System.out.print("10원짜리 동전의 갯수 : ");
		int won10 = scanner.nextInt();
		
		total = (won500*500) + (won100*100) + (won50*50) + (won10*10);
		System.out.printf("저금통 안의 동전의 총 액수 : %d", total);
		
		scanner.close();
	}
}
