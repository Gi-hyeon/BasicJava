package backjun;

import java.util.Scanner;

public class LeafYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int leafYear = scanner.nextInt();
		
		System.out.println((leafYear%400==0)||(leafYear%4==0 && !(leafYear%100==0)) ? 1 : 0 );
		
		scanner.close();
	}
}
